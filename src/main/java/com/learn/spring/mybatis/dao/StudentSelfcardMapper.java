package com.learn.spring.mybatis.dao;

import org.apache.ibatis.annotations.Mapper;

import com.learn.spring.mybatis.model.StudentSelfcard;

@Mapper
public interface StudentSelfcardMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(StudentSelfcard record);

    int insertSelective(StudentSelfcard record);

    StudentSelfcard selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(StudentSelfcard record);

    int updateByPrimaryKey(StudentSelfcard record);
    
    StudentSelfcard selectByStudentId(Integer id);
}