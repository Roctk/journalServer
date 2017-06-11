package com.journalServer.controller;

import com.journalServer.entity.SubjectTeach;
import com.journalServer.service.SubjectTeachService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by rocti on 10.06.2017.
 */
@RestController
public class SubjectTeachController {
    
    @Autowired
    private SubjectTeachService subjectTeachService;

    @RequestMapping(value = "/subject_teachs",method = RequestMethod.GET)
    @ResponseBody
    public List<SubjectTeach> getAllSubjectTeachs() {
        return subjectTeachService.getAll();
    }

    @RequestMapping(value = "/subject_teach/{id}",method = RequestMethod.GET)
    @ResponseBody
    public SubjectTeach getSubjectTeach(@PathVariable("id") int subjectGroupId) {
        return subjectTeachService.getById(subjectGroupId);
    }

    @RequestMapping(value = "/subject_teach",method = RequestMethod.POST)
    @ResponseBody
    public SubjectTeach saveSubjectTeach(@RequestBody SubjectTeach subjectTeach) {
        return subjectTeachService.save(subjectTeach);
    }

    @RequestMapping(value = "/remove_subject_teach/{id}",method = RequestMethod.POST)
    @ResponseBody
    public void deleteSubjectTeach(@PathVariable("id") int subjectGroupId) {
        subjectTeachService.remove(subjectGroupId);
    }
}
