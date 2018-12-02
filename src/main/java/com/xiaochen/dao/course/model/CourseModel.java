package com.xiaochen.dao.course.model;

/**
 * 
 * 定义一节课
 * 我们需要解析教务系统中每一周的课程信息，然后将该信息全部保存在数据库中，
 * 因为一门课可能会有单周、双周、或者有范围的，这样解析出来的结果虽然有些冗余，但是处理起来比较
 * 简单。
 * 
 * 这些数据服务器端不会保存， 解析后，全部回传给客户端，但是这里还可以进行优化，看看可不可以
 * 将解析的策略传给客户端，完全由客户端解析。
 * @author 陈康勇
 *
 */
public class CourseModel {
	private String coursename;
	private String classroom;
	private String teachername;
	//星期几
	private int week;
	//第几周
	private int weeks;
	//第几节课开始
	private int start;
	//第几节课结束
	private int end;
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	public String getClassroom() {
		return classroom;
	}
	public void setClassroom(String classroom) {
		this.classroom = classroom;
	}
	public String getTeachername() {
		return teachername;
	}
	public void setTeachername(String teachername) {
		this.teachername = teachername;
	}
	public int getWeek() {
		return week;
	}
	public void setWeek(int week) {
		this.week = week;
	}
	public int getWeeks() {
		return weeks;
	}
	public void setWeeks(int weeks) {
		this.weeks = weeks;
	}
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getEnd() {
		return end;
	}
	public void setEnd(int end) {
		this.end = end;
	}
}
