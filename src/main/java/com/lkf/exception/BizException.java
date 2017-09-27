package com.lkf.exception;

/**
 *自定义异常，主要用于业务异常。一层层的网上抛，一直到controller进行catch
 *@author: lkf
 *@Date: 2017/9/27 14:26
 */
public class BizException extends Exception {
	private int code;
	private String msg;

	public BizException(String msg) {
		super(msg);
		this.msg = msg;
	}

	public BizException(int code, String msg) {
		super(msg);
		this.code = code;
		this.msg = msg;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}
