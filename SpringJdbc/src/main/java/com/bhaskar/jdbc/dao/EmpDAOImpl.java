package com.bhaskar.jdbc.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.bhaskar.jdbc.model.Employee;
import com.bhaskar.jdbc.model.EmployeeMapper;

public class EmpDAOImpl implements EmpDAO{

	JdbcTemplate jdbcTemplate;

	private final String SQL_FIND_EMPLOYEE = "select * from king_emp where empno = ?";
	private final String SQL_DELETE_EMPLOYEE = "delete from king_emp where empno = ?";
	private final String SQL_UPDATE_EMPLOYEE = "update king_emp set ename = ?, job = ?, sal  = ?, dept_no  = ? where empno = ?";
	private final String SQL_GET_ALL = "select * from king_emp";
	private final String SQL_INSERT_EMPLOYEE = "insert into king_emp(empno, ename, job, sal,dept_no) values(?,?,?,?,?)";

	@Autowired
	public EmpDAOImpl(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}


	@Override
	public Employee getEmployeeByNo(Integer eno) {
		return jdbcTemplate.queryForObject(SQL_FIND_EMPLOYEE, new Object[] { eno }, new EmployeeMapper());
	}

	@Override
	public List<Employee> getAllEmployees(){
		return jdbcTemplate.query(SQL_GET_ALL, new EmployeeMapper());
	}

	@Override
	public boolean deleteEmployee(Employee e) {
		return jdbcTemplate.update(SQL_DELETE_EMPLOYEE, e.getEmpNo()) > 0;
	}

	@Override
	public boolean updateEmployee(Employee e) {
		Employee existingEmployee = getEmployeeByNo(e.getEmpNo());

		if (existingEmployee == null) {
			return false; // Employee not found, cannot update
		}

		// Check if any changes were made
		boolean hasChanges = false;
		if (!existingEmployee.getEName().equals(e.getEName())) {
			hasChanges = true;
		}
		if (!existingEmployee.getJob().equals(e.getJob())) {
			hasChanges = true;
		}
		if (!existingEmployee.getSalary().equals(e.getSalary())) {
			hasChanges = true;
		}
		if (!existingEmployee.getDeptNo().equals(e.getDeptNo())) {
			hasChanges = true;
		}

		if (hasChanges) {
			return jdbcTemplate.update(
					SQL_UPDATE_EMPLOYEE,
					e.getEName(),
					e.getJob(),
					e.getSalary(),
					e.getDeptNo(),
					e.getEmpNo()
					) > 0;
		} else {
			return false; // No changes were made, no update needed
		}
	}


	@Override
	public boolean createEmployee(Employee e) {
		return jdbcTemplate.update(SQL_INSERT_EMPLOYEE, e.getEmpNo(), e.getEName(), e.getJob(),
				e.getSalary(),e.getDeptNo()) > 0;
	}
}
