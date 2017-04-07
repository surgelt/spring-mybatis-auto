package com.learn.spring.mybatis.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.learn.spring.mybatis.model.StudentLecture;
@Mapper
public interface StudentLectureMapper {
	int deleteByPrimaryKey(Integer id);

	int insert(StudentLecture record);

	int insertSelective(StudentLecture record);

	StudentLecture selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(StudentLecture record);

	int updateByPrimaryKey(StudentLecture record);

	List<StudentLecture> selectByStudentId(Integer id);
	
	StudentLecture selectByLectureId(Integer id);
}