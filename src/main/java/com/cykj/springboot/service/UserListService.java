package com.cykj.springboot.service;


import com.cykj.springboot.entity.TbLog;
import com.cykj.springboot.entity.TbMenu;
import com.cykj.springboot.entity.UserList;
import com.cykj.springboot.utils.LayuiData;

import java.util.List;

public interface UserListService {
//    public UserList loginDispose(UserList userList, LayuiData layuiData);
//
//    public UserList registerDispose(UserList userList, TbLog tbLog);

   // public UserList userMessage(UserList userList);
//
    public List<UserList> userQuery(UserList userList);
//
//    public List<TbMenu> manageMenu();
}
