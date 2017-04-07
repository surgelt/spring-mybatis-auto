package com.learn.spring.mybatis.dao;

import org.apache.ibatis.annotations.Mapper;

import com.learn.spring.mybatis.model.Lecture;
@Mapper
public interface LectureMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Lecture record);

    int insertSelective(Lecture record);

    Lecture selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Lecture record);

    int updateByPrimaryKey(Lecture record);
}