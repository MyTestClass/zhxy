package com.xiaochen.service.idleobject.service;

import java.util.List;

import com.xiaochen.dao.idleobject.model.IdleObjectModel;

/**
 * TODO:用户管理自己的闲置物品
 * @author:KangYong 2018年12月2日 下午11:17:53
 */
public interface UserIdleObjectService {
	/**
	 * TODO:通过闲置物品的类型去查询
	 * @param idleObjectType
	 * @return
	 * @author:KangYong  下午11:11:18 
	 */
	List<IdleObjectModel> getByIdleObjectType(String idleObjectType);
	/**
	 * TODO:通过闲置物品的名称去查询
	 * @param idleObjectIdName
	 * @return
	 * @author:KangYong  下午11:11:40 
	 */
	List<IdleObjectModel> getByIdleObjectName(String idleObjectIdName);
	
	/**
	 * TODO:通过指定的地方来查询闲置物品
	 * @param place
	 * @return
	 * @author:KangYong  下午11:19:08 
	 */
	List<IdleObjectModel> getByIdleObjectPlace(String place);
	
	/**
	 * TODO:用户查找闲置物品
	 * @param isSell 是否已经卖出的
	 * @return
	 * @author:KangYong  下午11:11:59 
	 */
	List<IdleObjectModel> getByIsSell(String userId,Integer isSell);
	/**
	 * TODO:获取某个用户发布的所有闲置物品
	 * @param userId
	 * @return
	 * @author:KangYong  下午11:13:20 
	 */
	List<IdleObjectModel> getAllByUserId(String userId);
	/**
	 * TODO:通过指定的闲置物品id进行查找
	 * @param userId
	 * @return
	 * @author:KangYong  下午11:13:36 
	 */
	IdleObjectModel getIdleObjectById(String userId);
	
	/**
	 * TODO:根据闲置物品的id获取闲置物品的详细信息
	 * @param userId
	 * @return
	 * @author:KangYong  下午9:22:30 
	 */
	IdleObjectModel getIdleObjectDetailById(Integer idleObjectId);
	
	/**
	 * TODO:更新自己发布的闲置物品
	 * @param idleobject
	 * @author:KangYong  下午11:13:55 
	 */
	void updatedleObject(IdleObjectModel idleobject);
	
	/**
	 * TODO:发布闲置物品
	 * @param idleobject
	 * @author:KangYong  下午11:14:34 
	 */
	void publishIdleObject(IdleObjectModel idleobject);
	
	/**
	 * TODO:批量删除，但是批量删除的数量最大为10
	 * @param idleObjectIds
	 * @return
	 * @author:KangYong  下午11:15:19 
	 */
	int deleteBatchIdleObject(List<Integer> idleObjectIds);
	/**
	 * TODO:
	 * @param idleObjectId
	 * @param userId
	 * @return
	 * @author:KangYong  下午11:15:51 
	 */
	int deleteIdleObject(Integer idleObjectId,String userId);
}
