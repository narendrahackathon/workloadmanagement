package com.wawa.hcl.workloadmanagement.consolidate;

import com.wawa.hcl.workloadmanagement.entity.Order;

public interface Consolidator {
	
	public void consolidate(Order order);

}
