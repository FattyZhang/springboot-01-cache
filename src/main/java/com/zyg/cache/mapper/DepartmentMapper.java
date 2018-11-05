package com.zyg.cache.mapper;

import com.zyg.cache.bean.Department;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface DepartmentMapper {

    @Select("select * from department where id = #{id}")
    public Department  selectById(Integer id);
}
