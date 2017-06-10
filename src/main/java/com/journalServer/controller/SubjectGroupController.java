package com.journalServer.controller;

import com.journalServer.entity.SubjectGroup;
import com.journalServer.service.SubjectGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by rocti on 10.06.2017.
 */
@RestController
public class SubjectGroupController {
    
    @Autowired
    private SubjectGroupService subjectGroupService;

    @RequestMapping(value = "/subject_groups",method = RequestMethod.GET)
    @ResponseBody
    public List<SubjectGroup> getAllSubjectGroups() {
        return subjectGroupService.getAll();
    }

    @RequestMapping(value = "/subject_group/{id}",method = RequestMethod.GET)
    @ResponseBody
    public SubjectGroup getSubjectGroup(@PathVariable("id") int subjectGroupId) {
        return subjectGroupService.getById(subjectGroupId);
    }

    @RequestMapping(value = "/subject_group/",method = RequestMethod.POST)
    @ResponseBody
    public SubjectGroup saveSubjectGroup(@RequestBody SubjectGroup subjectGroup) {
        return subjectGroupService.save(subjectGroup);
    }

    @RequestMapping(value = "/remove_subject_group/{id}",method = RequestMethod.POST)
    @ResponseBody
    public void deleteSubjectGroup(@PathVariable("id") int subjectGroupId) {
        subjectGroupService.remove(subjectGroupId);
    }
}
