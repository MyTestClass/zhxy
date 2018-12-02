package com.xiaochen.dao.study.model;

public class StudyModel {
	private int userid;
	private String publishdatetime;
	private char issolved;
	private String problemdescrible;
	private int problemid;
	private String problemtype;
	//图片使用分隔符，来进行分割
	private String imageurls;
	private String problemcontent;
	public String getProblemContent() {
		return problemcontent;
	}
	public void setProblemContent(String problemContent) {
		this.problemcontent = problemContent;
	}
	public String getImageUrls() {
		return imageurls;
	}
	public void setImageUrls(String imageUrls) {
		this.imageurls = imageUrls;
	}
	public String getProblemType() {
		return problemtype;
	}
	public void setProblemType(String problemType) {
		this.problemtype = problemType;
	}
	public int getUserId() {
		return userid;
	}
	public void setUserId(int userId) {
		this.userid = userId;
	}
	public String getPublishDateTime() {
		return publishdatetime;
	}
	public void setPublishDateTime(String publishDateTime) {
		this.publishdatetime = publishDateTime;
	}
	public char getIsSolved() {
		return issolved;
	}
	public void setIsSolved(char isSolved) {
		this.issolved = isSolved;
	}
	public String getProblemDescrible() {
		return problemdescrible;
	}
	public void setProblemDescrible(String problemDescrible) {
		this.problemdescrible = problemDescrible;
	}
	public int getProblemId() {
		return problemid;
	}
	public void setProblemId(int problemId) {
		this.problemid = problemId;
	}
}
