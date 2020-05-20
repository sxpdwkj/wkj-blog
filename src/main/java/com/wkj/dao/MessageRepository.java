package com.wkj.dao;

import com.wkj.pojo.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author : xsh
 * @create : 2020-03-18 - 15:28
 * @describe:
 */
public interface MessageRepository  extends JpaRepository<Message,Long>, JpaSpecificationExecutor<Message> {

}
