package com.accp.action.x;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.x.XBiz;
import com.accp.pojo.vinfo;

@RestController
@RequestMapping("/api/cls")
public class XAction {
	
	@Autowired
	private XBiz biz;
	
	@GetMapping
	public List<vinfo> getclList() {
		return biz.queryvinfo();
	}

}
