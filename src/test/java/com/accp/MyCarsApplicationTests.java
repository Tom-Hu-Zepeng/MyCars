package com.accp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.accp.biz.h.LoginBiz;

@SpringBootTest //Classes = {MyCarsApplication.class}
class MyCarsApplicationTests {
	
	@Autowired
	private LoginBiz biz;

	@Test
	void contextLoads() {
		System.out.println(biz.queryByUsers("Tom", "1111111"));
	}

}
