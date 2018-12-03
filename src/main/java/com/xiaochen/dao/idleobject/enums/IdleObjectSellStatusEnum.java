package com.xiaochen.dao.idleobject.enums;

/**
 * TODO:闲置物品是否已经售出
 * @author:KangYong 2018年12月2日 下午11:10:10
 */
public enum IdleObjectSellStatusEnum {
	HAVE_SOLD(0,"已销售"),NOT_SOLD(1,"未销售");
	private int status;
	private String msg;
	private IdleObjectSellStatusEnum(int status,String msg) {
		this.status = status;
		this.msg = msg;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
}
