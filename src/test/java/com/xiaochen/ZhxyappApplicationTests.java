package com.xiaochen;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.xiaochen.dao.study.mapper.IStudyDao;
import com.xiaochen.dao.study.model.StudyModel;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ZhxyappApplicationTests {
	@Autowired
	IStudyDao dao;
	@Test
	public void contextLoads() {
		StudyModel q = new StudyModel();
		q.setImageUrls("123");
		q.setIsSolved('Y');
		q.setProblemId(123);
		q.setProblemContent("123343");
		q.setProblemType("sdfsd");
		q.setProblemDescrible("desc");
		q.setUserId(123);
//		 Assert.assertEquals(1, dao.publishQuestion(q));
	}

}
