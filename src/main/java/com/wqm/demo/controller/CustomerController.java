package com.wqm.demo.controller;

import com.wqm.demo.service.CustomerService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class CustomerController {
    @Resource
    CustomerService customerService;

    @RequestMapping(value = "/find")
    public String findByProvince(@RequestParam String province) {
       return customerService.findByProvince(province);
    }
}
