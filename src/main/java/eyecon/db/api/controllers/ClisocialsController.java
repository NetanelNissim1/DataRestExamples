package eyecon.db.api.controllers;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;
import eyecon.db.api.entities.Clisocials;
import eyecon.db.api.info.ClisocialsInfo;
import eyecon.db.api.service.IClisocialsService;

@RestController
@RequestMapping("clisocial")
public class ClisocialsController {

	@Autowired
	private IClisocialsService clisocialsService;

	@PostMapping(value = "addClisocial")
	public ResponseEntity<Void> addClisocial(@RequestBody ClisocialsInfo clisocialInfo, UriComponentsBuilder builder) {

		Clisocials picmatch = new Clisocials();
		BeanUtils.copyProperties(clisocialInfo, picmatch);
		clisocialsService.addClisocial(picmatch);

		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(builder.path("clisocial/addClisocial/{cli}").buildAndExpand(picmatch.getCli()).toUri());

		return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}

	@GetMapping(value = "clisocials")
	public ResponseEntity<List<ClisocialsInfo>> getAll() {

		List<ClisocialsInfo> responseClisocialList = new ArrayList<>();
		List<Clisocials> picmatchList = clisocialsService.getAllClisocials();
		for (Clisocials picmatch : picmatchList) {
			ClisocialsInfo ob = new ClisocialsInfo();
			BeanUtils.copyProperties(picmatch, ob);
			responseClisocialList.add(ob);
		}
		return new ResponseEntity<List<ClisocialsInfo>>(responseClisocialList, HttpStatus.OK);
	}

	@GetMapping(value = "getbycli/{cli}")
	public ResponseEntity<List<ClisocialsInfo>> getByCli(@PathVariable("cli") String cli) {

		List<ClisocialsInfo> responseClisocialList = new ArrayList<>();
		List<Clisocials> picmatchList = clisocialsService.getByCli(cli);
		for (Clisocials picmatch : picmatchList) {
			ClisocialsInfo ob = new ClisocialsInfo();
			BeanUtils.copyProperties(picmatch, ob);
			responseClisocialList.add(ob);
		}
		return new ResponseEntity<List<ClisocialsInfo>>(responseClisocialList, HttpStatus.OK);
	}

	@GetMapping(value = "getbycliandstype/{cli}/{stype}")
	public ResponseEntity<List<ClisocialsInfo>> getPicmatchByCliAndStype(@PathVariable("cli") String cli,
			@PathVariable("stype") int stype) {

		List<ClisocialsInfo> responseClisocialList = new ArrayList<>();
		List<Clisocials> picmatchList = clisocialsService.getByCliAndStype(cli, stype);
		for (Clisocials picmatch : picmatchList) {
			ClisocialsInfo ob = new ClisocialsInfo();
			BeanUtils.copyProperties(picmatch, ob);
			responseClisocialList.add(ob);
		}
		return new ResponseEntity<List<ClisocialsInfo>>(responseClisocialList, HttpStatus.OK);
	}

	@GetMapping(value = "getbycliandstypeandsid/{cli}/{stype}/{sid}")
	public ResponseEntity<ClisocialsInfo> getByCliAndStypeAndSid(@PathVariable("cli") String cli,
			@PathVariable("stype") int stype, @PathVariable("sid") String sid) {

		ClisocialsInfo responseClisocial = new ClisocialsInfo();
		Clisocials picmatch = clisocialsService.getByCliAndStypeAndSid(cli, stype, sid);
		BeanUtils.copyProperties(picmatch, picmatch);
		return new ResponseEntity<ClisocialsInfo>(responseClisocial, HttpStatus.OK);
	}

	@DeleteMapping(value = "deletebycli/{cli}")
	public String deleteByCli(@PathVariable("cli") String cli) {
		return clisocialsService.deleteByCli(cli);
	}

	@DeleteMapping(value = "deletebycliandstype/{cli}/{stype}")
	public String deleteByCliAndStype(@PathVariable("cli") String cli, @PathVariable("stype") int stype) {
		return clisocialsService.deleteByCliAndStype(cli, stype);
	}

	@DeleteMapping(value = "deletebycliandstypeandsid/{cli}/{stype}/{sid}")
	public String deleteByCliAndStypeAndSid(@PathVariable("cli") String cli, @PathVariable("stype") int stype,
			@PathVariable("sid") String sid) {
		return clisocialsService.deleteByCliAndStypeAndSid(cli, stype, sid);
	}
}
