package com.jd.ssm.service;

import com.jd.ssm.domain.UsersVO;
import com.jd.ssm.pojo.User;

import java.util.List;

/**
 * Created by fansiguo on 2017/8/3.
 */
public interface UserService {

    /**
     *
     * @return
     * @throws Exception
     */
    List<UsersVO> findUser();

}
