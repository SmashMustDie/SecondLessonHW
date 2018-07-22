package org.controller;

import org.services.AllServiceOrg;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MainServletOrg extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("spring-application-org.xml");
        AllServiceOrg allServiceOrg =
                applicationContext.getBean("allServiceOrg", AllServiceOrg.class);
        req.setAttribute("allServiceOrg", allServiceOrg);
        req.getRequestDispatcher("/WEB-INF/pages/user-org.jsp").forward(req, resp);

    }
}
