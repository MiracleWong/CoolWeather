package com.coolweather.app.model;
/**
 * 创建County类
 * @author MiracleWong
 *
 */
public class County {
	// 自增长的ID
	private int id;
	// 县名
	private String countyName;
	// 县级代号
	private String countyCode;
	// County表关联的City表的外键
	private int cityId;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCountyName() {
		return countyName;
	}

	public void setCountyName(String countyName) {
		this.countyName = countyName;
	}

	public String getCountyCode() {
		return countyCode;
	}

	public void setCountyCode(String countyCode) {
		this.countyCode = countyCode;
	}

	public int getCityId() {
		return cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}
	
}
