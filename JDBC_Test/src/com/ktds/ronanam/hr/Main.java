package com.ktds.ronanam.hr;

import java.util.List;

import com.ktds.ronanam.hr.dao.HRDao;
import com.ktds.ronanam.hr.dao.HRDaoImpl;
import com.ktds.ronanam.hr.vo.EmployeesVO;

public class Main {

	public static void main(String[] args) {
		HRDao hrDao = new HRDaoImpl();
		// hrDao.getAllEmployees()의 반환값이 null or employess list
		// 그렇게 때문에 오류가 나면 nullpointerException이 발생
		/*
		 * 오라클 인스턴스에 연결 실패. 시스템 종료. Exception in thread "main"
		 * java.lang.NullPointerException at
		 * com.ktds.ronanam.hr.Main.main(Main.java:16)
		 */
		List<EmployeesVO> employees = hrDao.getAllEmployees();
		for (EmployeesVO employeesVO : employees) {
			System.out.print(employeesVO.getEmployeeId() + "\t");
			System.out.print(employeesVO.getFirstName() + "\t");
			System.out.print(employeesVO.getLastName() + "\n");
		}

	}

}
