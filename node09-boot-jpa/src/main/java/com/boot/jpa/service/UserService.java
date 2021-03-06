package com.boot.jpa.service;

import com.boot.jpa.entity.User;
import com.boot.jpa.repository.UserRepository;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

@Service
public class UserService {

    @Resource
    private UserRepository userRepository ;

    // 保存
    public void addUser (User user){
        userRepository.save(user) ;
    }

    // 根据年龄查询
    public User findByAge (Integer age){
        return userRepository.findByAge(age) ;
    }

    // 多条件查询
    public User findByNameAndAge (String name, Integer age){
        return userRepository.findByNameAndAge(name,age) ;
    }

    // 自定义SQL查询
    public User findSql (String name){
        return userRepository.findSql(name) ;
    }

    // 根据ID修改
    public void update (User user){
        userRepository.save(user) ;
    }

    //根据id删除一条数据
    public void deleteStudentById(Integer id){
        userRepository.deleteById(id);
    }

}
