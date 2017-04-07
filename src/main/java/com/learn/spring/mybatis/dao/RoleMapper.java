package com.learn.spring.mybatis.dao;

import org.apache.ibatis.annotations.Mapper;

import com.learn.spring.mybatis.model.Role;

@Mapper
public interface RoleMapper {
	int deleteByPrimaryKey(Integer id);

	int insert(Role record);

	int insertSelective(Role record);

	Role selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(Role record);

	int updateByPrimaryKey(Role record);
}