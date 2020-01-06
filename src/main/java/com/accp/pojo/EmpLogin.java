package com.accp.pojo;

public class EmpLogin {

	private String empUserName;
	private String empUserPwd;
	public String getEmpUserName() {
		return empUserName;
	}
	public void setEmpUserName(String empUserName) {
		this.empUserName = empUserName;
	}
	public String getEmpUserPwd() {
		return empUserPwd;
	}
	public void setEmpUserPwd(String empUserPwd) {
		this.empUserPwd = empUserPwd;
	}
	@Override
	public String toString() {
		return "EmpLogin [empUserName=" + empUserName + ", empUserPwd=" + empUserPwd + "]";
	}
	public EmpLogin(String empUserName, String empUserPwd) {
		super();
		this.empUserName = empUserName;
		this.empUserPwd = empUserPwd;
	}
	public EmpLogin() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
