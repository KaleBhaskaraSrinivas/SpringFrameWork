package com.masti.orm.loan.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "bha_loanNom")

public class Nominee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="inap_id")
	private Integer lnapid1;
	@Override
	public String toString() {
		return "Nominee [lnapid1=" + lnapid1 + ", lnapnominee=" + lnapnominee + ", lnaprelation=" + lnaprelation + "]";
	}

	@Column(name="inap_nominee")
	private String lnapnominee;
	@Column(name="inap_relation")
	private String lnaprelation;

	public Integer getLnapid1() {
		return lnapid1;
	}

	public void setLnapid1(Integer lnapid1) {
		this.lnapid1 = lnapid1;
	}

	public String getLnapnominee() {
		return lnapnominee;
	}

	public void setLnapnominee(String lnapnominee) {
		this.lnapnominee = lnapnominee;
	}

	public String getLnaprelation() {
		return lnaprelation;
	}

	public void setLnaprelation(String lnaprelation) {
		this.lnaprelation = lnaprelation;
	}

}
