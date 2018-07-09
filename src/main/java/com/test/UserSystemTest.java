package com.test;

import com.services.UserService;
import com.services.UserServiceSecond;
import com.services.UserServiceThird;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserSystemTest {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("spring-application.xml");
        UserService userService =
                applicationContext.getBean("userService", UserService.class);
        UserServiceSecond userServiceSecond =
                applicationContext.getBean("userServiceSecond", UserServiceSecond.class);
        UserServiceThird userServiceThird =
                applicationContext.getBean("userServiceThird", UserServiceThird.class);
        System.out.println(userService.getUserList() );
        System.out.println(userServiceSecond.getUserList() );
        System.out.println(userServiceThird.getUserList() );
    }
}
