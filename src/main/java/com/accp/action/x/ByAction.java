package com.accp.action.x;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.x.XBiz;
import com.accp.pojo.vbaoyang;

@RestController
@RequestMapping("/api/bys")
public class ByAction {
	@Autowired
	private XBiz biz;
	
	@GetMapping
	public List<vbaoyang> getbylist() {
		return biz.querybylist();
	}
	
	@GetMapping("b/{vid}")
	public vbaoyang queryby(@PathVariable int vid){
		return biz.finfby(vid);
	}
	
	@PostMapping("/b")
	public Map<String, String> addbyInfo(@RequestBody vbaoyang by) {
		Map<String, String> message = new HashMap<String, String>();
		biz.addby(by);
		message.put("code", "200");
		message.put("msg", "ok");
		return message;
	}
	
	@DeleteMapping("/b/{vid}")
	public Map<String, String> delgysInfo(@PathVariable int vid) {
		Map<String, String> message = new HashMap<String, String>();
		biz.deleteby(vid);
		message.put("code", "200");
		message.put("msg", "ok");
		return message;
	}
	
	@PutMapping("/b")
	public Map<String, String> updatebyInfo(@RequestBody vbaoyang by) {
		Map<String, String> message = new HashMap<String, String>();
		biz.updategby(by);
		message.put("code", "200");
		message.put("msg", "ok");
		return message;
	}

}
