package com.bhaskar.jdbc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bhaskar.jdbc.dao.EmpDAO;
import com.bhaskar.jdbc.model.Employee;
@Controller
public class EmpCRUDController {
	private final EmpDAO edao;
	@Autowired
	public EmpCRUDController(EmpDAO edao) {
		this.edao = edao;
	}

	@RequestMapping(value = "/emplist", method = RequestMethod.GET)
	public String getAllEmployees(Model model) {
		System.out.println("Employee List jsp requested");
		List<Employee>empList = edao.getAllEmployees();
		model.addAttribute("elist",empList);
		return "emplist";
	}

	@PostMapping("/deleteEmployee")
	@ResponseBody
	public ResponseEntity<String> deleteEmployee(@RequestParam("empno") Integer empno) {
		Employee employee = edao.getEmployeeByNo(empno);

		if (employee != null) {
			boolean deleted = edao.deleteEmployee(employee);
			if (deleted) {
				return ResponseEntity.ok("Employee deleted successfully");
			} else {
				return ResponseEntity.badRequest().body("Error deleting employee");
			}
		} else {
			return ResponseEntity.badRequest().body("Employee not found");
		}
	}

	@RequestMapping(value = "/createEmployee", method = RequestMethod.GET)
	public String showCreateEmployeeForm() {
		return "createEmployee"; // Return the JSP page name
	}

	@RequestMapping(value = "/saveEmployee", method = RequestMethod.POST)
	public String saveEmployee(@RequestParam("empno") Integer empno,
			@RequestParam("dept_no") Integer dept_no,
			@RequestParam("ename") String ename,
			@RequestParam("job") String job,
			@RequestParam("sal") Double sal) {
		Employee newEmployee = new Employee(empno,dept_no,ename,job,sal);
		boolean created = edao.createEmployee(newEmployee);

		if (created) {
			return "redirect:/emplist"; // Redirect to employee list after successful creation
		} else {
			return "error"; // Return an error page if creation fails
		}
	}





}
