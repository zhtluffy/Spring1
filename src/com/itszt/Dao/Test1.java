package com.itszt.Dao;

import com.itszt.MyBean1;
import com.itszt.MyBean2;
import com.itszt.Service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sun.applet.Main;

/**
 * Created by Administrator on 2019/7/21.
 */
public class Test1 {

    @Test
    public void test1() {
//        生产工厂
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
//        和工厂要对象
        UserDao userDao = applicationContext.getBean("userDao", UserDao.class);
        userDao.hello("abc", 123);
    }


    @Test
    public void test2() {
//        生产工厂
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
//        和工厂要对象
        UserService userService = applicationContext.getBean("userService", UserService.class);
        userService.go("aaa", 666);
    }

    @Test
    public void test3() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        MyBean1 myBean1 = applicationContext.getBean("myBean1", MyBean1.class);
        myBean1.show();
    }

    @Test
    public void test4() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        MyBean2 myBean2 = applicationContext.getBean("myBean222", MyBean2.class);
        myBean2.show();
    }
}
