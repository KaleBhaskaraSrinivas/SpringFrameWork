package com.bhaskar.jdbc.model;

public class Employee {
	private Integer empno;
	private Integer dept_no;
	private String ename;
	private String job;
	private Double sal;


	public Employee() {
	}

	public Employee(Integer eno, Integer dno, String enm, String jb,Double sal) {
		this.empno = eno;
		this.ename = enm;
		this.job = jb;
		this.sal = sal;
		this.dept_no=dno;
	}

	public Integer getEmpNo() {
		return empno;
	}

	public void setEmpNo(Integer eno) {
		this.empno=eno;
	}

	public Integer getDeptNo() {
		return dept_no;
	}

	public void setDeptNo(Integer dno) {
		this.dept_no = dno;
	}

	public String getEName() {
		return ename;
	}

	public void setEName(String enm) {
		this.ename = enm;
	}

	public String getJob() {
		return job;
	}
	public void setJob(String jb) {
		this.job = jb;
	}

	public Double getSalary() {
		return sal;
	}

	public void setSalary(double sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employee{" +
				"Emp No=" + empno +
				", deptNo=" + dept_no +
				", EmpName='" + ename + '\'' +
				", job='" + job + '\'' +
				", salary=" + sal +
				'}';
	}


}

