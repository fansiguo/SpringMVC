package com.jd.ssm.controller;

import com.jd.ssm.domain.UsersVO;
import com.jd.ssm.pojo.User;
import com.jd.ssm.service.UserService;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * AUTHOR: fansiguo
 * COMPANY: jd.com
 * VERSION: 1.0
 * CREATED: 2017/8/3 19:27
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;



    @RequestMapping("/findUser")
    public String findUser(Model model) {

        List<UsersVO> users = userService.findUser();


        model.addAttribute("users",users);

        return "findUser";
    }
}
