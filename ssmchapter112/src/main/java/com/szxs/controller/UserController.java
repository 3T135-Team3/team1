package com.szxs.controller;

import com.szxs.entity.User;
import com.szxs.util.FileUtil;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.io.File;
import java.io.IOException;

@Controller
public class UserController {


    @RequestMapping("/saveUser.html")
    public String saveUser(@Valid User u, BindingResult br){
        if(br.hasErrors()){

            return "index";
        }
        return "index";
    }

    //rest风格
    @RequestMapping("/register/{id}/{name}")
    public String register(@PathVariable("id") Integer uid,@PathVariable("name")String name){
        System.out.println(uid + name);
        return "index";
    }

    //文件上传
    @RequestMapping("/uploadImg.html")
    public String uploadImg(User user, MultipartFile imgFile, HttpSession session){
        System.out.println(session.getServletContext().getRealPath("upload"));
        //获取上传文件的文件名字
        System.out.println(imgFile.getOriginalFilename());
        //获取保存文件的目录
        String path = session.getServletContext().getRealPath("upload");
        System.out.println(path);

        //创建目录
        FileUtil.createDir(path);

        //文件保存路径
        File outFile = new File(path, imgFile.getOriginalFilename());

        try {
            imgFile.transferTo(outFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "/index";
    }
}
