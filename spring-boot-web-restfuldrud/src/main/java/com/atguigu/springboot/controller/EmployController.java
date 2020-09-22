package com.atguigu.springboot.controller;

import com.atguigu.springboot.dao.DepartmentDao;
import com.atguigu.springboot.dao.EmployeeDao;
import com.atguigu.springboot.entities.Department;
import com.atguigu.springboot.entities.Employee;
import com.atguigu.springboot.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Map;

@Controller
public class EmployController {

    @Autowired
    private DepartmentDao departmentDao;

    @Autowired
    private  EmployeeMapper employeeMapper;

    @Autowired
    private  EmployeeDao employeeDao;

    @GetMapping("/emps")
    public String hello(Map<String,Object> map){

        Collection<Employee> collection=employeeDao.getAll();
        map.put("emps",collection);
        return "emp/list";
    }

    @GetMapping("/emp")
    public String emp(Map<String,Object> map){

        Collection<Department> collection=departmentDao.getDepartments();
        map.put("depts",collection);
        return "emp/add";
    }

    @PostMapping("/emp")
    public String addemp(Employee employee){

       // employeeDao.save(employee);
        employeeMapper.save(employee);
        return "redirect:/emps";
    }

    @GetMapping("/emp/{id}")
    public String toEditEmp(@PathVariable("id")Integer id, Model model){

          Employee employee=employeeDao.get(id);
         model.addAttribute("emp",employee);

        return "forward:/emp";
    }

    @PutMapping("/emp")
    public String updateEmp(Employee employee){

      //  employeeDao.save(employee);
        employeeMapper.save(employee);
        return "redirect:/emps";
    }

    @DeleteMapping("/emp/{id}")
    public String delEmp(@PathVariable("id")Integer id){

        employeeDao.delete(id);
        return "redirect:/emps";
    }
}
