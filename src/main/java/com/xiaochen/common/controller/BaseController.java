package com.xiaochen.common.controller;

import java.util.List;

import org.json.JSONArray;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;

import com.github.pagehelper.PageInfo;
import com.xiaochen.common.constant.ResponseCode;
import com.xiaochen.common.exception.BusinessException;

public class BaseController<T> {
	
	
	
	/**
	 * TODO:实体类有校性验证
	 * @param result
	 * @author:KangYong  下午8:16:24 
	 */
	protected void checkValidResult(BindingResult result) {
		if (result != null && result.hasErrors()) {
			StringBuilder errorMsg = new StringBuilder();
			result.getFieldErrors().forEach(p -> {
				errorMsg.append(p.getDefaultMessage()).append(";");
			});
			throw new BusinessException(ResponseCode.PARAMETER_ERROR, errorMsg.toString());
		}
	}
	/**
	 * TODO:对分页的结果进行包装
	 * @param pageInfo
	 * @return
	 * @author:KangYong  下午8:16:58 
	 */
	protected ModelMap getPageResult(PageInfo<T> pageInfo) {
		ModelMap model = new ModelMap();
		model.addAttribute("list", pageInfo.getList());
		model.addAttribute("count", pageInfo.getTotal());
		return model;
	}


	/**
	 * TODO: 对列表数据进行封装，查询到结果后，直接放到这里面
	 * @param list
	 * @return
	 * @author:KangYong  下午8:17:37 
	 */
	protected ModelMap getResult(List<T> list) {
		ModelMap model = new ModelMap();
		model.addAttribute("list", list);
		return model;
	}

	protected ModelMap getResult(JSONArray array) {
		ModelMap model = new ModelMap();
		model.addAttribute("list", array);
		return model;
	}
}
