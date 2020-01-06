package com.accp.pojo;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class vbaoyang {
	private int vid;
	private String vnum;
	private String vupkeepname;
	@JSONField(format="yyyy-MM-dd")
	private Date vplandate;
	private float vplanmileage;
	@JSONField(format="yyyy-MM-dd")
	private Date vactualdate;
	private float vactualmileage;
	public int getVid() {
		return vid;
	}
	public void setVid(int vid) {
		this.vid = vid;
	}
	public String getVnum() {
		return vnum;
	}
	public void setVnum(String vnum) {
		this.vnum = vnum;
	}
	public String getVupkeepname() {
		return vupkeepname;
	}
	public void setVupkeepname(String vupkeepname) {
		this.vupkeepname = vupkeepname;
	}
	public Date getVplandate() {
		return vplandate;
	}
	public void setVplandate(Date vplandate) {
		this.vplandate = vplandate;
	}
	public float getVplanmileage() {
		return vplanmileage;
	}
	public void setVplanmileage(float vplanmileage) {
		this.vplanmileage = vplanmileage;
	}
	public Date getVactualdate() {
		return vactualdate;
	}
	public void setVactualdate(Date vactualdate) {
		this.vactualdate = vactualdate;
	}
	public float getVactualmileage() {
		return vactualmileage;
	}
	public void setVactualmileage(float vactualmileage) {
		this.vactualmileage = vactualmileage;
	}
	public vbaoyang(int vid, String vnum, String vupkeepname, Date vplandate, float vplanmileage, Date vactualdate,
			float vactualmileage) {
		super();
		this.vid = vid;
		this.vnum = vnum;
		this.vupkeepname = vupkeepname;
		this.vplandate = vplandate;
		this.vplanmileage = vplanmileage;
		this.vactualdate = vactualdate;
		this.vactualmileage = vactualmileage;
	}
	public vbaoyang() {
		super();
	}
	@Override
	public String toString() {
		return "vbaoyang [vid=" + vid + ", vnum=" + vnum + ", vupkeepname=" + vupkeepname + ", vplandate=" + vplandate
				+ ", vplanmileage=" + vplanmileage + ", vactualdate=" + vactualdate + ", vactualmileage="
				+ vactualmileage + "]";
	}
	
	
	
}
