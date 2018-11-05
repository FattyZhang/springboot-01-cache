package com.zyg.cache;

import com.zyg.cache.bean.Employee;
import com.zyg.cache.service.EmployeeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;


@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot01CacheApplicationTests {

    @Autowired
    private EmployeeService employeeService;

    @Test
    public void contextLoads() {
        Employee employee = getEmployee();
        Integer update = employeeService.update(employee);
        System.out.println("update:"+update);
        Date date = new Date();
    }

    public Employee getEmployee() {
        Employee employee = employeeService.selectById(2);
        employee.setLastName("礼数");
        employee.setEmail("21355@126.com");
        employee.setGender(1);
        employee.setdId(4);
        return employee;
    }

    public void getString(){
        String str = "";
    }

}
