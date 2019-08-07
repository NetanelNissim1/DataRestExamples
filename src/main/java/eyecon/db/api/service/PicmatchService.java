package eyecon.db.api.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eyecon.db.api.dao.PicmatchRepository;
import eyecon.db.api.entities.Picmatch;

@Service
public class PicmatchService implements IPicmatchService {

	@Autowired
	private PicmatchRepository picmatchRepository;

	@Override
	public void updateColumnFreshPicFrom(Picmatch picmatch) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addPicmatch(Picmatch picmatch) {
		picmatchRepository.save(picmatch);
	}

	@Override
	public List<Picmatch> getAllPicmatch() {
		// TODO Auto-generated method stub
		List<Picmatch> list = new ArrayList<Picmatch>();
		Iterable<Picmatch> findAll = picmatchRepository.findAll();
		for (Picmatch item : findAll) {
			list.add(item);
		}
		return list;
	}

	@Override
	public List<Picmatch> getByCli(String cli) {

		List<Picmatch> picmatchList = picmatchRepository.findByCli(cli);
		return picmatchList;
	}

	@Override
	public List<Picmatch> getByCliAndStype(String cli, int stype) {
		List<Picmatch> picmatchList = picmatchRepository.findByCliAndStype(cli, stype);
		return picmatchList;
	}

	@Override
	public Picmatch getByCliAndStypeAndSid(String cli, int stype, String sid) {
		Picmatch picmatch = picmatchRepository.findByCliAndStypeAndSid(cli, stype, sid);
		return picmatch;
	}

	@Override
	public String delete(String cli) {
		List<Picmatch> picmatchList = picmatchRepository.findByCli(cli);
		picmatchRepository.deleteAll(picmatchList);
		return "deleted";
	}

	@Override
	public String deleteByCliAndStype(String cli, int stype) {
		List<Picmatch> picmatchList = picmatchRepository.findByCliAndStype(cli, stype);
		picmatchRepository.deleteAll(picmatchList);
		return "deleted";
	}

	@Override
	public String deleteByCliAndStypeAndSid(String cli, int stype, String sid) {
		Picmatch picmatch = picmatchRepository.findByCliAndStypeAndSid(cli, stype, sid);
		picmatchRepository.delete(picmatch);
		return "deleted";
	}

}
