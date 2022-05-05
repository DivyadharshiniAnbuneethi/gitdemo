package com.iot.nxt.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iot.nxt.entity.DemoEntity;
import com.iot.nxt.repository.DemoEntityRepository;
import com.iot.nxt.service.interfaces.IDemoService;

@Service
public class DemoServiceImpl implements IDemoService {

	@Autowired
	private DemoEntityRepository demoEntityRepository;
	
	@Override
	public List<DemoEntity> getDemoData() {
		return demoEntityRepository.getDemoData();
	}
	
	@Override
	public Integer getUpdateDemoData(Long id,String name) {
		return demoEntityRepository.getUpdateDemoData(id,name);
	}

	@Override
	public DemoEntity getDataForOne(Long id) {
		return demoEntityRepository.findById(id).orElse(null);
	}
	
}
