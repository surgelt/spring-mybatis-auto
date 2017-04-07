package com.learn.spring.mybatis.model;

import java.util.List;

public class Student {
	

	@Override
	public String toString() {
		return "Student [id=" + id + ", cnname=" + cnname + ", sex=" + sex + ", note=" + note + ", studentSelfcard="
				+ studentSelfcard + ", studentLectures=" + studentLectures + "]";
	}

	private Integer id;

	private String cnname;

	private String sex;

	private String note;

	private StudentSelfcard studentSelfcard;

	private List<StudentLecture> studentLectures;

	public List<StudentLecture> getStudentLectures() {
		return studentLectures;
	}

	public void setStudentLectures(List<StudentLecture> studentLectures) {
		this.studentLectures = studentLectures;
	}

	public StudentSelfcard getStudentSelfcard() {
		return studentSelfcard;
	}

	public void setStudentSelfcard(StudentSelfcard studentSelfcard) {
		this.studentSelfcard = studentSelfcard;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCnname() {
		return cnname;
	}

	public void setCnname(String cnname) {
		this.cnname = cnname == null ? null : cnname.trim();
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex == null ? null : sex.trim();
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note == null ? null : note.trim();
	}
}