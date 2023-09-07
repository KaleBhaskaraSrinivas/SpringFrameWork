package com.masti.orm.loan.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "bha_loan")
public class LoanApplicant implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="inap_id")
	private Integer lnapid2;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="inap_cust_id")
	private Integer lnapcustid;
	@Column(name="inap_apdate")
	private Date lnapapdate;
	@Column(name="inap_Inty_id")
	private Integer lnaplntyid;
	@Column(name="inap_amount")
	private double lnapamount;

	@Column(name = "inap_emi_range_from")
	private double lnapemirangefrom;

	@Column(name = "inap_emi_range_to")
	private double lnapemirangeto;

	@Column(name = "inap_nom_requested")
	private double lnapnomrequested;

	@Column(name = "inap_cibil_score")
	private Integer lnapcibilscore;

	@Column(name = "inap_annual_income")
	private double lnapannualincome;

	@Column(name = "inap_disposal_income")
	private double lnapdisposalincome;

	@Column(name = "inap_status")
	private String lnapstatus;

	@Column(name = "inap_conclusion_remarks")
	private String lnapconclusionremarks;

	@Column(name = "inap_processed_user")
	private Integer lnapprocesseduser;

	@Column(name = "inap_processed_date")
	private Date lnapprocessedDate;

	public Integer getLnapid2() {
		return lnapid2;
	}

	public void setLnapid2(Integer lnapid2) {
		this.lnapid2 = lnapid2;
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
		this.lnapapdate = Date.valueOf(lnapapdate);
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

	@Override
	public String toString() {
		return "LoanApplicant [lnapid2=" + lnapid2 + ", lnapcustid=" + lnapcustid + ", lnapapdate=" + lnapapdate
				+ ", lnaplntyid=" + lnaplntyid + ", lnapamount=" + lnapamount + ", lnapemirangefrom=" + lnapemirangefrom
				+ ", lnapemirangeto=" + lnapemirangeto + ", lnapnomrequested=" + lnapnomrequested + ", lnapcibilscore="
				+ lnapcibilscore + ", lnapannualincome=" + lnapannualincome + ", lnapdisposalincome="
				+ lnapdisposalincome + ", lnapstatus=" + lnapstatus + ", lnapconclusionremarks=" + lnapconclusionremarks
				+ ", lnapprocesseduser=" + lnapprocesseduser + ", lnapprocessedDate=" + lnapprocessedDate
				+ ", getLnapid2()=" + getLnapid2() + ", getLnapcustid()=" + getLnapcustid() + ", getLnapapdate()="
				+ getLnapapdate() + ", getLnaplntyid()=" + getLnaplntyid() + ", getLnapamount()=" + getLnapamount()
				+ ", getLnapemirangefrom()=" + getLnapemirangefrom() + ", getLnapemirangeto()=" + getLnapemirangeto()
				+ ", getLnapnomrequested()=" + getLnapnomrequested() + ", getLnapcibilscore()=" + getLnapcibilscore()
				+ ", getLnapannualincome()=" + getLnapannualincome() + ", getLnapdisposalincome()="
				+ getLnapdisposalincome() + ", getLnapstatus()=" + getLnapstatus() + ", getLnapconclusionremarks()="
				+ getLnapconclusionremarks() + ", getLnapprocesseduser()=" + getLnapprocesseduser()
				+ ", getLnapprocessedDate()=" + getLnapprocessedDate() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
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

}
