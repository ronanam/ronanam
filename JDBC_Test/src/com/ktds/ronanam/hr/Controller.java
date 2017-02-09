package com.ktds.ronanam.hr;

import java.util.Scanner;

import com.ktds.ronanam.hr.biz.HRBizImpl;

public class Controller {

	public void start(){
		Scanner sc = new Scanner(System.in);
		System.out.print("> 검색하고자 하는 사원의 사원번호를 입력:");
		new HRBizImpl().printOneEmployees(sc.nextInt());
		sc.close();
	}
	public static void main(String[] args) {

//		HRBiz hrBiz = new HRBizImpl();
//		new HRBizImpl().printAllEmployees();
//		new HRBizImpl().printAllEmployeesWithDepartments();
//		new HRBizImpl().printAllEmployeesWithDepartmentsWithJobs();
//		new HRBizImpl().printAllCountriesWithRegions();
		new Controller().start();
//		new HRBizImpl().printAllEmployeesWithDepartments();
	}

}
