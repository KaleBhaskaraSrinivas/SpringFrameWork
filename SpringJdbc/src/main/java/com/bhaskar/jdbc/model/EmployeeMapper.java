package com.bhaskar.jdbc.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EmployeeMapper implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet resultSet, int i) throws SQLException {

		Employee emp = new Employee();
		emp.setEmpNo(resultSet.getInt("empno"));
		emp.setEName(resultSet.getString("ename"));
		emp.setJob(resultSet.getString("job"));
		emp.setSalary(resultSet.getDouble("sal"));
		emp.setDeptNo(resultSet.getInt("dept_no"));
		return emp;
	}
}