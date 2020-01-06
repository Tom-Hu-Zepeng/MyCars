package com.accp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.accp.biz.x.XBiz;

@SpringBootTest //Classes = {MyCarsApplication.class}
class MyCarsApplicationTests {

	
	@Autowired
	private XBiz biz;
	
	@Test
	public void clTest() {
		System.out.println(biz.querybylist());
	}

}
