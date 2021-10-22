package com.shuai.response;

import com.shuai.common.RequestEnum;

/**
 * @ClassName HttpResultResponse
 * @Description TODO
 * @Author weis
 * @Date 2021/10/22 10:39
 * @Version
 */
public class HttpResultResponse<T> {

    private Integer code;

    private String message;

    private T data;

    private HttpResultResponse(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    private <T> HttpResultResponse<T> getInstance(RequestEnum requestEnum, T data) {
        return new HttpResultResponse<>(requestEnum.getCode(), requestEnum.getMessage(), data);
    }

    public <T> HttpResultResponse<T> success() {
        return getInstance(RequestEnum.REQUEST_SUCCESS, null);
    }

    public <T> HttpResultResponse<T> success(T data) {
        return getInstance(RequestEnum.REQUEST_SUCCESS, data);
    }

    public <T> HttpResultResponse<T> error() {
        return getInstance(RequestEnum.REQUEST_DEFAULT_ERROR, null);
    }

    public <T> HttpResultResponse<T> error(T data) {
        return getInstance(RequestEnum.REQUEST_DEFAULT_ERROR, data);
    }

    public <T> HttpResultResponse<T> error(RequestEnum requestEnum) {
        return getInstance(requestEnum, null);
    }

    public <T> HttpResultResponse<T> error(RequestEnum requestEnum, T data) {
        return getInstance(requestEnum, data);
    }

}
