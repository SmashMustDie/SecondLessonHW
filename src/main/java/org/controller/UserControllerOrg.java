package org.controller;

import org.models.UserOrg;
import org.services.AllServiceOrg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/user-controller")
public class UserControllerOrg {

    @Autowired
    AllServiceOrg allServiceOrg;

    @RequestMapping(value = "/user-list", method = RequestMethod.GET)
    public @ResponseBody List<UserOrg> getAllUsers() {
        return allServiceOrg.getUserList();
    }

}
