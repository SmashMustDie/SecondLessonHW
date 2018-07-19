package com.controller;

import com.services.AllService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MainServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("spring-application.xml");
        AllService allService =
                applicationContext.getBean("allService", AllService.class);
        req.setAttribute("allService", allService);
        req.getRequestDispatcher("/WEB-INF/pages/user.jsp").forward(req, resp);

    }
}
