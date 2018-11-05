package com.zyg.cache.service.impl;

import com.zyg.cache.bean.Employee;
import com.zyg.cache.mapper.EmployeeMapper;
import com.zyg.cache.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public Employee selectById(Integer id) {
        return employeeMapper.selectById(id);
    }

    @Override
    public Integer update(Employee employee) {
        getSystem();
        return employeeMapper.update(employee);
    }

    public void getSystem() {
        System.out.println("123123123123123");
        System.out.println("123123123123123");
        System.out.println("123123123123123");
        System.out.println("123123123123123");
    }

    @Override
    public Integer insert(Employee employee) {
        return employeeMapper.insert(employee);
    }

    @Override
    public Integer deleteById(Integer id) {
        return employeeMapper.deleteById(id);
    }

}
