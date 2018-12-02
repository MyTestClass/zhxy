package com.xiaochen.common.utils;

import java.io.IOException;
import java.util.List;

import org.json.JSONException;
import org.json.JSONObject;

import com.github.pagehelper.PageInfo;
import com.xiaochen.common.constant.ResponseCode;
import com.xiaochen.common.exception.BusinessException;



/**
 * TODO:响应工具类
 * @author:KangYong 下午8:35:04
 */
public class ResponseResultUtil {
	/**
	 * TODO: 返回响应的json字符串
	 * @param code	错误码
	 * @param msg	错误信息
	 * @return	json字符串
	 * @author:KangYong  下午8:35:27 
	 */
	public static String failed(String code, String msg){
		JSONObject result = new JSONObject();
		result.put("code", code);
		result.put("msg", msg);
		return result.toString();
	}
	
    /**
     * TODO:查询结果集为分页的
     * @param pageInfo
     * @return
     * @author:KangYong  下午9:16:28 
     */
    public static String successPage(PageInfo<?> pageInfo) {
    	JSONObject json = new JSONObject();
		try {
			json.put("list", JsonUtils.toJsonString(pageInfo.getList()));
			json.put("count", pageInfo.getTotal());
			json.put("code", ResponseCode.SUCCESS);
			json.put("msg","success");
			return json.toString();
		} catch (IOException e) {
			e.printStackTrace();
			throw new BusinessException(ResponseCode.INTERNAL_EXCEPTION, e.getMessage());
		}
    }
    
    /**
     * TODO:查询的结果集为列表的
     * @param list
     * @return
     * @author:KangYong  下午9:16:16 
     */
    public static String successList(List<?> list) {
    	JSONObject json = new JSONObject();
    	try {
    		json.put("count", list.size());
			json.put("list", JsonUtils.toJsonString(list));
			json.put("code", ResponseCode.SUCCESS);
			json.put("message","success");
		} catch (JSONException | IOException e) {
			e.printStackTrace();
			throw new BusinessException(ResponseCode.INTERNAL_EXCEPTION, e.getMessage());
		}
    	return json.toString();
    }
    
    /**
     * TODO:查询结果集为单一对象的
     * @param object
     * @return
     * @author:KangYong  下午9:15:56 
     */
    public static String success(Object object) {
    	JSONObject json = new JSONObject();
    	try {
			json.put("result", JsonUtils.toJsonString(object));
			json.put("code", ResponseCode.SUCCESS);
			json.put("message","success");
		} catch (JSONException | IOException e) {
			e.printStackTrace();
			throw new BusinessException(ResponseCode.INTERNAL_EXCEPTION, e.getMessage());
		}
    	return json.toString();
    }
	
}
