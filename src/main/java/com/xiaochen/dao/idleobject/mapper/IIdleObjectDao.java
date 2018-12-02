package com.xiaochen.dao.idleobject.mapper;

import java.util.List;

import com.xiaochen.dao.idleobject.model.IdleObjectModel;

public interface IIdleObjectDao {
	//搜索
	List<IdleObjectModel> searchByType(String type,int index,int length);
	List<IdleObjectModel> searchByName(String name,int index,int length);
	
	//发送者获取
	List<IdleObjectModel> getByIsSell(char issell,int userid,int index,int length);
	List<IdleObjectModel> getAllByUserId(int userid,int index,int length);
	
	void publishIdleObject(IdleObjectModel idleobject);
	int deleteIdleObject(int idleobjectid,int userid);
}
