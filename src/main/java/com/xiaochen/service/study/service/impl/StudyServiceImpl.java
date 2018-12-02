package com.xiaochen.service.study.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xiaochen.dao.study.mapper.IStudyDao;
import com.xiaochen.dao.study.model.StudyModel;
import com.xiaochen.service.study.service.IStudyService;


@Service
public class StudyServiceImpl implements IStudyService{
	@Autowired
	IStudyDao dao;

	@Override
	public List<StudyModel> searchQuestionByDescrible(String describle, int limit, int length) {
		
		return dao.searchQuestionByDescrible(describle, limit, length);
	}

	@Override
	public List<StudyModel> searchQuestionByType(String type, int limit, int length) {
		return dao.searchQuestionByType(type, limit, length);
	}

	@Override
	public List<StudyModel> searchQuestionIsSolve(char issolved, int limit, int length) {
		return dao.searchQuestionIsSolve(issolved, limit, length);
	}

	@Override
	public List<StudyModel> getQuestionByUserId(int userId, int limit, int length) {
		return dao.getQuestionByUserId(userId, limit, length);
	}

	@Override
	public List<StudyModel> getQuestionByUserIdIsSolve(char issolved, int userId, int limit, int length) {
		return dao.getQuestionByUserIdIsSolve(issolved, userId, limit, length);
	}

	@Override
	public void publishQuestion(StudyModel question) {
		dao.publishQuestion(question);
	}

	@Override
	public int deleteQuestion(int problemid, int userid) {
		return dao.deleteQuestion(problemid, userid);
	}
	
}
