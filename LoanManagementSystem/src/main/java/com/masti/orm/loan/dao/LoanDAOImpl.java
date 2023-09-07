package com.masti.orm.loan.dao;



import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;

import com.masti.orm.loan.entity.Customer;
import com.masti.orm.loan.entity.LoanApplicant;
import com.masti.orm.loan.entity.Nominee;
import com.masti.orm.loan.model.LoanInputApplication;


@Component
public class LoanDAOImpl implements LoanDAO {

	@PersistenceContext
	protected  EntityManager em;

	public void persist(Customer la) {
		em.persist(la);
	}

	public void persist(Nominee la) {
		em.persist(la);
	}

	public void persist(LoanApplicant la) {
		em.persist(la);
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<LoanInputApplication> getAllLoanApplicants() {
		return em.createQuery("SELECT la FROM LoanInputApplication la").getResultList();
	}
}