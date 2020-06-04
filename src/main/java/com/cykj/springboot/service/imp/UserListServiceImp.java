package com.cykj.springboot.service.imp;

import com.cykj.springboot.entity.UserList;
import com.cykj.springboot.mapper.UserListMapper;
import com.cykj.springboot.service.UserListService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


//@Transactional
@Service("userListService")//调用spring里的事务配置
public class UserListServiceImp implements UserListService {
    @Resource
    public UserListMapper userListMapper;
//    @Autowired
//    private TbLogMapper tbLogMapper;
//    @Autowired
//    private TbMenuMapper tbMenuMapper;
//
//    @Override
//    public UserList loginDispose(UserList userList, LayuiData layuiData) {
//        userList = userListMapper.userMessage(userList);
//        if (userList != null) {
//            if (userList.getUserState().equals("禁用") || userList.getUserState().equals("审核不通过")) {
//                layuiData.setCode(17);
//                layuiData.setMsg("\n\n     用户已被禁用(冻结)！\n\n  是否结启用账号？  \n\n");
//            } else {
//                if (userList.getUserState().equals("注册待审核1") || userList.getUserState().equals("审核通过1")) {
//                    layuiData.setCode(18);
//                    layuiData.setMsg("\n\n       用户已经在线！\n\n  若非本人登录，冻结账号？  \n\n");
//                } else {
//                    if (userList.getUserState().equals("注册待审核")) userList.setUserState("注册待审核1");
//                    else if (userList.getUserState().equals("审核通过")) userList.setUserState("审核通过1");
//                    layuiData.setCode(0);
//                    layuiData.setMsg("\n\n       你已成功登录！    \n\n");
//                }
//                userListMapper.updateState(userList);//登录成功后修改用户在线状态
//                return userList;
//            }
//        } else {
//            layuiData.setMsg("账号或者密码有无，请核对后重试！");
//        }
//        return null;
//    }
//
//    @Override
//    public UserList registerDispose(UserList userList, TbLog tbLog) {
//        userListMapper.addUser(userList);
//        if (tbLogMapper.addLog(tbLog) > 0) return userList;
//        return null;
//    }
//
//    @Override
//    public UserList userMessage(UserList userList) {
//        return userListMapper.userMessage(userList);
//    }

    @Override
    public List<UserList> userQuery(UserList userList) {
        return userListMapper.selectList(userList);
    }

//    @Override
//    public List<TbMenu> manageMenu() {
//        return tbMenuMapper.selectMenu();
//    }
}
