package com.wgx.flash.controller;

import com.wgx.flash.result.CodeMsg;
import com.wgx.flash.result.ResultInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/demo")
public class DemoController {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }

    @RequestMapping("/hello")
    @ResponseBody
    public ResultInfo<String> hello() {
        return ResultInfo.success("hello,imooc");
    }

    @RequestMapping("/helloError")
    @ResponseBody
    public ResultInfo<String> helloError() {
        return ResultInfo.error(CodeMsg.SERVER_ERROR);
    }

    @RequestMapping("/thymeleaf")
    public String thymeleaf(Model model) {   //model 指的是页面上的上下文对象
        model.addAttribute("name", "Joshua");
        return "hello";
    }
}
