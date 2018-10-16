package com.step.base.mybatis.anno;


import org.apache.ibatis.annotations.Select;

public interface AnnoUserMapper {

    @Select("select * from User where id=#{id}")
    AnnoUser selectUser(Integer id);

}
