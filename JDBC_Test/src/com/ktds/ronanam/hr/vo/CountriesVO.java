package com.ktds.ronanam.hr.vo;

public class CountriesVO {
	private String countryId;
	private String countryName;
	private int regionId;
	private RegionsVO regionsVO;
	
	
	public String getCountryId() {
		return countryId;
	}
	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public int getRegionId() {
		return regionId;
	}
	public void setRegionId(int regionId) {
		this.regionId = regionId;
	}
	public RegionsVO getRegionsVO() {
		if(regionsVO == null){
			regionsVO = new RegionsVO();
		}
		return regionsVO;
	}
	public void setRegionsVO(RegionsVO regionsVO) {
		this.regionsVO = regionsVO;
	}
	
	
	
	
}
