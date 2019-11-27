package com.wyw.msa.web;

import com.wyw.msa.service.impl.UserServiceImpl;
import com.wyw.msa.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangyw
 * @date 2019/11/13
 */
@RestController
@RequestMapping("user")
public class ControllerDemo {

    @Autowired
    UserServiceImpl userServiceImpl;

    @RequestMapping("{id}")
    public User test(@PathVariable("id") Long id){
        return userServiceImpl.queryById(id);
    }
}
