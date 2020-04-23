package com.jflow.sbp.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.jflow.sbp.domain.User;

public interface UserMapper {
	@Select("select uname from User where uid=#{uid}")
	public User getUname(@Param("uid") String uid) throws Exception;
	
	public User getLoginInfo(@Param("uid") String uid) throws Exception;
}
