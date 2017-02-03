package com.ktds.bycicle.dao;

import java.util.List;

import com.ktds.bycicle.vo.BycicleVO;

public interface BycicleDao {
	public List<BycicleVO> borrowAdvanced();
	public List<BycicleVO> borrowMiddle();
	public List<BycicleVO> borrowBasic();
	
	public List<BycicleVO> backBasic(int pay);
	public List<BycicleVO> backMiddle(int pay);
	public List<BycicleVO> backAdvanced(int pay);
	
}
