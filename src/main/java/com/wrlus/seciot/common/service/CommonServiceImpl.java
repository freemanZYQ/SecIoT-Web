package com.wrlus.seciot.common.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wrlus.seciot.common.dao.CommonMapper;
import com.wrlus.seciot.common.model.CVEDao;
import com.wrlus.seciot.common.model.PlatformRiskDao;
import com.wrlus.seciot.common.model.ThirdLibraryDao;
import com.wrlus.seciot.common.model.ThirdLibraryRiskDao;

@Service
public class CommonServiceImpl implements CommonService {
	
	@Autowired
	private CommonMapper dao;

	@Override
	public List<CVEDao> getCVEAll() {
		return dao.getCVEAll();
	}

	@Override
	public List<CVEDao> getCVEByNum(String cvenumber) {
		return dao.getCVEByNum(cvenumber);
	}

	@Override
	public List<CVEDao> getCVEByCategory(String category) {
		return dao.getCVEByCategory(category);
	}

	@Override
	public List<PlatformRiskDao> getPlatformRiskAll() {
		return dao.getPlatformRiskAll();
	}

	@Override
	public List<PlatformRiskDao> getPlatformRiskById(String id) {
		return dao.getPlatformRiskById(id);
	}

	@Override
	public List<PlatformRiskDao> getPlatformRiskByCategory(String category) {
		return dao.getPlatformRiskByCategory(category);
	}

	@Override
	public List<ThirdLibraryDao> getThirdLibraryAll() {
		return dao.getThirdLibraryAll();
	}

	@Override
	public List<ThirdLibraryDao> getThirdLibraryById(String id) {
		return dao.getThirdLibraryById(id);
	}

	@Override
	public List<ThirdLibraryRiskDao> getThirdLibraryRiskByLibname(String libname) {
		return dao.getThirdLibraryRiskByLibname(libname);
	}

	@Override
	public List<ThirdLibraryRiskDao> getThirdLibraryRiskById(String id) {
		return dao.getThirdLibraryRiskById(id);
	}

}
