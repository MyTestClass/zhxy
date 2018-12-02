package com.xiaochen.service.express.service;

import java.util.List;

import com.xiaochen.dao.express.model.ExpressModel;

/**
 *  快递代拿服务
 * @author 陈康勇
 *
 */
public interface IExpressService {
	List<ExpressModel> searchByExpressCompany(String company,int index,int length);
	List<ExpressModel> searcgByWeight(String weight,int index,int length);
	List<ExpressModel> searchByPrice(String price,int index,int length);
	
	//自己获取
	List<ExpressModel> getByIsHandleAndUserid(char isHandler,int userid,int index,int length);
	List<ExpressModel> getAllByUserid(int userid,int index,int length);
	
	void publishExpress(ExpressModel express);
	int deleteExpress(int expressid,int userid);
}
