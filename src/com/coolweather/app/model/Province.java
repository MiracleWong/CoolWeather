package com.coolweather.app.model;
/***
 * 创建Province类
 * @author MiracleWong
 *
 */
public class Province {
	// 自增长的ID
	private int id;
	// 省名
	private String provinceName;
	// 省级代号
	private String provinceCode;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProvinceName() {
		return provinceName;
	}

	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}

	public String getProvinceCode() {
		return provinceCode;
	}

	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

}
