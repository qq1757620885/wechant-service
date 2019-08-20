package com.imooc.service;

import com.imooc.pojo.Users;
import org.springframework.util.StringUtils;

public interface UserService {

    /**
     * 查询当前用户是否存在
     * @param username
     * @return
     */
    boolean queryByUsername(String username);

    /**
     * 新增用户
     * @param users
     */
    Users addUser(Users users);

    /**
     * 用户登录
     * @param username
     * @param password
     * @return
     */
    Users queryUserlogin(String username, String password);
}
