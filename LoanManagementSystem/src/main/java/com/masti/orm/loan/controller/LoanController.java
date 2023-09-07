package com.masti.orm.loan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.masti.orm.loan.entity.Customer;
import com.masti.orm.loan.entity.LoanApplicant;
import com.masti.orm.loan.entity.Nominee;
import com.masti.orm.loan.model.LoanInputApplication;
import com.masti.orm.loan.service.LoanService;

@Controller
public class LoanController {
	private LoanService loanser;

	@Autowired
	public LoanController(LoanService loanser) {
		this.loanser = loanser;
	}

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home() {
		return "LoanDetails";
	}

	@RequestMapping(value = "/submitApp", method = RequestMethod.GET)
	public String SubApp(@ModelAttribute("loanInputApplication") LoanInputApplication lnInput) {
		return "preview";
	}

	@RequestMapping(value = "/save", method = RequestMethod.GET)
	public String saveNew(@Validated Customer c, @Validated Nominee l, @Validated LoanApplicant n, Model model) {
		System.out.println(c.toString());
		System.out.println(l.toString());
		System.out.println(n.toString());
		loanser.addC(c);
		loanser.addLa(n);
		loanser.addN(l);
		return "success";
	}

}
