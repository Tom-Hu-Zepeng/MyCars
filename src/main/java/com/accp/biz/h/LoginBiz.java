package com.accp.biz.h;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.h.ILogin;
import com.accp.pojo.EmpLogin;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class LoginBiz {

	@Autowired
	private ILogin login;
	
	/**
	 * 登录
	 * @param userId
	 * @param userPwd
	 * @return
	 */
	public EmpLogin queryByUsers(String empUserName,String userPwd) {
		return login.queryByUsers(empUserName, userPwd);
	}
}
