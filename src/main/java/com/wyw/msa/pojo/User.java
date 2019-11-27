package com.wyw.msa.pojo;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.Date;

/**
 * @Data 通用mapper-表名
 * @Id 通用mapper-主键
 * @KeySql(useGeneratedKeys = true)   主键自增
 * @Transient  不会作为sql语句的字段
 *
 * @author wangyw
 * @date 2019/11/13
 */
@Data
@Table(name = "tb_user")
public class User {
    @Id
    @KeySql(useGeneratedKeys = true)
    private Long id;
    private String username;
    private String password;
    private String name;
    private Integer age;
    private Integer gender;
    private Date birthday;
    private Date created;
    private Date updated;
    @Transient
    private String note;
}

