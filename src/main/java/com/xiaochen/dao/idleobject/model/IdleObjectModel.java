package com.xiaochen.dao.idleobject.model;

/**
 * 闲置物品
 * @author 陈康勇
 *
 */

public class IdleObjectModel {
	private int userid;
	private int idleobjectid;
	private String idleobjectname;
	private String describle;
	private String datetime;
	private char issell;
	private String price;
	//也就是货物所在地，APP应该提供默认的地址供用户选择
	private String place;
	private String imageurls;
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public int getIdleobjectid() {
		return idleobjectid;
	}
	public void setIdleobjectid(int idleobjectid) {
		this.idleobjectid = idleobjectid;
	}
	public String getIdleobjectname() {
		return idleobjectname;
	}
	public void setIdleobjectname(String idleobjectname) {
		this.idleobjectname = idleobjectname;
	}
	public String getDatetime() {
		return datetime;
	}
	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}
	public char getIssell() {
		return issell;
	}
	public void setIssell(char issell) {
		this.issell = issell;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
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
	public String getImageurls() {
		return imageurls;
	}
	public void setImageurls(String imageurls) {
		this.imageurls = imageurls;
	}
}
