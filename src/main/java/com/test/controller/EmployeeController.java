package com.test.controller;

import com.alibaba.fastjson.JSON;
import com.test.entity.Employee;
import com.test.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("query")
    public void query(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String name = request.getParameter("name");
        Employee employee = employeeService.findEmployeeByName(name);

        response.setContentType("text/html;charset=utf-8");
        response.getWriter().write(JSON.toJSONString(employee));
        response.getWriter().close();
    }
}
