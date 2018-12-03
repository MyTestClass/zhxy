package com.xiaochen.service.idleobject.service;

import java.util.List;

import com.xiaochen.dao.idleobject.model.IdleObjectDealModel;
import com.xiaochen.dao.idleobject.model.IdleObjectTypeModel;

/**
 * TODO:闲置物品交易
 * @author:KangYong 2018年12月3日 下午9:32:18
 */
public interface IdleObjectDealService {
	/**
	 * TODO:查询闲置物品信息，只是简略的信息
	 * @param idleObjectName 闲置物品的名称
	 * @return
	 * @author:KangYong  下午9:56:19 
	 */
	List<IdleObjectTypeModel> getIdleObjectByName(String idleObjectName);
	
	/**
	 * TODO:根据闲置物品的类型进行查询
	 * @param idleObjectType
	 * @return
	 * @author:KangYong  下午9:59:47 
	 */
	List<IdleObjectTypeModel> getIdleObjectByType(String idleObjectType);
	
	/**
	 * TODO:根据地区来获取闲置物品（一般这个地区就是学校）
	 * @param place
	 * @return
	 * @author:KangYong  下午10:00:24 
	 */
	List<IdleObjectTypeModel> getIdleObjectByPlace(String place);
	
	/**
	 * TODO:获取闲置物品的详细信息
	 * @param idleObjectId 闲置物品的id
	 * @return
	 * @author:KangYong  下午9:56:29 
	 */
	IdleObjectTypeModel getIdleObjectDetailById(Integer idleObjectId);
	
	/**
	 * TODO:闲置物品交易
	 * @param idleObjectDealModel 闲置物品交易数据模型
	 * @author:KangYong  下午9:58:29 
	 */
	void dealIdleObject(IdleObjectDealModel idleObjectDealModel);
	
	
	/**
	 * TODO:取消闲置物品交易，这里仅仅是修改状态，然后需要对方同意
	 * @param idleObjectDealId
	 * @author:KangYong  下午10:03:26 
	 */
	void cancelDealIdleObject(Integer idleObjectDealId);
	
}
