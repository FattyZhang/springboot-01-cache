package com.zyg.cache.service;

import com.zyg.cache.bean.Employee;

public interface EmployeeService {

    public Employee selectById(Integer id);

    public Integer update(Employee employee);

    public Integer insert(Employee employee);

    public Integer deleteById(Integer id);
}
