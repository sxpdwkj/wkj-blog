package com.wkj.dao;

import com.wkj.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author : wkj
 * @create : 2020-02-08 - 0:15
 * @describe:
 */
public interface UserRepository extends JpaRepository<User,Long> {

    User findByUsernameAndPassword(String username,String password);
}
