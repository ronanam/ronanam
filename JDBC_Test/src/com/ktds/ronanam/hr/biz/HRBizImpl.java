package com.ktds.ronanam.hr.biz;

import java.util.List;

import com.ktds.ronanam.hr.dao.HRDao;
import com.ktds.ronanam.hr.dao.HRDaoImpl;
import com.ktds.ronanam.hr.vo.CountriesVO;
import com.ktds.ronanam.hr.vo.EmployeesVO;

public class HRBizImpl implements HRBiz {

	private HRDao hrDao;

	public HRBizImpl() {
		hrDao = new HRDaoImpl();
	}

	@Override
	public void printAllEmployees() {
		List<EmployeesVO> allEmployees = hrDao.getAllEmployees();

		for (EmployeesVO employessVO : allEmployees) {
			System.out.printf("%d\t%s\t%s\t%.2f\t%d\t%s\t%s\t%s\t%d\t%s\t%d\n", employessVO.getEmployeeId(),
					employessVO.getFirstName(), employessVO.getLastName(), employessVO.getCommissionPct(),
					employessVO.getDepartmentId(), employessVO.getEmail(), employessVO.getHireDate(),
					employessVO.getJobId(), employessVO.getManagerId(), employessVO.getPhoneNumber(),
					employessVO.getSalary());
		}

	}

	@Override
	public void printAllEmployeesWithDepartments() {
		List<EmployeesVO> allEmployees = hrDao.getJoinEmployeesDepartments();
		// 채이닝 분리하기
		for (EmployeesVO employessVO : allEmployees) {
			System.out.printf("%d\t%s\t%s\t%.2f\t%d\t%s\t%s\t%s\t%d\t%s\t%d\t%d\t%s\t%d\t%d\n",
					employessVO.getEmployeeId(), employessVO.getFirstName(), employessVO.getLastName(),
					employessVO.getCommissionPct(), employessVO.getDepartmentId(), employessVO.getEmail(),
					employessVO.getHireDate(), employessVO.getJobId(), employessVO.getManagerId(),
					employessVO.getPhoneNumber(), employessVO.getSalary(),
					employessVO.getDepartments().getDepartmentId(), employessVO.getDepartments().getDapartmentName(),
					employessVO.getDepartments().getManagerId(), employessVO.getDepartments().getLocationId());
		}

	}

	@Override
	public void printAllEmployeesWithDepartmentsWithJobs() {
		List<EmployeesVO> allEmployees = hrDao.getJoinEmployeesDepartmentsJobs();

		for (EmployeesVO employessVO : allEmployees) {
			System.out.printf("%d\t%s\t%s\t%.2f\t%d\t%s\t%s\t%s\t%d\t%s\t%d\t%d\t%s\t%d\t%d\t%s\t%s\t%d\t%d\n",
					employessVO.getEmployeeId(), employessVO.getFirstName(), employessVO.getLastName(),
					employessVO.getCommissionPct(), employessVO.getDepartmentId(), employessVO.getEmail(),
					employessVO.getHireDate(), employessVO.getJobId(), employessVO.getManagerId(),
					employessVO.getPhoneNumber(), employessVO.getSalary(),
					employessVO.getDepartments().getDepartmentId(), employessVO.getDepartments().getDapartmentName(),
					employessVO.getDepartments().getManagerId(), employessVO.getDepartments().getLocationId(),
					employessVO.getJob().getJobId(), employessVO.getJob().getJobTitle(),
					employessVO.getJob().getMinSalary(), employessVO.getJob().getMaxSalary());
		}

	}

	@Override
	public void printAllCountriesWithRegions() {
		List<CountriesVO> allcountries = hrDao.getJoinCountriesRegions();

		for (CountriesVO countriesVO : allcountries) {
			System.out.printf("%s\t%s\t%d\t%s\n", countriesVO.getCountryId(), countriesVO.getCountryName()

					, countriesVO.getRegionsVO().getRegionId(), countriesVO.getRegionsVO().getName());
		}
	}

	@Override
	public void printOneEmployees(int employeeId) {
		EmployeesVO employee = hrDao.findOneEmployee(employeeId);
		System.out.print(employee.getEmployeeId() + "\t");
		System.out.print(employee.getFirstName() + "\t");
		System.out.print(employee.getLastName() + "\t");
		System.out.print(employee.getEmail() + "\t");
		System.out.print(employee.getPhoneNumber() + "\t");
		System.out.print(employee.getHireDate() + "\t");
		System.out.print(employee.getJobId() + "\t");
		System.out.print(employee.getSalary() + "\t");
		System.out.print(employee.getCommissionPct() + "\t");
		System.out.print(employee.getManagerId() + "\t");
		System.out.print(employee.getDepartmentId() + "\n");
	}
}
