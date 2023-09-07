package com.masti.orm.loan.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "bha_cust")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="cust_id")
	private Integer custid;
	@Column(name="cust_firstname")
	private String custfirstname;
	@Column(name="cust_lastname")
	private String custlastname;
	@Column(name="cust_dob")
	private Date custdob;
	@Column(name="cust_panno")
	private String custpanno;
	@Column(name="cust_mobile")
	private Integer custmobile;
	@Column(name="cust_address")
	private String custaddress;
	@Column(name="cust_luser")
	private Integer custluser;
	@Column(name="cust_guardianname")
	private String custgname;
	@Column(name="cust_lastupdateddate")
	private Date custluudate;
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
		this.custdob = Date.valueOf(custdob);
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
		this.custluudate = Date.valueOf(custluudate);
	}

	public Integer getCustluser() {
		return custluser;
	}

	public void setCustluser(Integer custluser) {
		this.custluser = custluser;
	}

	@Override
	public String toString() {
		return "Customer [custid=" + custid + ", custfirstname=" + custfirstname + ", custlastname=" + custlastname
				+ ", custdob=" + custdob + ", custpanno=" + custpanno + ", custmobile=" + custmobile + ", custaddress="
				+ custaddress + ", custluser=" + custluser + ", custgname=" + custgname + ", custluudate=" + custluudate
				+ "]";
	}
}
