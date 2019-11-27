package com.wyw.msa.mapper;

import com.wyw.msa.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author wangyw
 * @date 2019/11/13
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {

    @Autowired
    UserMapper userMapper;

    @Test
    public void testQuery(){
        User user = userMapper.selectByPrimaryKey(1L);
        System.out.println("user:"+user);
    }
}