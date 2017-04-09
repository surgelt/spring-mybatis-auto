package com.learn.spring.mybatis.dao;

import org.apache.ibatis.annotations.Mapper;

import com.learn.spring.mybatis.model.StudentHealthFemale;

@Mapper
public interface StudentHealthFemaleMapper {
	int deleteByPrimaryKey(Integer id);

	int insert(StudentHealthFemale record);

	int insertSelective(StudentHealthFemale record);

	StudentHealthFemale selectByPrimaryKey(Integer id);

	StudentHealthFemale selectByStudentId(Integer id);

	int updateByPrimaryKeySelective(StudentHealthFemale record);

	int updateByPrimaryKey(StudentHealthFemale record);
}