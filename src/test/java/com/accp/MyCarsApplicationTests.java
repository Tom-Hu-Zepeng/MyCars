package com.accp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

<<<<<<< HEAD
import com.accp.biz.x.XBiz;
=======
import com.accp.biz.h.LoginBiz;
>>>>>>> branch 'master' of https://github.com/Tom-Hu-Zepeng/MyCars.git

@SpringBootTest //Classes = {MyCarsApplication.class}
class MyCarsApplicationTests {
	
	@Autowired
	private LoginBiz biz;

	
	@Autowired
	private XBiz biz;
	
	@Test
<<<<<<< HEAD
	public void clTest() {
		System.out.println(biz.querybylist());
=======
	void contextLoads() {
		System.out.println(biz.queryByUsers("Tom", "1111111"));
>>>>>>> branch 'master' of https://github.com/Tom-Hu-Zepeng/MyCars.git
	}

}
