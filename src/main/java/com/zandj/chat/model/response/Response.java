package com.zandj.chat.model.response;

import lombok.Data;

@Data
public class Response<T> {
    private T data;

    private Object appendix;

    private String code;

    private String msg;

}
