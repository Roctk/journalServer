package com.journalServer.service;

import com.journalServer.entity.Group;

import java.util.List;

/**
 * Created by rocti on 10.06.2017.
 */
public interface GroupService {
    List<Group> getAll();
    Group getById(int id);
    Group save(Group group);
    void remove(int id);
}
