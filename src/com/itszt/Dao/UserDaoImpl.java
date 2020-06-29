package com.itszt.Dao;

/**
 * Created by Administrator on 2019/7/21.
 */
public class UserDaoImpl implements UserDao {


    @Override
    public void hello(String data1, int data2) {

        System.out.println("data1 = [" + data1 + "], data2 = [" + data2 + "]");
    }
}
