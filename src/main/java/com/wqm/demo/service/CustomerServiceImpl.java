package com.wqm.demo.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.blueflame.dubbo.DubboProviderService;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements  CustomerService {
    @Reference
    private DubboProviderService dubboProviderService;

    public String findByProvince(String province) {
        if(null==dubboProviderService){
            return "服务提供者为空";
        }
        String s = dubboProviderService.findByProvince(province);
        if(null==s){
            return "结果为空";
        }else{
            System.out.println("有结果返回，success");
            return s;
        }
    }
}
