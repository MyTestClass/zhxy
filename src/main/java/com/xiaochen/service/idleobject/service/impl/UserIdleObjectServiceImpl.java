package com.xiaochen.service.idleobject.service.impl;

import java.util.List;

import com.xiaochen.dao.idleobject.model.IdleObjectModel;
import com.xiaochen.service.idleobject.service.UserIdleObjectService;

public class UserIdleObjectServiceImpl implements UserIdleObjectService{

	@Override
	public List<IdleObjectModel> getByIdleObjectType(String idleObjectType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<IdleObjectModel> getByIdleObjectName(String idleObjectIdName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<IdleObjectModel> getByIdleObjectPlace(String place) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<IdleObjectModel> getByIsSell(String userId, Integer isSell) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<IdleObjectModel> getAllByUserId(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IdleObjectModel getIdleObjectById(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IdleObjectModel getIdleObjectDetailById(Integer idleObjectId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updatedleObject(IdleObjectModel idleobject) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void publishIdleObject(IdleObjectModel idleobject) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int deleteBatchIdleObject(List<Integer> idleObjectIds) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteIdleObject(Integer idleObjectId, String userId) {
		// TODO Auto-generated method stub
		return 0;
	}

}
