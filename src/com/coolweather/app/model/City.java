package com.coolweather.app.model;
/**
 * 创建City类
 * @author MiracleWong
 *
 */
public class City {
	// 自增长的ID
	private int id;
	// 城市名
	private String cityName;
	// 城市代号
	private String cityCode;
	// City表关联的Province表的外键
	private int provinceId;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getCityCode() {
		return cityCode;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public int getProvinceId() {
		return provinceId;
	}

	public void setProvinceId(int provinceId) {
		this.provinceId = provinceId;
	}

}
