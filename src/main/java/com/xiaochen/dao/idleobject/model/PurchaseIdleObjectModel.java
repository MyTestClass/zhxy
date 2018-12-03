package com.xiaochen.dao.idleobject.model;

import java.util.Date;

import lombok.Data;

/**
 * TODO:购买闲置物品的数据模型
 * @author:KangYong 2018年12月2日 下午11:53:28
 */
@Data
public class PurchaseIdleObjectModel {
	/**
	 * 购买的闲置物品
	 */
	private Integer idleObjectId;
	/**
	 * 买方
	 */
	private String purchaser;
	/**
	 * 卖方
	 */
	private String seller;
	/**
	 * 订单生成的时间
	 */
	private Date startTime;
	
	/**
	 * 确认收货的时间
	 */
	private Date endTime;
	/**
	 * 交易成交的金额
	 */
	private String money;
	
	/**
	 * 是否已经完成交易
	 */
	private Integer isFinished;
}
