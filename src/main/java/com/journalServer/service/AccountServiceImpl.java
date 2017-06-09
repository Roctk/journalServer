package com.journalServer.service;

import com.journalServer.entity.Users;
import com.journalServer.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by rocti on 01.03.2017.
 */
@Service
public class AccountServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    public List<Users> getAll() {
        return userRepository.findAll();
    }

    public Users getById(int id) {
        return userRepository.findOne(id);
    }

    public Users save(Users users) {
        return userRepository.saveAndFlush(users);
    }

    public void remove(int id) {
        userRepository.delete(id);
    }
}
