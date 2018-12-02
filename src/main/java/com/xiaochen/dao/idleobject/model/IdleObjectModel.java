package com.xiaochen.dao.idleobject.model;

import lombok.Data;

/**
 * TODO:闲置物品
 * @author:KangYong 下午10:16:42
 */
@Data
public class IdleObjectModel {
	//用户的id
	private String userId;
	//闲置物品的id
	private Integer idleObjectId;
	//闲置物品的名称
	private String idleObjectIdName;
	//闲置物品类型
	private String idleObjectType;
	//物品描述
	private String describle;
	//发布的时间
	private String dateTime;
	//是否卖出
	private Integer isSell;
	//原价
	private String originalPrice;
	//售价
	private String sellPrice;
	//也就是货物所在地，APP应该提供默认的地址供用户选择
	private String place;
	//图片的地址，这里使用逗号隔开
	private String imageUrls;
}
