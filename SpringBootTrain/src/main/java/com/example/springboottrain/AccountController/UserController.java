package com.example.springboottrain.AccountController;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.example.springboottrain.entity.User;
import com.example.springboottrain.mapper.client_all_accountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class UserController {

    @Autowired
    private client_all_accountMapper UserMapper;

    //    http://localhost:8080/hello
    @GetMapping("/hello")
    public String hello() {
        return "helloworld";
    }

    @GetMapping("/user/getuser")
    public List UserGet(){

        List<User> list = UserMapper.selectList(null);
        System.out.println(list);
        return list;
    }

    @GetMapping("/user/getbyid")
    public User UserGetById(){
        User user = (User) UserMapper.selectById(1);
        return user;
    }

    @PostMapping("/user/update")
    public String UserUpdate(@RequestBody User user){
        UpdateWrapper<User> updateWrapper = new UpdateWrapper<>();
        updateWrapper.eq("id",user.getId()).set("user_account",user.getUser_account());
        int i = UserMapper.update(null,updateWrapper);
        if (i >0){
            return "更新成功";
        }else {
            return  "更新失败";
        }
    }

    @PostMapping("/user/insert")
    public String UserInsert(@RequestBody User user){

        int i = UserMapper.insertUser(user);

        if(i > 0 ){
            return "插入成功";
        }else {
            return "插入失败";
        }
    }

    @PostMapping("/user/Delete")
    public String UserDelete(@RequestBody User user){
        int i = UserMapper.deleteById(user.getId());

        if(i > 0 ){
            return "删除成功";
        }else {
            return "删除失败";
        }
    }
}
