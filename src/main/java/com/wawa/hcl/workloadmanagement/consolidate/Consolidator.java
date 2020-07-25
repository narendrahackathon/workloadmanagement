package com.wawa.hcl.workloadmanagement.consolidate;

import com.wawa.hcl.workloadmanagement.dao.OrderItem;

public interface Consolidator {

	public void consolidate(OrderItem order);

}
