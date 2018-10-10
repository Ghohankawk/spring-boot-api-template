package com.sogou.booking.pojo;

import java.io.Serializable;

/**
 * @author hankun
 * @create 2018-08-02 16:59
 */
public class CommonResult<T> implements Serializable {


    private static final long serialVersionUID = -1658195492701928247L;
    /***
     * 返回码默认为0，成功
     * */
    private Integer code = 0;
    /***
     * 返回码信息，成功
     * */
    private String message = "success";

    private T data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
