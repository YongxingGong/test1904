package cn.edu.whu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping(value = "/user")
@Controller
public class MyController {

    @RequestMapping(value = "/interceptor.do",method = RequestMethod.POST)
    public ModelAndView doSome(String name,Integer age){
        ModelAndView mv = new ModelAndView();
        System.out.println("MyController.doSome()执行！！！！！！！！！！！！！！！！！！！！");
        mv.addObject("msg","正在使用springmvc做web开发post请求");
        mv.addObject("fun","现在执行的是doSome()方法");
        mv.setViewName("show");
        return mv;
    }

}
