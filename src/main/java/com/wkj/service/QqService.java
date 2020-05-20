package com.wkj.service;

import com.wkj.pojo.QQInfo;

/**
 * @author : xsh
 * @create : 2020-03-15 - 13:59
 * @describe:
 */
public interface QqService {

    QQInfo save(QQInfo qqInfo);
    QQInfo findQQuser(String openid);
    void updateAvatar(String avatar,Long id);
}
