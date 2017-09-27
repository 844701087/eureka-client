package com.lkf.code;


import com.lkf.exception.BizException;

/**
 *  响应对象
 *
 * { "code": 1, "msg": "XXXXX" , "data": ... }
 *@author: lkf
 *@Date: 2017/9/27 14:23
 */
public class ResponseEntity {
    private int code;

    private String msg;

    private Object data;

    /**
     * 通用成功
     * 
     * @return
     */
    public ResponseEntity success() {
        this.code = ResponseCode.SUCCESS.getCode();
        this.msg = ResponseCode.SUCCESS.getMsg();
        return this;
    }

    /**
     * 成功后有返回对象
     * 
     * @param data
     * @return
     */
    public ResponseEntity success(Object data) {
        this.code = ResponseCode.SUCCESS.getCode();
        this.msg = ResponseCode.SUCCESS.getMsg();
        this.data = data;
        return this;
    }

    /**
     * 失败后有返回对象
     * 
     * @param data
     * @return
     */
    public ResponseEntity failure(Object data) {
        this.code = ResponseCode.FAILURE.getCode();
        this.msg = ResponseCode.FAILURE.getMsg();
        this.data = data;
        return this;
    }

    /**
     * 主要显示业务逻辑上的失败
     * 
     * @param message
     * @return
     */
    public ResponseEntity failure(BizException be) {
        this.code = be.getCode();
        this.msg = be.getMsg();
        return this;
    }

    /**
     * 主要显示业务逻辑上的失败
     * 
     * @param message
     * @return
     */
    public ResponseEntity failure(String message) {
        this.code = ResponseCode.FAILURE.getCode();
        this.msg = message;
        return this;
    }

    /**
     * 具体的系统错误, 且有返回对象
     * 
     * @param code
     * @param message
     * @param data
     * @return
     *
     * @author xiongwei
     * @date 2016年12月7日
     */
    public ResponseEntity failure(int code, String message, Object data) {
        this.code = code;
        this.msg = message;
        this.data = data;
        return this;
    }

    /**
     * 具体的系统错误
     * 
     * @param code
     * @param message
     * @return
     */
    public ResponseEntity failure(int code, String message) {
        this.code = code;
        this.msg = message;
        return this;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public Object getData() {
        return data;
    }
}
