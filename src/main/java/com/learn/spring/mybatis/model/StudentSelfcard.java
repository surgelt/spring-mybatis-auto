package com.learn.spring.mybatis.model;

import java.util.Date;

public class StudentSelfcard {
    @Override
	public String toString() {
		return "StudentSelfcard [id=" + id + ", studentId=" + studentId + ", native_=" + native_ + ", issueDate="
				+ issueDate + ", endDate=" + endDate + ", note=" + note + "]";
	}

	private Integer id;

    private Integer studentId;

    private String native_;

    private Date issueDate;

    private Date endDate;

    private String note;

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

    public String getNative() {
        return native_;
    }

    public void setNative(String native_) {
        this.native_ = native_ == null ? null : native_.trim();
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }
}