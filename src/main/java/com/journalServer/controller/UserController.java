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
    private UserService service;

    @RequestMapping(value = "/accounts",method = RequestMethod.GET)
    @ResponseBody
    public List<Users> getAllUsers() {
        return service.getAll();
    }

    @RequestMapping(value = "/accounts/{id}",method = RequestMethod.GET)
    @ResponseBody
    public Users getUser(@PathVariable("id") int userId) {
        return service.getById(userId);
    }

    @RequestMapping(value = "/accounts/",method = RequestMethod.POST)
    @ResponseBody
    public Users saveUser(@RequestBody Users user) {
        return service.save(user);
    }

    @RequestMapping(value = "/accounts/{id}",method = RequestMethod.POST)
    @ResponseBody
    public void deleteAccount(@PathVariable("id") int userId) {
        service.remove(userId);
    }
}
