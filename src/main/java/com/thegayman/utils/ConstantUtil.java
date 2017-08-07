package com.thegayman.utils;

public class ConstantUtil {
	// 接口调用状态 0：失败 1：成功
	public static Integer RESULT_SUCCESS = 1;
	public static Integer RESULT_FAIL = 0;
	public static String RESULT_SUCCESS_MSG = "成功";
	public static String RESULT_FAIL_MSG = "失败";
	/**
	 * session保存的用户tooken
	 */
	public static String SESSION_TOOKEN="token";
	
	public static String VoPassword="VoPassword";
	
	public static String submitToken="submitToken";
	public static String LOG="LOG";
	/**
	 * 客户端发送的请求参数名
	 */
	public static final String PARAM_NAME="WEB_PARAM";
	
	public static final Integer pageSize = 10;
	
	public static final String CURRENT_USER="currentUser";
	/**
	 * session过期
	 */
	public static final Integer CODE_SESSION_INVALID=101;
	//请求中含有非法字符
	public static final Integer CODE_XSS_INVALID=102;
}
