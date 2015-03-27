package com.coolweather.app.model;
/***
 * 功能：省的数据信息
 * 
 * @author MiracleWong
 *
 */
public class Province {
	// 自增长主键
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
