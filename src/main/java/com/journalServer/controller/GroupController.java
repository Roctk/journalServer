package com.journalServer.controller;

import com.journalServer.entity.Group;
import com.journalServer.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by rocti on 10.06.2017.
 */
@RestController
public class GroupController {
    
    @Autowired
    private GroupService groupService;

    @RequestMapping(value = "/groups",method = RequestMethod.GET)
    @ResponseBody
    public List<Group> getAllGroup() {
        return groupService.getAll();
    }

    @RequestMapping(value = "/group/{id}",method = RequestMethod.GET)
    @ResponseBody
    public Group getGroup(@PathVariable("id") int userId) {
        return groupService.getById(userId);
    }

    @RequestMapping(value = "/group",method = RequestMethod.POST)
    @ResponseBody
    public Group saveGroup(@RequestBody Group group) {

        return groupService.save(group);
    }

    @RequestMapping(value = "/remove_group/{id}",method = RequestMethod.POST)
    @ResponseBody
    public void deleteGroup(@PathVariable("id") int groupId) {
        groupService.remove(groupId);
    }
}
