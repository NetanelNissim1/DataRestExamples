package eyecon.db.api.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

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
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;
import eyecon.db.api.entities.Users;
import eyecon.db.api.info.UserInfo;
import eyecon.db.api.service.IUserService;

@RestController
@RequestMapping("user")
public class UsersController {

	private static final Logger log = LoggerFactory.getLogger(UsersController.class);

	@Autowired
	private IUserService userService;

	@PostMapping(value = "addUser")
	public ResponseEntity<Void> addUser(@RequestBody UserInfo userInfo, UriComponentsBuilder builder) {

		Users user = new Users();
		userInfo.setClientId(UUID.randomUUID().toString());
		BeanUtils.copyProperties(userInfo, user);
		userService.addUser(user);
		log.debug(user.toString());
		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(builder.path("/user/addUser/{clientId}").buildAndExpand(user.getClientId()).toUri());

		return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}

	@GetMapping(value = "users")
	public ResponseEntity<List<UserInfo>> getAllUsers() {
		List<UserInfo> responseUserList = new ArrayList<>();
		List<Users> userList = userService.findAll();
		for (Users user : userList) {
			UserInfo ob = new UserInfo();
			BeanUtils.copyProperties(user, ob);
			responseUserList.add(ob);
		}
		return new ResponseEntity<List<UserInfo>>(responseUserList, HttpStatus.OK);
	}

	@GetMapping(value = "getUserByCli/{cli}")
	public ResponseEntity<UserInfo> getUserByCli(@PathVariable("cli") String cli) {

		Users user = userService.findByCli(cli);
		UserInfo responseUser = new UserInfo();
		BeanUtils.copyProperties(user, responseUser);
		log.debug(user.toString());
		return new ResponseEntity<UserInfo>(responseUser, HttpStatus.OK);
	}

	@GetMapping(value = "getUserByClientId/{clientId}")
	public ResponseEntity<UserInfo> getUserByClientId(@PathVariable("clientId") String clientId) {

		Users user = userService.findByClientId(clientId);
		UserInfo responseUser = new UserInfo();
		BeanUtils.copyProperties(user, responseUser);
		log.debug(user.toString());
		return new ResponseEntity<UserInfo>(responseUser, HttpStatus.OK);
	}

	@GetMapping(value = "getUserByCliAndDeviceName/{cli}/{device_name}")
	public ResponseEntity<UserInfo> getUserByCliAndDeviceName(@PathVariable("cli") String cli,
			@PathVariable("device_name") String device_name) {

		Users blockUser = userService.findByCliCheckBlockUser(cli, device_name);
		UserInfo responseUser = new UserInfo();
		BeanUtils.copyProperties(blockUser, responseUser);
		log.debug(blockUser.toString());
		return new ResponseEntity<UserInfo>(responseUser, HttpStatus.OK);
	}

	@PutMapping(value = "onEyeconPicUpdated/{cli}")
	public ResponseEntity<Void> onEyeconPicUpdated(@PathVariable("cli") String cli) {
		
		
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

	@PutMapping(value = "updateUser")
	public ResponseEntity<UserInfo> saveOrUpdateUser(@RequestBody UserInfo userInfo, UriComponentsBuilder builder) {
		Users user = new Users();
		if (userInfo.getClientId().isEmpty())
			userInfo.setClientId(UUID.randomUUID().toString());
		BeanUtils.copyProperties(userInfo, user);
		userService.addUser(user);

		return new ResponseEntity<UserInfo>(userInfo, HttpStatus.OK);
	}

	@DeleteMapping(value = "delete/{clientId}")
	public String deleteUser(@PathVariable("clientId") String clientId) {
		return userService.delete(clientId);
	}
}
