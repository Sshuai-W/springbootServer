package com.shuai.common;

/**
 * @ClassName RequestEnum
 * @Description TODO
 * @Author weis
 * @Date 2021/10/22 10:33
 * @Version
 */
public enum RequestEnum {

    REQUEST_SUCCESS(200,"成功"),
    REQUEST_DEFAULT_ERROR(501,"操作失败");

    private Integer code;

    private String message;

    RequestEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
