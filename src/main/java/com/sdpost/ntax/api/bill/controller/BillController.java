package com.sdpost.ntax.api.bill.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("bill")
public class BillController {

    @RequestMapping(value = "query-list",method = RequestMethod.GET,produces = "application/json;charset=UTF-8")
    @ResponseBody
    public String queryList(HttpServletRequest request){
        return "hello,world!";
    }
}
