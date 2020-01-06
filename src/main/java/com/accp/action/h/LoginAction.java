package com.accp.action.h;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.h.LoginBiz;
import com.accp.pojo.EmpLogin;


@RestController
@RequestMapping("/api/persons") // 命名空间
public class LoginAction {

	@Autowired
	private LoginBiz biz;
	
	/**
	 * @param empUserName
	 * @param userPwd
	 * @return
	 */
	@GetMapping("/{empUserName}/{userPwd}")
	public Map<String, Object>  queryByUsers(@PathVariable String empUserName,@PathVariable String userPwd) {
		EmpLogin loh=biz.queryByUsers(empUserName, userPwd);
		Map<String, Object> message = new HashMap<String, Object>();
		if(loh==null) {
			message.put("code", "500");
			message.put("msg", "no");
		}else {
			message.put("code", "200");
			message.put("msg", "ok");
		}
		return message;
	}
}
