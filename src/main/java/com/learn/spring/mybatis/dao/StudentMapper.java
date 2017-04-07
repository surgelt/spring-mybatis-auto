package com.learn.spring.mybatis.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.learn.spring.mybatis.model.Student;
import com.learn.spring.mybatis.model.StudentLecture;

@Mapper
public interface StudentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
    
}