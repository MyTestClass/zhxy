package com.xiaochen.dao.idleobject.enums;

/**
 * TODO:闲置物品的交易状态
 * 0-交易未完成
 * 1-交易已完成
 * 2-交易失败
 * 3-申请取消订单
 * @author:KangYong 2018年12月3日 下午9:49:59
 */
public enum IdlleObjectDealStatusEnum {
	FINISHED(0,"交易未完成"),UNFINISH(1,"交易已完成"),FAIL(2,"交易失败");
	private int status;
	private String msg;
	private IdlleObjectDealStatusEnum(int status,String msg) {
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
