package com.jd.ssm.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * AUTHOR: fansiguo
 * COMPANY: jd.com
 * VERSION: 1.0
 * CREATED: 2017/8/4 15:24
 */
public class UsersVO implements Serializable{
    private static final long serialVersionUID = -4932270129602180559L;

    private Integer id;
    private String userName;
    private String birthday;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String  getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}
