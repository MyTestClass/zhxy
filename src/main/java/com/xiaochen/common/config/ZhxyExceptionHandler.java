package com.xiaochen.common.config;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.xiaochen.common.exception.BusinessException;
import com.xiaochen.common.utils.ResponseResultUtil;

@RestControllerAdvice(annotations = {RestController.class, Controller.class})
public class ZhxyExceptionHandler {
	//处理BusinessException异常
	@ExceptionHandler(BusinessException.class)
	public String businessExceptionHandler(BusinessException e, HttpServletRequest request, HttpServletResponse response) {
		response.setContentType("application/x-json");
		response.setCharacterEncoding("UTF-8");
		//返回JSON字符串
		return ResponseResultUtil.failed(e.getCode(), e.getMessage());
	}
	
}
