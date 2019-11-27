package com.wyw.msa.mapper;

import com.wyw.msa.pojo.User;
import tk.mybatis.mapper.common.Mapper;

/**
 * 通用mapper，继承通用Mapper类
 * 表名默认与类名相同，不用时在类上加table注解
 *
 * @author wangyw
 * @date 2019/11/13
 */
public interface UserMapper extends Mapper<User> {
}
