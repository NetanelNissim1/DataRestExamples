package eyecon.db.api.controllers;

import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
import eyecon.db.api.entities.Names;
import eyecon.db.api.info.NamesInfo;
import eyecon.db.api.service.INamesService;

@RestController
@RequestMapping("name")
public class NamesController {

	private static final Logger log = LoggerFactory.getLogger(NamesController.class);

	@Autowired
	private INamesService namesService;

	@PostMapping(value = "addName")
	public ResponseEntity<Void> addName(@RequestBody NamesInfo nameInfo, UriComponentsBuilder builder) {

		Names name = new Names();
		BeanUtils.copyProperties(nameInfo, name);
		namesService.addName(name);
		log.debug(name.toString());
		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(builder.path("name/addName/{cli}").buildAndExpand(name.getCli()).toUri());

		return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}

	@GetMapping(value = "names")
	public ResponseEntity<List<NamesInfo>> getAllNames() {

		List<NamesInfo> responseNameList = new ArrayList<>();
		List<Names> nameList = namesService.getAllNames();

		for (Names name : nameList) {
			NamesInfo ob = new NamesInfo();
			// log.debug(name.toString());
			BeanUtils.copyProperties(name, ob);
			responseNameList.add(ob);
		}

		return new ResponseEntity<List<NamesInfo>>(responseNameList, HttpStatus.OK);
	}

	@GetMapping(value = "getNameByCli/{cli}")
	public ResponseEntity<List<NamesInfo>> getNameByCli(@PathVariable("cli") String cli) {

		List<Names> nameList = namesService.getByCli(cli);
		List<NamesInfo> responseName = new ArrayList<>();

		for (Names name : nameList) {
			NamesInfo ob = new NamesInfo();
			log.debug(name.toString());
			// System.out.println(user.getCli());

			BeanUtils.copyProperties(name, ob);
			responseName.add(ob);
		}
		return new ResponseEntity<List<NamesInfo>>(responseName, HttpStatus.OK);
	}

	@DeleteMapping(value = "deletebycli/{cli}")
	public String deleteName(@PathVariable("cli") String cli) {
		return namesService.delete(cli);
	}
}
