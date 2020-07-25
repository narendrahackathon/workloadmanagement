package com.wawa.hcl.workloadmanagement.station;

import org.springframework.beans.factory.annotation.Autowired;

import com.wawa.hcl.workloadmanagement.dao.Item;
import com.wawa.hcl.workloadmanagement.service.WorkLoadService;

public class StationImpl implements Station {

	@Autowired
	WorkLoadService wls;

	@Override
	public void process(Item item) {
		item.setItem_status("PROCESSED");
//		wls.saveItem(item);

	}

}
