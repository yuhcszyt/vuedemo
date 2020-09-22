package com.atguigu.springboot.mapper;

import com.atguigu.springboot.entities.Employee;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.Collection;

@Mapper
public interface EmployeeMapper {

    @Select("select * from  Employee ")
    public Collection<Employee> getAll();

    @Select("select * from  Employee where id =#{id}")
    public Employee get(Integer id);

    @Delete("delete from Employee where id=#{id}")
    public void delete(Integer id);

    @Insert("insert into Employee1(email,gender,birth,lastName,deptid) values (#{email},#{gender},#{birth},#{lastName},#{department.id})")
    public void save(Employee employee);
}
