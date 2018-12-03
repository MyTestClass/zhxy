package com.xiaochen.dao.idleobject.model;

import java.util.Date;

import lombok.Data;

/**
 * TODO:闲置物品交易数据模型
 * @author:KangYong 2018年12月3日 下午9:41:03
 */
@Data
public class IdleObjectDealModel {
	/**
	 * 交易的id
	 */
	private Integer idleObjectDealId;
	/**
	 * 卖方id
	 */
	private String sellerId;
	/**
	 * 买方id
	 */
	private String buyerId;
	/**
	 * 闲置物品id
	 */
	private Integer idleObjectId;
	/**
	 * 交易的起始时间
	 */
	private Date startTime;
	/**
	 * 交易终止时间
	 */
	private Date endTime;
	/**
	 * 交易的状态，有未完成、已完成、已失败、申请取消订单
	 */
	private Integer isFinished;
	/**
	 * 评论
	 */
	private String comment;
	/**
	 * 交易的地点
	 */
	private String place;
}
