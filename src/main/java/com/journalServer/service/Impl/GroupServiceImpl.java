package com.journalServer.service.Impl;

import com.journalServer.entity.Group;
import com.journalServer.repository.GroupRepository;
import com.journalServer.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by rocti on 10.06.2017.
 */
@Service
public class GroupServiceImpl implements GroupService {

    @Autowired
    private GroupRepository groupRepository;

    public List<Group> getAll() {
        return groupRepository.findAll();
    }

    public Group getById(int id) {
        return groupRepository.findOne(id);
    }

    public Group save(Group group) {
        return groupRepository.save(group);
    }

    public void remove(int id) {
        groupRepository.delete(id);
    }
}
