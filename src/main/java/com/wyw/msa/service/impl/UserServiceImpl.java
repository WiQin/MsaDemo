package com.wyw.msa.service.impl;

import com.wyw.msa.mapper.UserMapper;
import com.wyw.msa.pojo.User;
import com.wyw.msa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author wangyw
 * @date 2019/11/13
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    public User queryById(Long id){
        return userMapper.selectByPrimaryKey(id);
    }

    @Transactional
    public void insertUser(User user){
        userMapper.insert(user);
    }
}



