package com.ktds.ronanam.hr;

import java.util.List;

import com.ktds.ronanam.hr.dao.HRDao;
import com.ktds.ronanam.hr.dao.HRDaoImpl;
import com.ktds.ronanam.hr.vo.EmployeesVO;

public class Main {

	public static void main(String[] args) {
		HRDao hrDao = new HRDaoImpl();
		// hrDao.getAllEmployees()�� ��ȯ���� null or employess list
		// �׷��� ������ ������ ���� nullpointerException�� �߻�
		/*
		 * ����Ŭ �ν��Ͻ��� ���� ����. �ý��� ����. Exception in thread "main"
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