package com.ktds.ronanam.hr.biz;

import com.ktds.ronanam.hr.biz.HRBizImpl;

public class Controller {

	public static void main(String[] args) {

//		HRBiz hrBiz = new HRBizImpl();
		new HRBizImpl().printAllEmployees();
	}

}
