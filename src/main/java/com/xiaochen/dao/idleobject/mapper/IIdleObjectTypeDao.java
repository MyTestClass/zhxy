package com.xiaochen.dao.idleobject.mapper;

import java.util.List;

import com.xiaochen.dao.idleobject.model.IdleObjectTypeModel;

/**
 * TODO:管理闲置物品的类型
 * @author:KangYong 2018年12月2日 下午11:20:33
 */
public interface IIdleObjectTypeDao {
	/**
	 * TODO:插入闲置物品的类型
	 * @param idleObjectTypeModel
	 * @author:KangYong  下午11:48:21 
	 */
	void insertIdleObjectType(IdleObjectTypeModel idleObjectTypeModel);
	/**
	 * TODO:删除闲置物品的类型
	 * @param idleObjectTypeId
	 * @author:KangYong  下午11:48:31 
	 */
	void deleteIdleObjectType(Integer idleObjectTypeId);
	/**
	 * TODO:更新闲置物品的类型
	 * @param idleObjectTypeModel
	 * @author:KangYong  下午11:48:40 
	 */
	void updateIdleObjectType(IdleObjectTypeModel idleObjectTypeModel);
	/**
	 * TODO:获取所有的闲置物品类型
	 * @return
	 * @author:KangYong  下午11:48:50 
	 */
	List<IdleObjectTypeModel> getAllType();
	
}
