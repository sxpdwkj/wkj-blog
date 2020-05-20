package com.wkj.service;

import com.wkj.pojo.User;

/**
 * @author : wkj
 * @create : 2020-02-08 - 0:12
 * @describe:
 */
public interface UserService {

    User checkUser(String username, String password);
}
