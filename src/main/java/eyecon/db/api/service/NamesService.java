package eyecon.db.api.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import eyecon.db.api.dao.NamesRepository;
import eyecon.db.api.entities.Names;

@Service
public class NamesService implements INamesService {

	@Autowired
	private NamesRepository namesRepository;

	@Override
	public void addName(Names name) {
		namesRepository.save(name);
	}

	@Override
	public List<Names> getAllNames() {
		List<Names> list = new ArrayList<>();
		Iterable<Names> findAll = namesRepository.findAll();
		for (Names name : findAll) {
			list.add(name);
		}
		return list;
	}

	@Override
	public List<Names> getByCli(String cli) {
		return namesRepository.findByCli(cli);
	}

	@Override
	public String delete(String cli) {
		List<Names> nameList = namesRepository.findByCli(cli);
		namesRepository.deleteAll(nameList);
		return "deleted";
	}

	@Override
	public String deleteByCliAndName(String cli, String name) {
		List<Names> nameList = namesRepository.findByCliAndName(cli, name);
		namesRepository.deleteAll(nameList);
		return "deleted";
	}

}
