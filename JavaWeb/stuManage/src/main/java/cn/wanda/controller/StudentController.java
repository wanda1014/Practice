package cn.wanda.controller;

import cn.wanda.entity.Student;
import cn.wanda.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 学生的controller
 */

@Controller
@RequestMapping("student")
public class StudentController {

    //注入studentService
    @Autowired
    private StudentService studentService;

    //主页，查询所有
    @RequestMapping("index")
    public String index(String studentId, Model model){
        List<Student> studentList = studentService.findStudent(studentId);
        model.addAttribute("studentList",studentList);
        return "student/studentIndex";
    }

    //跳到添加页面
    @RequestMapping("addPage")
    public String addPage(){
        return "student/add";
    }

    //实现添加功能
    @RequestMapping("add")
    public String add(Student student){
        /*String age = request.getParameter("age");
        student.setAge(Integer.parseInt(age));*/
        studentService.addStudent(student);
        return "redirect:index.action";
    }

    //跳到修改页面
    @RequestMapping("editPage")
    public String editPage(String studentId, Model model){
        Student existStudent = studentService.findById(studentId);
        model.addAttribute("existStudent",existStudent);

        return "student/edit";
    }

    //实现修改功能
    @RequestMapping("edit")
    public String edit(Student student){
        //自动接收页面数据
        /*String age = request.getParameter("age");
        student.setAge(Integer.parseInt(age));*/
        studentService.update(student);

        return "redirect:index.action";
    }

    //删除信息
    @RequestMapping("delete")
    public String delete(String studentId){
        studentService.delete(studentId);
        return "redirect:index.action";
    }

}
