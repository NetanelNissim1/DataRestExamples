package eyecon.db.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eyecon.db.api.entities.Srcpictype;
import eyecon.db.api.models.SrcpictypeRepository;

@Service
public class SrcPicTypeService implements ISrcPicTypeService {

	@Autowired
	private SrcpictypeRepository srcPicTypeRepository;

	@Override
	public void addOrUpdateSrcPicType(Srcpictype srcPictype) {
		
		srcPicTypeRepository.save(srcPictype);
		//srcPicTypeRepository.saveSrcPicType(cli);

	}

}
