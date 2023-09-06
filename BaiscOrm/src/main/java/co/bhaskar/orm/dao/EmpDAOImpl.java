
package co.bhaskar.orm.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;

import co.bhaskar.orm.model.Employee;

@Component
public class EmpDAOImpl implements EmpDAO {

	@PersistenceContext
	private EntityManager em;

	@Override
	public void persist(Employee emp) {
		em.persist(emp);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return em.createQuery("SELECT e FROM Employee e", Employee.class).getResultList();
	}
}
