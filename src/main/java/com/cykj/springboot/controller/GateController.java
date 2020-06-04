//package com.cykj.springboot.controller;
//
//import com.alibaba.fastjson.JSON;
//import com.cykj.springboot.Othe.Tool;
//import com.cykj.springboot.entity.TbLog;
//import com.cykj.springboot.entity.UserList;
//import com.cykj.springboot.service.UserListService;
//import com.cykj.springboot.utils.LayuiData;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.servlet.ModelAndView;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//
//@RestController
//@RequestMapping("/gate")
//public class GateController {
//    @Autowired
//    private UserListService userListService;
//
//    @RequestMapping(value = "/login")
//    @ResponseBody/*此注解可用在json返值，有重定向功能不可用*/
//    public String login(HttpServletRequest request, HttpServletResponse response, UserList userList, @RequestParam(value = "verifyCode")
//            String verifyCode) throws IOException {
//        String verify = (String) request.getSession().getAttribute("codeValidate");
//        LayuiData layuiData = new LayuiData();
//        if (!verifyCode.equals(verify)) {//验证码验证失败
//            layuiData.setCode(12);
//            layuiData.setMsg("\n\n     验证码错误！\n\n  是否刷新验证码？  \n\n");
//        } else {
//            userList = userListService.loginDispose(userList, layuiData);
//            List<UserList> userLists = new ArrayList<>();
//            userLists.add(userList);
//            layuiData.setData(userLists);
//        }
//        return JSON.toJSONString(layuiData);
//    }
//
//    @RequestMapping(value = "/register")
//    @ResponseBody
//    public String register(UserList userList) throws Exception {
//        String userLoginId = "";
//        Tool tool = new Tool();
//        userList.setUserState("注册待审核");
//        userList.setRemark(tool.getDate("yyyy-MM-dd HH:mm:ss"));
//        userList.setIntegral(10);
//        userLoginId = tool.getRandCode(tool.getRandom(2, 4), "ABCDEFGHIJKLMNOPQRSTUVWXYZ");
//        int t = 8 - userLoginId.length() - tool.getRandom(1, 2);
//        for (int a = 0; a < t; a++) userLoginId += tool.getRandom(0, 10);//生成登录id
//        userList.setUserLoginId(userLoginId);//登录id
//        LayuiData layuiData = new LayuiData();
//        TbLog tbLog = new TbLog();
//        tbLog.setOperate("注册用户");
//        tbLog.setLogTime(tool.getDate("yyyy-MM-dd HH:mm:ss"));
//        tbLog.setParam(10);
//        tbLog.setUserId(userList.getUserId());
//        layuiData.setCode(1);
//        userList = userListService.registerDispose(userList, tbLog);
//        if (userList != null)//加入日志
//            layuiData.setMsg("   注册已成功，审核中！\n你的登录账号:" + userList.getUserLoginId());
//        else layuiData.setMsg("未知原因导致注册失败,请重试！");
//        System.out.println(JSON.toJSONString(layuiData));
//        return JSON.toJSONString(layuiData);
//    }
//
//    @RequestMapping(value = "/homePageView")
//    public ModelAndView getHomePageValue() throws Exception {
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("home-page");
//        return modelAndView;
//    }
//
//    @RequestMapping(value = "/homePageValue")
//    public ModelAndView getHomePageValue(UserList userList) throws Exception {
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.addObject("userList", userListService.userMessage(userList));
//        modelAndView.addObject("menuOne", userListService.manageMenu());
//        modelAndView.setViewName("home-page");
//        return modelAndView;
//    }
//
//}