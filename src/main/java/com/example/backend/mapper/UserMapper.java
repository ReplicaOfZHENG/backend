package com.example.backend.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.backend.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

@Mapper
public interface UserMapper{
    @Select("SELECT * FROM user WHERE user = #{userName} AND pwd = #{password} AND type = #{userType}")
    List<User> find(@Param("userType") int userType, @Param("userName") String userName, @Param("password") String password);
}
