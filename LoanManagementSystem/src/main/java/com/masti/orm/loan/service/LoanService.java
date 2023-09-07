package com.masti.orm.loan.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.masti.orm.loan.dao.LoanDAOImpl;
import com.masti.orm.loan.entity.Customer;
import com.masti.orm.loan.entity.LoanApplicant;
import com.masti.orm.loan.entity.Nominee;
import com.masti.orm.loan.model.LoanInputApplication;


@Service
public class LoanService {

	private LoanDAOImpl serv;

	@Autowired
	public LoanService(LoanDAOImpl serv) {
		this.serv = serv;
	}

	@Transactional
	public void addC(Customer la) {
		serv.persist(la);
	}

	@Transactional
	public void addN(Nominee la) {
		serv.persist(la);
	}

	@Transactional
	public void addLa(LoanApplicant la) {
		serv.persist(la);
	}

	@Transactional(readOnly = true)
	public List<LoanInputApplication> listAll() {
		return serv.getAllLoanApplicants();
	}


}