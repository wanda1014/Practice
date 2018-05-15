package cn.wanda.controller;

import cn.wanda.entity.Teacher;
import cn.wanda.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 老师的controller
 */

@Controller
@RequestMapping("teacher")
public class TeacherController {

    //注入teacherService
    @Autowired
    private TeacherService teacherService;

    //主页，查询所有老师的信息
    @RequestMapping("index")
    public String index(Model model){

        List<Teacher> teacherList = teacherService.findAllTeacher();

        model.addAttribute("teacherList",teacherList);

        return "teacher/teacherIndex";
    }

}
