package com.coolweather.app.util;
/**
 * HttpCallbackListener接口用来回调服务返回的结果
 * @author MiracleWong
 *
 */
public interface HttpCallbackListener {

	void onFinish(String response);

	void onError(Exception e);

}
