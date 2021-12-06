package com.zandj.chat.controller;

import com.google.gson.Gson;
import com.zandj.chat.model.response.IndexResponse;
import com.zandj.chat.model.response.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping(value="/")
public class IndexController {
    @GetMapping("/index")
    public String index(Model model) {
//        Response<String> response = new Response<String>();
//
//        response.setCode("custom code");
//        String respData = "hello world";
//        response.setData(respData);
//
//        Gson gson = new Gson();
//        String responseToString = gson.toJson(response);
//        ResponseEntity entity = new ResponseEntity(responseToString,HttpStatus.OK);
        IndexResponse indexResponse = new IndexResponse();
        indexResponse.setHello("hello world");

        model.addAttribute("data", indexResponse);

        return "index";
    }
}
