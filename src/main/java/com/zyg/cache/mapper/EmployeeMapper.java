package com.zyg.cache.mapper;

import com.zyg.cache.bean.Employee;
import org.apache.ibatis.annotations.*;

import javax.jnlp.IntegrationService;

@Mapper
public interface EmployeeMapper {

    @Select("select * from employee where id = #{id}")
    public Employee selectById(Integer id);

    @Update("update employee set lastName=#{lastName},email=#{email},gender=#{gender},d_id=#{dId} where id=#{id}")
    public Integer update(Employee employee);

    @Insert("insert into employee(lastName,email,gender,d_id) values(#{lastName},#{email},#{gender},#{dId})")
    public Integer insert(Employee employee);

    @Delete("delete from employee where id=#{id}")
    public Integer deleteById(Integer id);

}
