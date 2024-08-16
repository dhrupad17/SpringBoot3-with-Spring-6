package com.telusko.__SpringBootWeb.controller;

import com.telusko.__SpringBootWeb.model.User;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(){
//        System.out.println("Home method called");
        return "index";
    }

//    Using HttpServletRequest
//    @RequestMapping("add")
//    public String add(HttpServletRequest req, HttpSession session){
//        int num1=Integer.parseInt(req.getParameter("num1"));
//        int num2=Integer.parseInt(req.getParameter("num2"));
//        int result=num1+num2;
//        session.setAttribute("result",result);
//        return "result.jsp";
//    }

//    Request Param
//    @RequestMapping("add")
//    public String add(@RequestParam("num1") int num1, @RequestParam("num2") int num2, HttpSession session){
//
//        int result=num1+num2;
////        System.out.println(result);
//        session.setAttribute("result",result);
//        return "result.jsp";
//    }

//    Concept: Model Object Model abnd View
    @RequestMapping("add")
    public ModelAndView add(@RequestParam("num1") int num1, @RequestParam("num2") int num2, ModelAndView mv){
        int result=num1+num2;
        mv.addObject("result",result);
        mv.setViewName("result");
        return mv;
    }

//    Need for ModelAttribute
    @RequestMapping("addUser")
    public ModelAndView addUser(@RequestParam("uid") int uid,@RequestParam("uname") String uname, ModelAndView mv){
        User user=new User();
        user.setUid(uid);
        user.setUname(uname);
        mv.addObject("user",user);
        mv.setViewName("userView");
        return mv;
    }

    @ModelAttribute("course")
    public String courseName(){
        return "Java Full Stack";
    }
}
