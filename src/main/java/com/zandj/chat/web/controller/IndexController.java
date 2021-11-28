package com.zandj.chat.web.controller;

import com.google.gson.Gson;
import com.zandj.chat.web.response.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/", produces="application/json")
public class IndexController {
    @GetMapping("/index")
    public ResponseEntity<Response<String>> index() {
        Response<String> response = new Response<String>();

        response.setCode("custom code");
        String respData = "hello world";
        response.setData(respData);

        Gson gson = new Gson();
        String responseToString = gson.toJson(response);
        ResponseEntity entity = new ResponseEntity(responseToString,HttpStatus.OK);


    return entity;
    }
}
