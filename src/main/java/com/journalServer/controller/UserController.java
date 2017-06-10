package com.journalServer.controller;

import com.journalServer.entity.Users;
import com.journalServer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by rocti on 26.02.2017.
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/users",method = RequestMethod.GET)
    @ResponseBody
    public List<Users> getAllUsers() {
        return userService.getAll();
    }

    @RequestMapping(value = "/user/{id}",method = RequestMethod.GET)
    @ResponseBody
    public Users getUser(@PathVariable("id") int userId) {
        return userService.getById(userId);
    }

    @RequestMapping(value = "/user/",method = RequestMethod.POST)
    @ResponseBody
    public Users saveUser(@RequestBody Users user) {
        return userService.save(user);
    }

    @RequestMapping(value = "/remove_user/{id}",method = RequestMethod.POST)
    @ResponseBody
    public void deleteUser(@PathVariable("id") int userId) {
        userService.remove(userId);
    }
}
