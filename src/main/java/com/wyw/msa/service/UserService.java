package com.wyw.msa.service;

import com.wyw.msa.pojo.User;

/**
 * @author wangyw
 * @date 2019/11/13
 */
public interface UserService {
    User queryById(Long id);
}
