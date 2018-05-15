package cn.wanda.controller;

import cn.wanda.entity.Admin;
import cn.wanda.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * 管理员的controller
 */

@Controller
public class AdminController {

    //使用注解方式注入service对象
    @Autowired
    private AdminService adminService;

    //跳转到登录页面
    @RequestMapping(value = "login")
    public String login(){
        return "login/login";
    }

    //跳转到主页
    @RequestMapping(value="index")
    public String index(){
        return "login/index";
    }

    //用户登录
    @RequestMapping("verification")
    public String verification(Model model, Admin admin, HttpSession session){
        //根据页面填的用户名和密码，查找管理员
        Admin existAdmin = adminService.findByUserAndPass(admin);
        //查找结果不为空，说明用户名和密码正确
        if (existAdmin != null){
            //将查到的管理员信息保存到session域中
            session.setAttribute("existAdmin",existAdmin);
            //重定向到首页
            return "redirect:index.action";
        }
        //保存错误信息到model中，可以在jsp页面进行显示
        model.addAttribute("errorMsg","账号或者密码错误，请重新输入！");

        //转发到登录页面
        return "forward:login.action";
    }

    //注销
    @RequestMapping("over")
    public String over(HttpSession session){
        //移除session域中的existAdmin
        session.removeAttribute("existAdmin");
        //重定向到登录页面
        return "redirect:login.action";
    }

}
