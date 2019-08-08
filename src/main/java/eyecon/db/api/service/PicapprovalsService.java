package eyecon.db.api.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eyecon.db.api.dao.PicapprovalsRepository;
import eyecon.db.api.entities.Picapprovals;

@Service
public class PicapprovalsService implements IPicapprovalsService {

	@Autowired
	private PicapprovalsRepository picapprovalshRepository;

	@Override
	public List<Picapprovals> getAllPicapprovals() {
		List<Picapprovals> list = new ArrayList<>();
		picapprovalshRepository.findAll().forEach(e -> list.add(e));
		return list;
	}

	@Override
	public List<Picapprovals> getByCli(String cli) {
		List<Picapprovals> list = new ArrayList<>();
		picapprovalshRepository.findByCli(cli).forEach(e -> list.add(e));
		return list;
	}

	@Override
	public List<Picapprovals> getByCliAndContact(String cli, String contact) {
		List<Picapprovals> list = new ArrayList<>();
		picapprovalshRepository.findByCliAndContact(cli, contact).forEach(e -> list.add(e));
		return list;
	}

	@Override
	public Picapprovals getByCliAndContactAndTag(String cli, String contact, String tag) {
		return picapprovalshRepository.findByCliAndContactAndTag(cli, contact, tag);
	}

	@Override
	public String delete(String cli) {
		picapprovalshRepository.deleteAll(picapprovalshRepository.findByCli(cli));
		return "delete";
	}

	@Override
	public String deleteByCliAndContact(String cli, String contact) {
		picapprovalshRepository.deleteAll(picapprovalshRepository.findByCliAndContact(cli, contact));
		return "delete";
	}

	@Override
	public String deleteByCliAndContactAndTag(String cli, String contact, String tag) {
		picapprovalshRepository.delete(picapprovalshRepository.findByCliAndContactAndTag(cli, contact, tag));
		return "delete";
	}

	@Override
	public void addPicapproval(Picapprovals picapproval) {
		picapprovalshRepository.save(picapproval);
	}

}
