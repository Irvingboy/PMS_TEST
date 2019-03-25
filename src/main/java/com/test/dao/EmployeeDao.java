package com.test.dao;

import com.test.entity.Employee;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeDao {

    @Select("select * from employee where name=#{name}")
    Employee findEmployeeByName(String name);
}
