package com.ktds.bycicle.dao;

import java.util.ArrayList;
import java.util.List;

import com.ktds.bycicle.vo.BycicleVO;

public class BycicleDaoImpl implements BycicleDao, Gettable {
	public List<BycicleVO> bycicle;


	public BycicleDaoImpl() {
		bycicle = new ArrayList<BycicleVO>();
		
		BycicleVO bycicleVO = new BycicleVO();
		BycicleVO meVO = new BycicleVO();
		// 초기화
		bycicleVO.setAdvancedQuantity(30);
		bycicleVO.setMiddleQuantity(30);
		bycicleVO.setBasicQuantity(30);
		bycicleVO.setMoney(500000);

		meVO.setMoney(100000);

		newBycicle(bycicleVO);
		newBycicle(meVO);
	}

	public void newBycicle(BycicleVO bicycle) {
		bycicle.add(bicycle);
	}
	@Override
	public List<BycicleVO> borrowAdvanced() {
		bycicle.get(0).setAdvancedQuantity(bycicle.get(0).getAdvancedQuantity() - 1);
		bycicle.get(1).setAdvancedQuantity(bycicle.get(1).getAdvancedQuantity() + 1);

		return bycicle;
	}
	@Override
	public List<BycicleVO> borrowMiddle() {
		bycicle.get(0).setMiddleQuantity(bycicle.get(0).getAdvancedQuantity() - 1);
		bycicle.get(1).setMiddleQuantity(bycicle.get(1).getAdvancedQuantity() + 1);

		return bycicle;
	}
	@Override
	public List<BycicleVO> borrowBasic() {
		bycicle.get(0).setBasicQuantity(bycicle.get(0).getBasicQuantity() - 1);
		bycicle.get(1).setBasicQuantity(bycicle.get(1).getBasicQuantity() + 1);

		return bycicle;
	}
	
	public List<BycicleVO> backAdvanced(int pay) {

		bycicle.get(0).setAdvancedQuantity(bycicle.get(0).getAdvancedQuantity() + 1);
		bycicle.get(1).setAdvancedQuantity(bycicle.get(1).getAdvancedQuantity() - 1);

		bycicle.get(0).setMoney(bycicle.get(0).getMoney() + pay);
		bycicle.get(1).setMoney(bycicle.get(1).getMoney() - pay);

		return bycicle;
	}

	
	public List<BycicleVO> backMiddle(int pay) {
		bycicle.get(0).setMiddleQuantity(bycicle.get(0).getAdvancedQuantity() + 1);
		bycicle.get(1).setMiddleQuantity(bycicle.get(1).getAdvancedQuantity() - 1);

		bycicle.get(0).setMoney(bycicle.get(0).getMoney() + pay);
		bycicle.get(1).setMoney(bycicle.get(1).getMoney() - pay);

		return bycicle;
	}

	public List<BycicleVO> backBasic(int pay) {
		bycicle.get(0).setBasicQuantity(bycicle.get(0).getBasicQuantity() + 1);
		bycicle.get(1).setBasicQuantity(bycicle.get(1).getBasicQuantity() - 1);

		bycicle.get(0).setMoney(bycicle.get(0).getMoney() + pay);
		bycicle.get(1).setMoney(bycicle.get(1).getMoney() - pay);

		return bycicle;
	}

	@Override
	public List<BycicleVO> bycicles() {
		return bycicle;
	}


}
