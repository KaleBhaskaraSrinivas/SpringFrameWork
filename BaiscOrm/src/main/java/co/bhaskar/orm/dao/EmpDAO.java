package co.bhaskar.orm.dao;

import java.util.List;

import co.bhaskar.orm.model.Employee;

public interface EmpDAO {
	void persist(Employee emp);

	List<Employee> getAllEmployees();
}
