package com.iot.nxt.to.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.iot.nxt.entity.DemoEntity;
import com.iot.nxt.util.NxtResponse;

/**
 * @author M1081905
 *
 */
@JsonInclude(Include.NON_NULL)
public class DemoResponse extends NxtResponse {
	
	private List<DemoEntity> demoObjList;
	private DemoEntity demoObj;
	
	public List<DemoEntity> getDemoObjList() {
		return demoObjList;
	}
	public void setDemoObjList(List<DemoEntity> demoObjList) {
		this.demoObjList = demoObjList;
	}
	public DemoEntity getDemoObj() {
		return demoObj;
	}
	public void setDemoObj(DemoEntity demoObj) {
		this.demoObj = demoObj;
	}

	
}
