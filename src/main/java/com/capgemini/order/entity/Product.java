package com.capgemini.order.entity;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "products")
public class Product {

	@Id
	private int productid;
	private String productname;
	private double productcost;
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int productid, String productname, double productcost) {
		super();
		this.productid = productid;
		this.productname = productname;
		this.productcost = productcost;
	}
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public double getProductcost() {
		return productcost;
	}
	public void setProductcost(double productcost) {
		this.productcost = productcost;
	}
	@Override
	public String toString() {
		return "Product [productid=" + productid + ", productname=" + productname + ", productcost=" + productcost
				+ "]";
	}
	
	
}