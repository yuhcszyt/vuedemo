package com.yuhaichang.springwed.controller;

import com.yuhaichang.springwed.Dao.EmpolyeeDao;
import com.yuhaichang.springwed.Entity.Empolyee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class EmployeeController {

        @Autowired
        private EmpolyeeDao empolyeeDao;

        @RequestMapping("/user/add")
        public String addUser(Empolyee empolyee){


            List<Empolyee> list=empolyeeDao.findEmployees(empolyee.getUserName());
            if (list!=null&&list.size()>0) {
                return "index";
            }else{
                empolyeeDao.save(empolyee);
                return "success";
            }
        }
}
