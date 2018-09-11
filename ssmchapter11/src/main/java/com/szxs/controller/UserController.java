package com.szxs.controller;

import com.szxs.entity.User;
import com.szxs.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

@Controller
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("/showList.html")
    public String showList(Model model){
        List<User> users = userService.queryUser();
        model.addAttribute("users",users);
        return "index";
    }
//邱烨改
    @RequestMapping("/saveUser.html")
    public String saveUser(@Valid User u, BindingResult br){
        if(br.hasErrors()){
            return "error";
        }
        userService.addUser(new User("李四"));
        return "index";
    }
    //陈璐改
    public String saveUserch(@Valid User u, BindingResult br){
        if(br.hasErrors()){
            return "error";
        }
        userService.addUser(new User("李四"));
        return "index";
    }


}
