package com.ktds.bycicle.biz;

import java.util.ArrayList;
import java.util.List;

import com.ktds.bycicle.dao.BycicleDao;
import com.ktds.bycicle.dao.BycicleDaoImpl;
import com.ktds.bycicle.dao.Gettable;
import com.ktds.bycicle.vo.BycicleVO;

public class BycicleBizImpl implements BycicleBiz {

	BycicleDao dao = new BycicleDaoImpl();

	@Override
	public void transaction(byte menu) {

		if (menu == 1) {

			dao.borrowAdvanced();

		} else if (menu == 2) {

			dao.borrowMiddle();

		} else {
			dao.borrowBasic();

		}

		printTotal();

	}

	@Override
	public void back(byte menu, int time) {
		int pay = 0;

		if (menu == 1) {

			pay = (time * 5000) / 60;
			dao.backAdvanced(pay);

		} else if (menu == 2) {
			pay = (time * 3000) / 60;
			dao.backMiddle(pay);

		} else {
			pay = (time * 1000) / 60;
			dao.backBasic(pay);

		}

		printTotal();

	}

	public void printTotal() {
		List<BycicleVO> bycicle = new ArrayList<BycicleVO>();
		Gettable gettable = (Gettable) dao;
		bycicle = gettable.bycicles();

		System.out.printf("자전거 대여점 현황: %d %d %d, 예산: %d\n", bycicle.get(0).getAdvancedQuantity(),
				bycicle.get(0).getMiddleQuantity(), bycicle.get(0).getBasicQuantity(), bycicle.get(0).getMoney());

		System.out.printf("사용자 현황: %d %d %d 돈: %d\n", bycicle.get(1).getAdvancedQuantity(),
				bycicle.get(1).getMiddleQuantity(), bycicle.get(1).getBasicQuantity(), bycicle.get(1).getMoney());
	}

}
