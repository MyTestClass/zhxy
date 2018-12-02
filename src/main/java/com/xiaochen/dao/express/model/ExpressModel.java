package com.xiaochen.dao.express.model;

public class ExpressModel {
	private int userid;
	private int expressid;
	private String datetime;
	private String price;
	private String weight;
	//送达的地方
	private String place;
	private String describle;
	private String phonenumber;
	private String expresscompany;
	private char isHandle;
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public int getExpressid() {
		return expressid;
	}
	public void setExpressid(int expressid) {
		this.expressid = expressid;
	}
	public String getDatetime() {
		return datetime;
	}
	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getDescrible() {
		return describle;
	}
	public void setDescrible(String describle) {
		this.describle = describle;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getExpresscompany() {
		return expresscompany;
	}
	public void setExpresscompany(String expresscompany) {
		this.expresscompany = expresscompany;
	}
	public char getIsHandle() {
		return isHandle;
	}
	public void setIsHandle(char isHandle) {
		this.isHandle = isHandle;
	}
	
	
}
