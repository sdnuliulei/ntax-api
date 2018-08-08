package com.sdpost.ntax.api.bill.controller;

import com.sdpost.ntax.api.bill.model.DeclarationInfo;
import com.sdpost.ntax.api.bill.service.DeclarationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("bill")
public class BillController {

    @Autowired
    private DeclarationService service;

    @RequestMapping(value = "query-list",method = RequestMethod.GET,produces = "application/json;charset=UTF-8")
    @ResponseBody
    public String queryList(HttpServletRequest request) throws Exception{
        DeclarationInfo declarationInfo=service.Gets("20180509105617VB3FzbvT");
        return "hello,world!";
    }
}
