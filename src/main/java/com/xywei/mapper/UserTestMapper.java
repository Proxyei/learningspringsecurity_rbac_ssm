package com.xywei.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.xywei.domain.UserTest;

@Mapper
public interface UserTestMapper {

	List<UserTest> getUserTest();
}
