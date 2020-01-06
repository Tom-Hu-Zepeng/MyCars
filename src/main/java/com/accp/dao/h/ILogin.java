package com.accp.dao.h;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.EmpLogin;


public interface ILogin {

	/**
	 * 登录
	 * @param userId
	 * @param userPwd
	 * @return
	 */
	public EmpLogin queryByUsers(@Param("empUserName") String userId,@Param("empUserPwd") String userPwd);
}
