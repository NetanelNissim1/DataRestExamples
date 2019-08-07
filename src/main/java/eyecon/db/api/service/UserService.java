package eyecon.db.api.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import eyecon.db.api.dao.UsersRepository;
import eyecon.db.api.entities.Users;

@Service
public class UserService implements IUserService {

	@Autowired
	private UsersRepository usersRepository;

	@Override
	public Users findByCli(String cli) {
		return usersRepository.findByCli(cli);
	}

	@Override
	public Users findByClientId(String clientId) {
		Users user = usersRepository.findByClientId(clientId);
		return user;
	}

	@Override
	public List<Users> findAll() {
		List<Users> list = new ArrayList<>();
		usersRepository.findAll().forEach(e -> list.add(e));
		return list;
	}

	@Override
	public Users findByCliCheckBlockUser(String cli, String device_name) {

		String res = usersRepository.findByCliCheckBlockUser(cli, device_name);
		Users user = new Users();
		String[] resSplited = res.split(",");
		if (resSplited.length == 7) {
			user.setClientId(resSplited[0]);
			user.setOsType(Integer.valueOf(resSplited[1]));
			user.setClientVerIncrement(Integer.valueOf(resSplited[2]));
			user.setBlockingReason(resSplited[3]);
			user.setLast_join_time(Long.valueOf(resSplited[4]));
			user.setIs_same_device_name(Boolean.valueOf(resSplited[5]));
			user.setIs_first_rejoin(Boolean.valueOf(resSplited[6]));
		}
		return user;
	}

	@Override
	public void addUser(Users user) {
		usersRepository.save(user);
	}

	@Override
	public String delete(String clientId) {
		Users user = usersRepository.getOne(clientId);
		usersRepository.delete(user);
		return "deleted";
	}

	@Override
	public void updateUserColumnNlikes(String cli) {
		usersRepository.updateUserColumnNlikes(cli);
	}

	@Override
	public String toBeNotifyQuery(String cli) {

		return usersRepository.toBeNotifyQuery(cli);
	}

}
