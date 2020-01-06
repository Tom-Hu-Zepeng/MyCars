package com.accp.biz.x;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.x.XDao;
import com.accp.pojo.vbaoyang;
import com.accp.pojo.vinfo;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class XBiz {
	
	@Autowired
	private XDao dao;
	
	public List<vinfo> queryvinfo(){
		return dao.queryvinfo();
	}
	
	
	public List<vbaoyang> querybylist(){
		return dao.querybylist();
	}
	
	public vbaoyang finfby(int vid){
		return dao.loadby(vid);
	}
	
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public void addby(vbaoyang by) {
		dao.savaby(by);
	}
	
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int deleteby(int vid) {
		return dao.deleteby(vid);
	}
	
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public void updategby(vbaoyang by) {
		dao.updategby(by);
	}

}
