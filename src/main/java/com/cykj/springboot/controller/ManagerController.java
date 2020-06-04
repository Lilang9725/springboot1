package com.cykj.springboot.controller;

import com.alibaba.fastjson.JSON;
import com.cykj.springboot.entity.UserList;
import com.cykj.springboot.service.UserListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/manager")
public class ManagerController {
    @Autowired
    private UserListService userListService;
//    @Autowired
//    private TbUserFileService tbUserFileService;
//    @Autowired
//    private TbLogService tbLogService;
    @RequestMapping(value = "/test")
    public String test(){
        List<UserList> list = userListService.userQuery(new UserList());
        return JSON.toJSONString(list);
    }

//    @RequestMapping(value = "/userQuery")
//    public ModelAndView UserQuery(@RequestParam("timeMin") String timeMin, @RequestParam("timeMan") String timeMan
//            , @RequestParam("userName") String userName) {
//        LayuiData layuiData = new LayuiData();
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.addObject("timeMin", timeMin);
//        modelAndView.addObject("timeMan", timeMan);
//        modelAndView.addObject("userName", userName);
//        UserList userList = new UserList();
//        TbLog tbLog = new TbLog();
//        userList.setUserName(userName);
//        if (timeMan.equals("") && !timeMin.equals("")) timeMan = new Tool().getDate("yyyy-MM-dd HH:mm:ss");
//        if (!timeMan.equals("") && timeMin.equals("")) timeMin = "2020-01-01 00:00:00";
//        userList.setRemark(timeMan);
//        userList.setEMail(timeMin);
//        List<UserList> list = userListService.userQuery(userList);
//        for (UserList user : list) {
//            tbLog.setUserId(user.getUserId());
//            tbLog.setOperate("下载");
//            try {
//                user.setProfessionId(tbLogService.SelectLog(tbLog).size());
//            } catch (Exception e) {
//            }
//            tbLog.setOperate("上传");
//            try {
//                user.setProfessionId(tbLogService.SelectLog(tbLog).size());
//            } catch (Exception e) {
//            }
//        }
//        layuiData.setData(list);
//        modelAndView.addObject("utils", layuiData);
//        modelAndView.setViewName("manager_user_query");
//        return modelAndView;
//    }

}
