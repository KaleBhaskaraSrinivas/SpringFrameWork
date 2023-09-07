package com.masti.orm.loan.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.masti.orm.loan.model.LoanInputApplication;

@Component
public interface LoanDAO {
	public List<LoanInputApplication> getAllLoanApplicants();
}