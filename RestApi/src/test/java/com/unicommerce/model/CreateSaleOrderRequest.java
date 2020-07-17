package com.unicommerce.model;

public class CreateSaleOrderRequest {
	private WsSaleOrder saleOrder;

	public CreateSaleOrderRequest(WsSaleOrder saleorder2) {
		this.saleOrder = saleorder2;
	}

	

	public WsSaleOrder getSaleOrder() {
		return saleOrder;
	}


	public void setSaleOrder(WsSaleOrder saleOrder) {
		this.saleOrder = saleOrder;
	}
	
	
}
