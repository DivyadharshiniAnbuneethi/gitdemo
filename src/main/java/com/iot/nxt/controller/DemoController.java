package com.iot.nxt.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.iot.nxt.entity.DemoEntity;
import com.iot.nxt.repository.DemoEntityRepository;
import com.iot.nxt.service.interfaces.IDemoService;
import com.iot.nxt.to.response.DemoResponse;
import com.iot.nxt.util.Util;

@RestController
public class DemoController {
	
	@Autowired
	private IDemoService demoService;
	
	
	@GetMapping("/demo/getAll")
	public DemoResponse demoMethod1() {
		DemoResponse response = new DemoResponse();
		List<DemoEntity> demoObjList = demoService.getDemoData();
		
		if(!Util.isNull(demoObjList)) {
			response.setDemoObjList(demoObjList);
		}
		
		response.setResponseCode("200");
		response.setResponseMessage("Data retrierved successfully!");
		return response;
	}
	
	@GetMapping("/demo/getOne/{id}")
	public DemoResponse demoMethod2(@PathVariable Long id) {
		DemoResponse response = new DemoResponse();
		DemoEntity demoObj = demoService.getDataForOne(id);
		if(!Util.isNull(demoObj)) {
			response.setDemoObj(demoObj);
			response.setResponseCode("200");
			response.setResponseMessage("Data retrierved successfully!");
		} else {
			response.setResponseCode("400");
			response.setResponseMessage("No record found!");
		}
		return response;
	}
	
	@PutMapping("/demo/update")
	public String demoUpdate(@RequestBody DemoEntity entity) {
		Integer num = demoService.getUpdateDemoData(entity.getId(), entity.getName());
		return "Update done! "+ num;
	}
	
	
}
