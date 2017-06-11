package com.journalServer.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.journalServer.entity.Users;
import com.journalServer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
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

    @RequestMapping(value = "/user",method = RequestMethod.POST)
    @ResponseBody
    public Users saveUser(@RequestBody Users user) {
        System.out.println(user);
        return userService.save(user);
    }

    @RequestMapping(value = "/remove_user/{id}",method = RequestMethod.POST)
    @ResponseBody
    public void deleteUser(@PathVariable("id") int userId) {
        userService.remove(userId);
    }
}
