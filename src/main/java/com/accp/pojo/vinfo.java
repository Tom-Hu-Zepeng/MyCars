package com.accp.pojo;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class vinfo {
	private String vnum;
	private String trkname;
	private String vmode;
	private String vdriver;
	private String vdrivernum;
	@JSONField(format="yyyy-MM-dd")
	private Date vdriverdate;
	private String vaffiliation;
	@JSONField(format="yyyy-MM-dd")
	private Date jbrq;
	private String vin;
	private String venginenum;
	private int vmj;
	private float vmileage;
	private String endname;
	private float vload;
	@JSONField(format="yyyy-MM-dd")
	private Date vbuydate;
	@JSONField(format="yyyy-MM-dd")
	private Date sprq;
	@JSONField(format="yyyy-MM-dd")
	private Date cjrq;
	private String insuname;
	@JSONField(format="yyyy-MM-dd")
	private Date insurq;
	private String insuname2;
	private Date insurq2;
	private int wtb;
	private String rytype;
	private float upkeeplc;
	@JSONField(format="yyyy-MM-dd")
	private Date date;
	private String custname;
	public String getVnum() {
		return vnum;
	}
	public void setVnum(String vnum) {
		this.vnum = vnum;
	}
	
	public String getTrkname() {
		return trkname;
	}
	public void setTrkname(String trkname) {
		this.trkname = trkname;
	}
	public String getVmode() {
		return vmode;
	}
	public void setVmode(String vmode) {
		this.vmode = vmode;
	}
	public String getVdriver() {
		return vdriver;
	}
	public void setVdriver(String vdriver) {
		this.vdriver = vdriver;
	}
	public String getVdrivernum() {
		return vdrivernum;
	}
	public void setVdrivernum(String vdrivernum) {
		this.vdrivernum = vdrivernum;
	}
	public Date getVdriverdate() {
		return vdriverdate;
	}
	public void setVdriverdate(Date vdriverdate) {
		this.vdriverdate = vdriverdate;
	}
	public String getVaffiliation() {
		return vaffiliation;
	}
	public void setVaffiliation(String vaffiliation) {
		this.vaffiliation = vaffiliation;
	}
	public Date getJbrq() {
		return jbrq;
	}
	public void setJbrq(Date jbrq) {
		this.jbrq = jbrq;
	}
	public String getVin() {
		return vin;
	}
	public void setVin(String vin) {
		this.vin = vin;
	}
	public String getVenginenum() {
		return venginenum;
	}
	public void setVenginenum(String venginenum) {
		this.venginenum = venginenum;
	}
	public int getVmj() {
		return vmj;
	}
	public void setVmj(int vmj) {
		this.vmj = vmj;
	}
	public float getVmileage() {
		return vmileage;
	}
	public void setVmileage(float vmileage) {
		this.vmileage = vmileage;
	}
	
	public String getEndname() {
		return endname;
	}
	public void setEndname(String endname) {
		this.endname = endname;
	}
	public float getVload() {
		return vload;
	}
	public void setVload(float vload) {
		this.vload = vload;
	}
	public Date getVbuydate() {
		return vbuydate;
	}
	public void setVbuydate(Date vbuydate) {
		this.vbuydate = vbuydate;
	}
	public Date getSprq() {
		return sprq;
	}
	public void setSprq(Date sprq) {
		this.sprq = sprq;
	}
	public Date getCjrq() {
		return cjrq;
	}
	public void setCjrq(Date cjrq) {
		this.cjrq = cjrq;
	}
	public String getInsuname() {
		return insuname;
	}
	public void setInsuname(String insuname) {
		this.insuname = insuname;
	}
	public Date getInsurq() {
		return insurq;
	}
	public void setInsurq(Date insurq) {
		this.insurq = insurq;
	}
	public String getInsuname2() {
		return insuname2;
	}
	public void setInsuname2(String insuname2) {
		this.insuname2 = insuname2;
	}
	public Date getInsurq2() {
		return insurq2;
	}
	public void setInsurq2(Date insurq2) {
		this.insurq2 = insurq2;
	}
	public int getWtb() {
		return wtb;
	}
	public void setWtb(int wtb) {
		this.wtb = wtb;
	}
	public String getRytype() {
		return rytype;
	}
	public void setRytype(String rytype) {
		this.rytype = rytype;
	}
	public float getUpkeeplc() {
		return upkeeplc;
	}
	public void setUpkeeplc(float upkeeplc) {
		this.upkeeplc = upkeeplc;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public vinfo(String vnum, String trkname, String vmode, String vdriver, String vdrivernum, Date vdriverdate,
			String vaffiliation, Date jbrq, String vin, String venginenum, int vmj, float vmileage, String endname,
			float vload, Date vbuydate, Date sprq, Date cjrq, String insuname, Date insurq, String insuname2,
			Date insurq2, int wtb, String rytype, float upkeeplc, Date date, String custname) {
		super();
		this.vnum = vnum;
		this.trkname = trkname;
		this.vmode = vmode;
		this.vdriver = vdriver;
		this.vdrivernum = vdrivernum;
		this.vdriverdate = vdriverdate;
		this.vaffiliation = vaffiliation;
		this.jbrq = jbrq;
		this.vin = vin;
		this.venginenum = venginenum;
		this.vmj = vmj;
		this.vmileage = vmileage;
		this.endname = endname;
		this.vload = vload;
		this.vbuydate = vbuydate;
		this.sprq = sprq;
		this.cjrq = cjrq;
		this.insuname = insuname;
		this.insurq = insurq;
		this.insuname2 = insuname2;
		this.insurq2 = insurq2;
		this.wtb = wtb;
		this.rytype = rytype;
		this.upkeeplc = upkeeplc;
		this.date = date;
		this.custname = custname;
	}
	public vinfo() {
		super();
	}
	@Override
	public String toString() {
		return "vinfo [vnum=" + vnum + ", trkname=" + trkname + ", vmode=" + vmode + ", vdriver=" + vdriver
				+ ", vdrivernum=" + vdrivernum + ", vdriverdate=" + vdriverdate + ", vaffiliation=" + vaffiliation
				+ ", jbrq=" + jbrq + ", vin=" + vin + ", venginenum=" + venginenum + ", vmj=" + vmj + ", vmileage="
				+ vmileage + ", endname=" + endname + ", vload=" + vload + ", vbuydate=" + vbuydate + ", sprq=" + sprq
				+ ", cjrq=" + cjrq + ", insuname=" + insuname + ", insurq=" + insurq + ", insuname2=" + insuname2
				+ ", insurq2=" + insurq2 + ", wtb=" + wtb + ", rytype=" + rytype + ", upkeeplc=" + upkeeplc + ", date="
				+ date + ", custname=" + custname + "]";
	}
	
	
	
	
	
	

}
