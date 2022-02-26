package com.pro;

public class prod {
	String Id;
	String name;
	String price;
	String date;
	
	public prod(String id, String name, String price, String date) {
		this.Id = id;
		this.name = name;
		this.price = price;
		this.date = date;
	}
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}

}
