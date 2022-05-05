package com.iot.nxt.service.interfaces;

import java.util.List;

import com.iot.nxt.entity.DemoEntity;

public interface IDemoService {
	
	public List<DemoEntity> getDemoData();

	Integer getUpdateDemoData(Long id, String name);

	DemoEntity getDataForOne(Long id);

}
