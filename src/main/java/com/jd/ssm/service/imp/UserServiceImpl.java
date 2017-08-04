package com.jd.ssm.service.imp;

import com.jd.ssm.domain.UsersVO;
import com.jd.ssm.mapper.UserMapper;
import com.jd.ssm.pojo.User;
import com.jd.ssm.service.UserService;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * AUTHOR: fansiguo
 * COMPANY: jd.com
 * VERSION: 1.0
 * CREATED: 2017/8/3 19:25
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private Mapper baseMapper;

    public List<UsersVO> findUser(){
        List<User> users = userMapper.selectByExample(null);
        List<UsersVO> usersVOList = new ArrayList<UsersVO>();
        for (User user:users) {
            UsersVO vo = baseMapper.map(user,UsersVO.class);
            usersVOList.add(vo);
        }
        return usersVOList;
    }
}
