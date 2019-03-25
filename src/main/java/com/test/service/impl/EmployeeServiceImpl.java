package com.test.service.impl;

import com.test.dao.EmployeeDao;
import com.test.entity.Employee;
import com.test.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;

    @Override
    public Employee findEmployeeByName(String name) {
        return employeeDao.findEmployeeByName(name);
    }
}
