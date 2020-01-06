package com.accp.dao.x;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.vbaoyang;
import com.accp.pojo.vinfo;

public interface XDao {
	public List<vinfo> queryvinfo();
	
	public List<vbaoyang> querybylist();
	
	public void savaby(@Param("by") vbaoyang by);
	
	public void updategby(@Param("by") vbaoyang by);
	
	public vbaoyang loadby(@Param("vid") int vid);
	
	public int deleteby(@Param("vid") int vid);

}
