package com.learn.spring.mybatis.model;

public class StudentLecture {
	@Override
	public String toString() {
		return "StudentLecture [id=" + id + ", studentId=" + studentId + ", lectureId=" + lectureId + ", grade=" + grade
				+ ", note=" + note + ", lecture=" + lecture + "]";
	}

	private Integer id;

	private Integer studentId;

	private Integer lectureId;

	private String grade;

	private String note;

	private Lecture lecture;

	public Lecture getLecture() {
		return lecture;
	}

	public void setLecture(Lecture lecture) {
		this.lecture = lecture;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public Integer getLectureId() {
		return lectureId;
	}

	public void setLectureId(Integer lectureId) {
		this.lectureId = lectureId;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade == null ? null : grade.trim();
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note == null ? null : note.trim();
	}
}