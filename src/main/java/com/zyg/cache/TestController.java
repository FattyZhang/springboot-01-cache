package com.zyg.cache;

import com.zyg.cache.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author Administrator
 * @date 2018/11/5 - 16:28
 */
@Controller
public class TestController {
    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("hello")
    @ResponseBody
    public String hello(){
        System.out.println("111111111");
        return "qweqweqweqweqwe";
    }

}
