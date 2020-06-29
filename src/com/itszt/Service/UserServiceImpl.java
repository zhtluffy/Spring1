package com.itszt.Service;

import com.itszt.Dao.UserDao;
import com.itszt.Dao.UserDaoImpl;

/**
 * Created by Administrator on 2019/7/21.
 *
 * 依赖注入 DI操作
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void go(String data1, int data2) {
        userDao.hello(data1,data2);
        System.out.println("UserServiceImpl     data1 = [" + data1 + "], data2 = [" + data2 + "]");
    }
}
