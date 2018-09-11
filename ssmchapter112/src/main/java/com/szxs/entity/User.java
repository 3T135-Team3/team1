package com.szxs.entity;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * 用户实体类
 */
public class User implements Serializable {
    @NotNull(message = "用户ID不能为空")
    @Min(value = 5,message = "最小值只能是5")
    @Max(value = 10,message = "最小值只能是10")
    private Integer uid;
    @NotNull(message = "用户名不能为空")
    @Length(min = 6,max = 10,message = "用户名长度只能是6-10")
    private String uname;

    public User() {
    }

    public User(String uname) {
        this.uname = uname;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }
}
