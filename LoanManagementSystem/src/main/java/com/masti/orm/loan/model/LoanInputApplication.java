package com.masti.orm.loan.model;

import java.sql.Date;

public class LoanInputApplication {
	// customer data
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

	// LoanApplicantNominees
	private Integer lnapid1;
	private String lnapnominee;
	private String lnaprelation;

	// LoanApplicants
	private Integer lnapid2;
	private Integer lnapcustid;
	private Date lnapapdate;
	private Integer lnaplntyid;
	private double lnapamount;
	private double lnapemirangefrom;
	private double lnapemirangeto;
	private double lnapnomrequested;
	private Integer lnapcibilscore;
	private double lnapannualincome;
	private double lnapdisposalincome;
	private String lnapstatus;
	private String lnapconclusionremarks;
	private Integer lnapprocesseduser;
	private Date lnapprocessedDate;

	public Integer getCustid() {
		return custid;
	}

	public String getCustfirstname() {
		return custfirstname;
	}

	public String getCustlastname() {
		return custlastname;
	}

	public Date getCustdob() {
		return custdob;
	}

	public String getCustpanno() {
		return custpanno;
	}

	public Integer getCustmobile() {
		return custmobile;
	}

	public String getCustaddress() {
		return custaddress;
	}

	public String getCustgname() {
		return custgname;
	}

	public Date getCustluudate() {
		return custluudate;
	}

	public Integer getCustluser() {
		return custluser;
	}

	public Integer getLnapid1() {
		return lnapid1;
	}

	public String getLnapnominee() {
		return lnapnominee;
	}

	public String getLnaprelation() {
		return lnaprelation;
	}

	public Integer getLnapid2() {
		return lnapid2;
	}

	public Integer getLnapcustid() {
		return lnapcustid;
	}

	public Date getLnapapdate() {
		return lnapapdate;
	}

	public Integer getLnaplntyid() {
		return lnaplntyid;
	}

	public double getLnapamount() {
		return lnapamount;
	}

	public double getLnapemirangefrom() {
		return lnapemirangefrom;
	}

	public double getLnapemirangeto() {
		return lnapemirangeto;
	}

	public double getLnapnomrequested() {
		return lnapnomrequested;
	}

	public Integer getLnapcibilscore() {
		return lnapcibilscore;
	}

	public String getLnapstatus() {
		return lnapstatus;
	}

	public String getLnapconclusionremarks() {
		return lnapconclusionremarks;
	}

	public Integer getLnapprocesseduser() {
		return lnapprocesseduser;
	}

	public Date getLnapprocessedDate() {
		return lnapprocessedDate;
	}

	public void setCustid(Integer custid) {
		this.custid = custid;
	}

	public void setCustfirstname(String custfirstname) {
		this.custfirstname = custfirstname;
	}

	public void setCustlastname(String custlastname) {
		this.custlastname = custlastname;
	}

	public void setCustdob(String custdob) {

		this.custdob = Date.valueOf(custdob);
		;
	}

	public void setCustpanno(String custpanno) {
		this.custpanno = custpanno;
	}

	public void setCustmobile(Integer custmobile) {
		this.custmobile = custmobile;
	}

	public void setCustaddress(String custaddress) {
		this.custaddress = custaddress;
	}

	public void setCustgname(String custgname) {
		this.custgname = custgname;
	}

	public void setCustluudate(String custluudate) {
		this.custluudate = Date.valueOf(custluudate);
	}

	public void setCustluser(Integer custluser) {
		this.custluser = custluser;
	}

	public void setLnapid1(Integer lnapid1) {
		this.lnapid1 = lnapid1;
	}

	public void setLnapnominee(String lnapnominee) {
		this.lnapnominee = lnapnominee;
	}

	public void setLnaprelation(String lnaprelation) {
		this.lnaprelation = lnaprelation;
	}

	public void setLnapid2(Integer lnapid2) {
		this.lnapid2 = lnapid2;
	}

	public void setLnapcustid(Integer lnapcustid) {
		this.lnapcustid = lnapcustid;
	}

	public void setLnapapdate(String lnapapdate) {
		this.lnapapdate = Date.valueOf(lnapapdate);
	}

	public void setLnaplntyid(Integer lnaplntyid) {
		this.lnaplntyid = lnaplntyid;
	}

	public void setLnapamount(double lnapamount) {
		this.lnapamount = lnapamount;
	}

	public void setLnapemirangefrom(double lnapemirangefrom) {
		this.lnapemirangefrom = lnapemirangefrom;
	}

	public void setLnapemirangeto(double lnapemirangeto) {
		this.lnapemirangeto = lnapemirangeto;
	}

	public void setLnapnomrequested(double lnapnomrequested) {
		this.lnapnomrequested = lnapnomrequested;
	}

	public void setLnapcibilscore(Integer lnapcibilscore) {
		this.lnapcibilscore = lnapcibilscore;
	}

	public void setLnapstatus(String lnapstatus) {
		this.lnapstatus = lnapstatus;
	}

	public void setLnapconclusionremarks(String lnapconclusionremarks) {
		this.lnapconclusionremarks = lnapconclusionremarks;
	}

	public void setLnapprocesseduser(Integer lnapprocesseduser) {
		this.lnapprocesseduser = lnapprocesseduser;
	}

	public void setLnapprocessedDate(String lnapprocessedDate) {
		this.lnapprocessedDate = Date.valueOf(lnapprocessedDate);
		;
	}

	public double getLnapannualincome() {
		return lnapannualincome;
	}

	public void setLnapannualincome(double lnapannualincome) {
		this.lnapannualincome = lnapannualincome;
	}

	public double getLnapdisposalincome() {
		return lnapdisposalincome;
	}

	public void setLnapdisposalincome(double lnapdisposalincome) {
		this.lnapdisposalincome = lnapdisposalincome;
	}

	@Override
	public String toString() {
		return "LoanInputApplication{" + "custid=" + custid + ", custfirstname='" + custfirstname + '\''
				+ ", custlastname='" + custlastname + '\'' + ", custdob=" + custdob + ", custpanno='" + custpanno + '\''
				+ ", custmobile=" + custmobile + ", custaddress='" + custaddress + '\'' + ", custgname='" + custgname
				+ '\'' + ", custluudate=" + custluudate + ", custluser=" + custluser + ", lnapid1=" + lnapid1
				+ ", lnapnominee='" + lnapnominee + '\'' + ", lnaprelation='" + lnaprelation + '\'' + ", lnapid2="
				+ lnapid2 + ", lnapcustid=" + lnapcustid + ", lnapapdate=" + lnapapdate + ", lnaplntyid=" + lnaplntyid
				+ ", lnapamount=" + lnapamount + ", lnapemirangefrom=" + lnapemirangefrom + ", lnapemirangeto="
				+ lnapemirangeto + ", lnapnomrequested=" + lnapnomrequested + ", lnapcibilscore=" + lnapcibilscore
				+ ", lnapannualincome=" + lnapannualincome + ", lnapdisposalincome=" + lnapdisposalincome
				+ ", lnapstatus='" + lnapstatus + '\'' + ", lnapconclusionremarks='" + lnapconclusionremarks + '\''
				+ ", lnapprocesseduser=" + lnapprocesseduser + ", lnapprocessedDate=" + lnapprocessedDate + '}';
	}

}
