package com.java.demo;

import com.java.dao.UserDao;
import com.java.entity.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @atuhor Tiance
 * @date 2018/8/3 22:06
 */
public class Test2 {
    @Test
    public void test1() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao dao = (UserDao) ctx.getBean("userDao");
        User user = dao.queryAll("1");
        System.err.println(user);
    }

}
