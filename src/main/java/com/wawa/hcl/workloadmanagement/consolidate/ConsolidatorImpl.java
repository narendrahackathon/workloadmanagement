package com.wawa.hcl.workloadmanagement.consolidate;

import org.springframework.beans.factory.annotation.Autowired;

import com.wawa.hcl.workloadmanagement.dao.Item;
import com.wawa.hcl.workloadmanagement.service.WorkLoadService;

public class ConsolidatorImpl implements Consolidator {

	@Autowired
	WorkLoadService wls;

	@Override
	public void consolidate(Item item) {
		// Check if all the items are "processed"
		wls.saveItem(item);
		// post message back.

	}
}
