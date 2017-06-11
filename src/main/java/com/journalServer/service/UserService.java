package com.journalServer.service;

import com.journalServer.entity.Users;

import java.util.List;

/**
 * Created by rocti on 01.03.2017.
 */
public interface UserService {
    List<Users> getAll();
    Users getById(int id);
    Users save(Users user);
    void remove(int id);
}
