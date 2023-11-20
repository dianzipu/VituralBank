package com.example.springboottrain.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.springboottrain.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface client_all_accountMapper extends BaseMapper<User> {
//    查询所有用户
    @Select("select * from client_all_account")
    List<User> find();
//
    @Insert("insert into client_all_account values(#{id},#{user_account},#{user_password},#{user_email},#{user_credit})")
    public int insertUser(User user);
}
