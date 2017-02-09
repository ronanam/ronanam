package com.ktds.ronanam.hr.dao;

import java.util.List;

import com.ktds.ronanam.hr.vo.CountriesVO;
import com.ktds.ronanam.hr.vo.EmployeesVO;

/**
 * Dao: 무조건 try/catch로 예외처리 다 해주기.
 * @author RONANAM
 */
public interface HRDao {

	// 여러 명의 정보: List<EmployeesVO>
	public List<EmployeesVO> getAllEmployees();

	// 한 명의 정보: EmployeesVO
	public EmployeesVO findOneEmployee(int employeeId);

	public List<EmployeesVO> getJoinEmployeesDepartments();

	public List<EmployeesVO> getJoinEmployeesDepartmentsJobs();

	public List<CountriesVO> getJoinCountriesRegions();

}
