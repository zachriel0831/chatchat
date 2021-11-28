package com.zandj.chat.web.response;

import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class Response<T> {
    private T data;

    private Object appendix;

    private String code;

    private String msg;
}
