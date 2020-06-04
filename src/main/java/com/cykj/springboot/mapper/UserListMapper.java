package com.cykj.springboot.mapper;

import com.cykj.springboot.entity.UserList;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserListMapper {
//    public UserList userMessage(UserList userList);

    public List<UserList> selectList(UserList userList);
//
//    public int addUser(UserList userList);
//
//    public int updateState(UserList userList);
}
