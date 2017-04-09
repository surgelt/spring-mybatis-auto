package com.learn.spring.mybatis.dao;

import org.apache.ibatis.annotations.Mapper;

import com.learn.spring.mybatis.model.StudentHealthMale;

@Mapper
public interface StudentHealthMaleMapper {
	int deleteByPrimaryKey(Integer id);

	int insert(StudentHealthMale record);

	int insertSelective(StudentHealthMale record);

	StudentHealthMale selectByPrimaryKey(Integer id);

	StudentHealthMale selectByStudentId(Integer id);

	int updateByPrimaryKeySelective(StudentHealthMale record);

	int updateByPrimaryKey(StudentHealthMale record);
}