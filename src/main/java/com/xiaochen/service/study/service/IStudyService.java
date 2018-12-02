package com.xiaochen.service.study.service;

import java.util.List;

import com.xiaochen.dao.study.model.StudyModel;

/**
 *  学术交流
 * @author 陈康勇
 *
 */
public interface IStudyService {
	List<StudyModel> searchQuestionByDescrible(String describle,int limit,int length);
	List<StudyModel> searchQuestionByType(String type,int limit,int length);
	List<StudyModel> searchQuestionIsSolve(char issolved,int limit,int length);
	List<StudyModel> getQuestionByUserId(int userId,int limit,int length);
	List<StudyModel> getQuestionByUserIdIsSolve(char issolved,int userId,int limit,int length);
	
	void publishQuestion(StudyModel question);
	//在service层需要删除图片,这里返回的就是删除的条目，服务层需要判断是否删除成功，也就是判断
	//int是否大于0
	int deleteQuestion(int problemid,int userid);

}
