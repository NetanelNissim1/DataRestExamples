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
import eyecon.db.api.entities.Picmatch;
import eyecon.db.api.info.PicmatchInfo;
import eyecon.db.api.service.IPicmatchService;

@RestController
@RequestMapping("picmatch")
public class PicmatchController {

	@Autowired
	private IPicmatchService picmatchService;

	@PostMapping(value = "addPicmatch")
	public ResponseEntity<Void> addPicmatch(@RequestBody PicmatchInfo picmatchInfo, UriComponentsBuilder builder) {

		Picmatch picmatch = new Picmatch();
		BeanUtils.copyProperties(picmatchInfo, picmatch);
		picmatchService.addPicmatch(picmatch);

		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(builder.path("picmatch/addPicmatch/{cli}").buildAndExpand(picmatch.getCli()).toUri());

		return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}

	@GetMapping(value = "picmatchs")
	public ResponseEntity<List<PicmatchInfo>> getAllPicmatch() {

		List<PicmatchInfo> responsePicmatchList = new ArrayList<>();
		List<Picmatch> picmatchList = picmatchService.getAllPicmatch();
		for (Picmatch picmatch : picmatchList) {
			PicmatchInfo ob = new PicmatchInfo();
			BeanUtils.copyProperties(picmatch, ob);
			responsePicmatchList.add(ob);
		}
		return new ResponseEntity<List<PicmatchInfo>>(responsePicmatchList, HttpStatus.OK);
	}

	@GetMapping(value = "getpicmatchbycli/{cli}")
	public ResponseEntity<List<PicmatchInfo>> getPicmatchByCli(@PathVariable("cli") String cli) {

		List<PicmatchInfo> responsePicmatchList = new ArrayList<>();
		List<Picmatch> picmatchList = picmatchService.getByCli(cli);
		for (Picmatch picmatch : picmatchList) {
			PicmatchInfo ob = new PicmatchInfo();
			BeanUtils.copyProperties(picmatch, ob);
			responsePicmatchList.add(ob);
		}
		return new ResponseEntity<List<PicmatchInfo>>(responsePicmatchList, HttpStatus.OK);
	}

	@GetMapping(value = "getpicmatchbycliandstype/{cli}/{stype}")
	public ResponseEntity<List<PicmatchInfo>> getPicmatchByCliAndStype(@PathVariable("cli") String cli,
			@PathVariable("stype") int stype) {

		List<PicmatchInfo> responsePicmatchList = new ArrayList<>();
		List<Picmatch> picmatchList = picmatchService.getByCliAndStype(cli, stype);
		for (Picmatch picmatch : picmatchList) {
			PicmatchInfo ob = new PicmatchInfo();
			BeanUtils.copyProperties(picmatch, ob);
			responsePicmatchList.add(ob);
		}
		return new ResponseEntity<List<PicmatchInfo>>(responsePicmatchList, HttpStatus.OK);
	}

	@GetMapping(value = "getpicmatchbycliandstypeandsid/{cli}/{stype}/{sid}")
	public ResponseEntity<PicmatchInfo> getPicmatchByCliAndStypeAndSid(@PathVariable("cli") String cli,
			@PathVariable("stype") int stype, @PathVariable("sid") String sid) {

		PicmatchInfo responsePicmatch = new PicmatchInfo();
		Picmatch picmatch = picmatchService.getByCliAndStypeAndSid(cli, stype, sid);
		BeanUtils.copyProperties(picmatch, picmatch);
		return new ResponseEntity<PicmatchInfo>(responsePicmatch, HttpStatus.OK);
	}

	@DeleteMapping(value = "deletebycli/{cli}")
	public String deletePicmatchByCli(@PathVariable("cli") String cli) {
		return picmatchService.delete(cli);
	}

	@DeleteMapping(value = "deletebycliandstype/{cli}/{stype}")
	public String deletePicmatchByCliAndStype(@PathVariable("cli") String cli, @PathVariable("stype") int stype) {
		return picmatchService.deleteByCliAndStype(cli, stype);
	}

	@DeleteMapping(value = "deletebycliandstypeandsid/{cli}/{stype}/{sid}")
	public String deletePicmatchByCliAndStypeAndSid(@PathVariable("cli") String cli, @PathVariable("stype") int stype,
			@PathVariable("sid") String sid) {
		return picmatchService.deleteByCliAndStypeAndSid(cli, stype, sid);
	}
}
