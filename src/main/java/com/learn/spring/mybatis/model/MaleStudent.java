package com.learn.spring.mybatis.model;

import java.util.List;

public class MaleStudent extends Student {
	@Override
	public String toString() {
		return super.toString() + "MaleStudent [studentHealthMales=" + studentHealthMales + "]";
	}

	private List<StudentHealthMale> studentHealthMales = null;

	public List<StudentHealthMale> getStudentHealthMales() {
		return studentHealthMales;
	}

	public void setStudentHealthMales(List<StudentHealthMale> studentHealthMales) {
		this.studentHealthMales = studentHealthMales;
	}

}
