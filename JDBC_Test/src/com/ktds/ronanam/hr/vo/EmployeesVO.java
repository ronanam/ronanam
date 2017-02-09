package com.ktds.ronanam.hr.vo;

import com.ktds.ronanam.dao.support.annotation.Types;

public class EmployeesVO {
	@Types
	private int employeeId;
	@Types
	private String firstName;
	@Types
	private String lastName;
	@Types
	private String hireDate; // Date type은 String으로 받아오기.
	@Types
	private String email;
	@Types
	private String phoneNumber;
	@Types
	private String jobId;
	@Types
	private int salary;
	@Types
	private int managerId;
	@Types(alias = "E_DEPARTMENT_ID")
	private int departmentId;
	@Types
	private double commissionPct;

	//DepartmentsVO , JobVO에는 @types 붙여주지 않는다.
	private DepartmentsVO departments; // 한 사원이 부서의 정보를 가지고 있다. 조인표현 방법.
	private JobsVO job; // 한 사원의 job관련 정보를 가진다. join

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getHireDate() {
		return hireDate;
	}

	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getJobId() {
		return jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getManagerId() {
		return managerId;
	}

	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public double getCommissionPct() {
		return commissionPct;
	}

	public void setCommissionPct(double commissionPct) {
		this.commissionPct = commissionPct;
	}

	// 채이닝을 위해서 NULL 체크
	public DepartmentsVO getDepartments() {
		if (departments == null) {
			departments = new DepartmentsVO(); // 조인을 걸 getter한테.
		}
		return departments;
	}

	public void setDepartments(DepartmentsVO departments) {
		this.departments = departments;
	}

	public JobsVO getJob() {
		if (job == null) {
			job = new JobsVO();
		}
		return job;
	}

	public void setJob(JobsVO job) {
		this.job = job;
	}

}
