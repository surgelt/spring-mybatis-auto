package com.learn.spring.mybatis.model;

import java.util.List;

public class FemaleStudent extends Student {
	private List<StudentHealthFemale> studentHealthFemales = null;

	public List<StudentHealthFemale> getStudentHealthFemales() {
		return studentHealthFemales;
	}

	public void setStudentHealthFemales(List<StudentHealthFemale> studentHealthFemales) {
		this.studentHealthFemales = studentHealthFemales;
	}

}
