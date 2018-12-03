package com.xiaochen.dao.idleobject.mapper;

import java.util.Date;
import java.util.List;

import com.xiaochen.dao.idleobject.model.PurchaseIdleObjectModel;

/**
 * TODO:购买的闲置物品
 * @author:KangYong 2018年12月2日 下午11:50:28
 */
public interface IPurchaseIdleObjectDao {
	List<PurchaseIdleObjectModel> getPurchaseIdleObjectByUserId(String userId);
	List<PurchaseIdleObjectModel> getPurchaseIdleObjectByTime(Date startTime,Date endTime);
	List<PurchaseIdleObjectModel> getPurchaseIdleObjectByIsFinish(String userId,Integer isFinish);
	
	void deletePurchaseIdleObjectById(Integer idleObjectId,String userId);
	
	void finishPurchaseIdleObject(Integer idleObjectId);
	
}
