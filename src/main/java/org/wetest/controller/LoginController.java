package org.wetest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.wetest.entity.User;
import org.wetest.service.UserService;

import java.util.List;

@Controller
public class LoginController {
    @Autowired
    UserService userService;
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ResponseBody
    public String login(String username, String password){
        String restult="Fail";
        List<User> users=userService.getUserListByUsername(username);
        if(users!=null&&!users.isEmpty()) {
            String exitPassword = users.get(0).getPassword();
            if (password.equals(exitPassword)) {
                restult = "Success";
            }
        }
        return restult;
}
}
