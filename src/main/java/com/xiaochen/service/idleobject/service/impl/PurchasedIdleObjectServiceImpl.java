package com.xiaochen.service.idleobject.service.impl;

import java.util.Date;
import java.util.List;

import com.xiaochen.dao.idleobject.model.PurchaseIdleObjectModel;
import com.xiaochen.service.idleobject.service.PurchasedIdleObjectService;

/**
 * TODO:管理自己购买的闲置物品
 * @author:KangYong 2018年12月3日 下午10:21:43
 */
public class PurchasedIdleObjectServiceImpl implements PurchasedIdleObjectService{

	@Override
	public List<PurchaseIdleObjectModel> getPurchasedIdleObjectByUserId(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PurchaseIdleObjectModel> getPurchaseIdleObjectByTime(String userId, Date startTime, Date endTime) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PurchaseIdleObjectModel> getPurchasedIdleObjectByIsFinish(String userId, Integer isFinish) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PurchaseIdleObjectModel> getPurchaseIdleObjectDetailById(Integer idleObjectId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deletePurchasedIdleObjectById(Integer idleObjectId, String userId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void finishPurchasedIdleObject(Integer idleObjectId) {
		// TODO Auto-generated method stub
		
	}

}
