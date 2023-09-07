package com.masti.orm.loan.model;

import java.sql.Date;

public class LoanApplicants {

	private Integer lnapid;
	private Integer lnapcustid;
	private Date lnapapdate;
	private Integer lnaplntyid;
	private double lnapamount;
	private double lnapemirangefrom;
	private double lnapemirangeto;
	private double lnapnomrequested;
	private Integer lnapcibilscore;
	private String lnapstatus;
	private String lnapconclusionremarks;
	private Integer lnapprocesseduser;
	private Date lnapprocessedDate;
	private double lnapannualincome;
	private double lnapdisposalincome;


	public LoanApplicants() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getLnapid() {
		return lnapid;
	}
	public void setLnapid(Integer lnapid) {
		this.lnapid = lnapid;
	}
	public Integer getLnapcustid() {
		return lnapcustid;
	}
	public void setLnapcustid(Integer lnapcustid) {
		this.lnapcustid = lnapcustid;
	}
	public Date getLnapapdate() {
		return lnapapdate;
	}
	public void setLnapapdate(String lnapapdate) {
		this.lnapapdate =Date.valueOf( lnapapdate);
	}
	public Integer getLnaplntyid() {
		return lnaplntyid;
	}
	public void setLnaplntyid(Integer lnaplntyid) {
		this.lnaplntyid = lnaplntyid;
	}
	public double getLnapamount() {
		return lnapamount;
	}
	public void setLnapamount(double lnapamount) {
		this.lnapamount = lnapamount;
	}
	public double getLnapemirangefrom() {
		return lnapemirangefrom;
	}
	public void setLnapemirangefrom(double lnapemirangefrom) {
		this.lnapemirangefrom = lnapemirangefrom;
	}
	public double getLnapemirangeto() {
		return lnapemirangeto;
	}
	public void setLnapemirangeto(double lnapemirangeto) {
		this.lnapemirangeto = lnapemirangeto;
	}
	public double getLnapnomrequested() {
		return lnapnomrequested;
	}
	public void setLnapnomrequested(double lnapnomrequested) {
		this.lnapnomrequested = lnapnomrequested;
	}
	public Integer getLnapcibilscore() {
		return lnapcibilscore;
	}
	public void setLnapcibilscore(Integer lnapcibilscore) {
		this.lnapcibilscore = lnapcibilscore;
	}
	public String getLnapstatus() {
		return lnapstatus;
	}
	public void setLnapstatus(String lnapstatus) {
		this.lnapstatus = lnapstatus;
	}
	public String getLnapconclusionremarks() {
		return lnapconclusionremarks;
	}
	public void setLnapconclusionremarks(String lnapconclusionremarks) {
		this.lnapconclusionremarks = lnapconclusionremarks;
	}
	public Integer getLnapprocesseduser() {
		return lnapprocesseduser;
	}
	public void setLnapprocesseduser(Integer lnapprocesseduser) {
		this.lnapprocesseduser = lnapprocesseduser;
	}
	public Date getLnapprocessedDate() {
		return lnapprocessedDate;
	}
	public void setLnapprocessedDate(String lnapprocessedDate) {
		this.lnapprocessedDate =Date.valueOf( lnapprocessedDate);
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



}
