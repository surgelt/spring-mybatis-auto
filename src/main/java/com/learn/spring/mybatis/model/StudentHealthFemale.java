package com.learn.spring.mybatis.model;

import java.util.Date;

public class StudentHealthFemale {
    @Override
	public String toString() {
		return "StudentHealthFemale [id=" + id + ", studentId=" + studentId + ", checkDate=" + checkDate + ", heart="
				+ heart + ", liver=" + liver + ", spleen=" + spleen + ", lung=" + lung + ", kindey=" + kindey
				+ ", uterus=" + uterus + ", note=" + note + "]";
	}

	private Integer id;

    private Integer studentId;

    private Date checkDate;

    private String heart;

    private String liver;

    private String spleen;

    private String lung;

    private String kindey;

    private String uterus;

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

    public Date getCheckDate() {
        return checkDate;
    }

    public void setCheckDate(Date checkDate) {
        this.checkDate = checkDate;
    }

    public String getHeart() {
        return heart;
    }

    public void setHeart(String heart) {
        this.heart = heart == null ? null : heart.trim();
    }

    public String getLiver() {
        return liver;
    }

    public void setLiver(String liver) {
        this.liver = liver == null ? null : liver.trim();
    }

    public String getSpleen() {
        return spleen;
    }

    public void setSpleen(String spleen) {
        this.spleen = spleen == null ? null : spleen.trim();
    }

    public String getLung() {
        return lung;
    }

    public void setLung(String lung) {
        this.lung = lung == null ? null : lung.trim();
    }

    public String getKindey() {
        return kindey;
    }

    public void setKindey(String kindey) {
        this.kindey = kindey == null ? null : kindey.trim();
    }

    public String getUterus() {
        return uterus;
    }

    public void setUterus(String uterus) {
        this.uterus = uterus == null ? null : uterus.trim();
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }
}