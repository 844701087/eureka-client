package com.lkf.code;

/**
 * 异常信息
 * Created by likaifeng on 2017/9/27.
 */
public enum ResponseCode {
    SUCCESS(1,"操作成功"),
    FAILURE(0,"调用失败"),//无法确定错误级别
    TWOERROR(200,"200错误"),
    THREEERROR(300,"300错误"),
    FOURERROR(400,"400错误"),
    FIVEERROR(500,"500错误"),
    ;

    private int code;
    private String msg;

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

    private ResponseCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    //根据code获取内容
    public String getMsg(int code) {
        ResponseCode resultEnum = null;
        ResponseCode[] enumArray = ResponseCode.values();
        for (int i = 0; i < enumArray.length; i++) {
            if (enumArray[i].getCode() == code) {
                resultEnum = enumArray[i];
                break;
            }
        }
        return resultEnum.getMsg();
    }
}
