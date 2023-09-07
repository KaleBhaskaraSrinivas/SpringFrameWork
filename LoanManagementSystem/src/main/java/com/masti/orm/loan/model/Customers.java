package com.masti.orm.loan.model;

import java.sql.Date;

public class Customers {
	private Integer custid;
	private String custfirstname;
	private String custlastname;
	private Date custdob;
	private String custpanno;
	private Integer custmobile;
	private String custaddress;
	private String custgname;
	private Date custluudate;
	private Integer custluser;
	public Customers() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getCustid() {
		return custid;
	}
	public void setCustid(Integer custid) {
		this.custid = custid;
	}
	public String getCustfirstname() {
		return custfirstname;
	}
	public void setCustfirstname(String custfirstname) {
		this.custfirstname = custfirstname;
	}
	public String getCustlastname() {
		return custlastname;
	}
	public void setCustlastname(String custlastname) {
		this.custlastname = custlastname;
	}
	public Date getCustdob() {
		return custdob;
	}
	public void setCustdob(String custdob) {
		this.custdob =Date.valueOf(custdob);
	}
	public String getCustpanno() {
		return custpanno;
	}
	public void setCustpanno(String custpanno) {
		this.custpanno = custpanno;
	}
	public Integer getCustmobile() {
		return custmobile;
	}
	public void setCustmobile(Integer custmobile) {
		this.custmobile = custmobile;
	}
	public String getCustaddress() {
		return custaddress;
	}
	public void setCustaddress(String custaddress) {
		this.custaddress = custaddress;
	}
	public String getCustgname() {
		return custgname;
	}
	public void setCustgname(String custgname) {
		this.custgname = custgname;
	}
	public Date getCustluudate() {
		return custluudate;
	}
	public void setCustluudate(String custluudate) {
		this.custluudate =Date.valueOf( custluudate);
	}
	public Integer getCustluser() {
		return custluser;
	}
	public void setCustluser(Integer custluser) {
		this.custluser = custluser;
	}
	@Override
	public String toString() {
		return "Customers [custid=" + custid + ", custfirstname=" + custfirstname + ", custlastname=" + custlastname
				+ ", custdob=" + custdob + ", custpanno=" + custpanno + ", custmobile=" + custmobile + ", custaddress="
				+ custaddress + ", custgname=" + custgname + ", custluudate=" + custluudate + ", custluser=" + custluser
				+ "]";
	}


}
