package com.xiaochen.service.idleobject.service.impl;

import java.util.List;

import com.xiaochen.dao.idleobject.mapper.IdleObjectDealMapper;
import com.xiaochen.dao.idleobject.model.IdleObjectDealModel;
import com.xiaochen.dao.idleobject.model.IdleObjectTypeModel;

/**
 * TODO:闲置物品交易实现
 * @author:KangYong 2018年12月3日 下午10:17:59
 */
public class IdleObjectDealServiceImpl implements IdleObjectDealMapper{

	@Override
	public List<IdleObjectTypeModel> getIdleObjectByName(String idleObjectName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<IdleObjectTypeModel> getIdleObjectByType(String idleObjectType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<IdleObjectTypeModel> getIdleObjectByPlace(String place) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IdleObjectTypeModel getIdleObjectDetailById(Integer idleObjectId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void dealIdleObject(IdleObjectDealModel idleObjectDealModel) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cancelDealIdleObject(Integer idleObjectDealId) {
		// TODO Auto-generated method stub
		
	}

}
