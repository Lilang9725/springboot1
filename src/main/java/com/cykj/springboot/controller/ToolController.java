//package com.cykj.springboot.controller;
//
//import com.cykj.springboot.Othe.VerifyCode;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.servlet.ModelAndView;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
//@RestController
//@RequestMapping("/tool")
//public class ToolController {
//    @Autowired
//    private ItemListService itemListService;
//
//    @RequestMapping(value = "/getCaptcha")//生成验证码
//    @ResponseBody
//    public ModelAndView generateCaptcha(HttpServletRequest request, HttpServletResponse response) {
//        ModelAndView modelAndView = new ModelAndView();
//        VerifyCode verifyCode = new VerifyCode();
//        try {
//            verifyCode.getCode(request, response);
//            request.setAttribute("code", verifyCode);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        modelAndView.addObject("code", verifyCode);
//        return modelAndView;
//    }
//
//    @RequestMapping("/advanceRegister")//注册获取学历和职业信息
//    public ModelAndView getEducation() {
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.addObject("education", itemListService.getEducation());
//        modelAndView.addObject("profession", itemListService.getProfession());
//        modelAndView.setViewName("register");
//        return modelAndView;
//    }
//}
