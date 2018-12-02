package com.xiaochen.controller.study;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xiaochen.service.study.service.impl.StudyServiceImpl;

/**
 * 	学术交流
 * @author 陈康勇
 *
 */
@RestController
@RequestMapping("/study")
public class StudyController {
	@Autowired
	private StudyServiceImpl service;
	

	

}
