package com.capgemini.order.entity;

public class LineItem {

	
	private int itemQuantity;
	private int productId;
	public LineItem() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LineItem( int itemQuantity, int productId) {
		super();
		this.itemQuantity = itemQuantity;
		this.productId = productId;
	}
	public int getItemQuantity() {
		return itemQuantity;
	}
	public void setItemQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	@Override
	public String toString() {
		return "LineItem [itemQuantity=" + itemQuantity + ", productId=" + productId + "]";
	}
	
	
}
