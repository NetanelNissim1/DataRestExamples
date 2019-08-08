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
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;
import eyecon.db.api.entities.Picapprovals;
import eyecon.db.api.info.PicapprovalsInfo;
import eyecon.db.api.service.IPicapprovalsService;

@RestController
@RequestMapping("picapproval")
public class PicapprovalsController {

	@Autowired
	private IPicapprovalsService picapprovalsService;

	@PutMapping(value = "addPicapproval")
	public ResponseEntity<Void> addPicapproval(@RequestBody PicapprovalsInfo picmatchInfo, UriComponentsBuilder builder) {

		Picapprovals picapproval = new Picapprovals();
		BeanUtils.copyProperties(picmatchInfo, picapproval);
		picapprovalsService.addPicapproval(picapproval);

		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(builder.path("picapproval/addPicapproval/{cli}").buildAndExpand(picapproval.getCli()).toUri());

		return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}

	@GetMapping(value = "picapprovals")
	public ResponseEntity<List<PicapprovalsInfo>> getAllPicapprovals() {

		List<PicapprovalsInfo> responsePicapprovalList = new ArrayList<>();
		List<Picapprovals> picapprovalList = picapprovalsService.getAllPicapprovals();
		for (Picapprovals picapproval : picapprovalList) {
			PicapprovalsInfo ob = new PicapprovalsInfo();
			BeanUtils.copyProperties(picapproval, ob);
			responsePicapprovalList.add(ob);
		}
		return new ResponseEntity<List<PicapprovalsInfo>>(responsePicapprovalList, HttpStatus.OK);
	}

	@GetMapping(value = "getbycli/{cli}")
	public ResponseEntity<List<PicapprovalsInfo>> getPicapprovalsByCli(@PathVariable("cli") String cli) {

		List<PicapprovalsInfo> responsePicapprovalList = new ArrayList<>();
		List<Picapprovals> picapprovalsList = picapprovalsService.getByCli(cli);
		for (Picapprovals picapproval : picapprovalsList) {
			PicapprovalsInfo ob = new PicapprovalsInfo();
			BeanUtils.copyProperties(picapproval, ob);
			responsePicapprovalList.add(ob);
		}
		return new ResponseEntity<List<PicapprovalsInfo>>(responsePicapprovalList, HttpStatus.OK);
	}

	@GetMapping(value = "getbycliandcontact/{cli}/{contact}")
	public ResponseEntity<List<PicapprovalsInfo>> getPicapprovalsByCliAndStype(@PathVariable("cli") String cli,
			@PathVariable("contact") String contact) {

		List<PicapprovalsInfo> responsePicapprovalList = new ArrayList<>();
		List<Picapprovals> picapprovalList = picapprovalsService.getByCliAndContact(cli, contact);
		for (Picapprovals picapproval : picapprovalList) {
			PicapprovalsInfo ob = new PicapprovalsInfo();
			BeanUtils.copyProperties(picapproval, ob);
			responsePicapprovalList.add(ob);
		}
		return new ResponseEntity<List<PicapprovalsInfo>>(responsePicapprovalList, HttpStatus.OK);
	}

	@GetMapping(value = "getbycliandcontactandtag/{cli}/{contact}/{tag}")
	public ResponseEntity<PicapprovalsInfo> getPicapprovalByCliAndStypeAndSid(@PathVariable("cli") String cli,
			@PathVariable("contact") String contact, @PathVariable("tag") String tag) {

		PicapprovalsInfo responsePicapproval = new PicapprovalsInfo();
		Picapprovals picapproval = picapprovalsService.getByCliAndContactAndTag(cli, contact, tag);
		BeanUtils.copyProperties(picapproval, responsePicapproval);
		return new ResponseEntity<PicapprovalsInfo>(responsePicapproval, HttpStatus.OK);
	}

	@DeleteMapping(value = "deletebycli/{cli}")
	public String deletePicapprovalsByCli(@PathVariable("cli") String cli) {
		return picapprovalsService.delete(cli);
	}

	@DeleteMapping(value = "deletebycliandcontact/{cli}/{contact}")
	public String deletePicapprovalsByCliAndStype(@PathVariable("cli") String cli, @PathVariable("contact") String contact) {
		return picapprovalsService.deleteByCliAndContact(cli, contact);
	}

	@DeleteMapping(value = "deletebycliandcontactandtag/{cli}/{contact}/{tag}")
	public String deletePicapprovalByCliAndStypeAndSid(@PathVariable("cli") String cli, @PathVariable("contact") String contact,
			@PathVariable("tag") String tag) {
		return picapprovalsService.deleteByCliAndContactAndTag(cli, contact, tag);
	}
}
