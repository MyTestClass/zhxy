package com.xiaochen.dao.idleobject.mapper;

import java.util.Date;
import java.util.List;

import com.xiaochen.dao.idleobject.model.PurchaseIdleObjectModel;

/**
 * TODO:购买的闲置物品
 * @author:KangYong 2018年12月2日 下午11:50:28
 */
public interface PurchasedIdleObjectMapper {
	/**
	 * TODO:获取自己已经购买的闲置物品
	 * @param userId
	 * @return
	 * @author:KangYong  下午9:08:46 
	 */
	List<PurchaseIdleObjectModel> getPurchasedIdleObjectByUserId(String userId);
	/**
	 * TODO:按照购买的时间来查询购买记录
	 * @param userId
	 * @param startTime
	 * @param endTime
	 * @return
	 * @author:KangYong  下午9:09:47 
	 */
	List<PurchaseIdleObjectModel> getPurchaseIdleObjectByTime(String userId,Date startTime,Date endTime);
	/**
	 * TODO:根据自己的交易是否完成来获取
	 * @param userId
	 * @param isFinish
	 * @return
	 * @author:KangYong  下午9:10:31 
	 */
	List<PurchaseIdleObjectModel> getPurchasedIdleObjectByIsFinish(String userId,Integer isFinish);
	
	/**
	 * TODO:根据闲置物品的id来获取详情
	 * @param userId
	 * @return
	 * @author:KangYong  下午9:20:01 
	 */
	List<PurchaseIdleObjectModel> getPurchaseIdleObjectDetailById(Integer idleObjectId);
	
	/**
	 * TODO:删除指定的购买记录
	 * @param idleObjectId
	 * @param userId
	 * @author:KangYong  下午9:11:31 
	 */
	void deletePurchasedIdleObjectById(Integer idleObjectId,String userId);
	
	/**
	 * TODO:完成闲置物品交易，这里就是修改状态并进行评价
	 * @param idleObjectId
	 * @author:KangYong  下午9:16:37 
	 */
	void finishPurchasedIdleObject(Integer idleObjectId);
	
	
	
}
