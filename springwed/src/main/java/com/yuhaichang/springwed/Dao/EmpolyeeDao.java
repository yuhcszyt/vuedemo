package com.yuhaichang.springwed.Dao;

import com.yuhaichang.springwed.Entity.Empolyee;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface EmpolyeeDao {

    @Insert("insert into employee(userName,password,email,gender) values (#{userName},#{password},#{email},#{gender})")
    public  boolean save(Empolyee empolyee);

    @Select("select * from employee where username=#{username}")
    public List<Empolyee> findEmployees(String username);

}
