package com.coolweather.app.model;
/***
 * ���ܣ�ʡ��������Ϣ
 * 
 * @author MiracleWong
 *
 */
public class Province {
	// ����������
	private int id;
	// ʡ��
	private String provinceName;
	// ʡ������
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