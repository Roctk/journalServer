package com.journalServer.controller;

import com.journalServer.entity.Subjects;
import com.journalServer.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by rocti on 10.06.2017.
 */
@RestController
public class SubjectsController {
    
    @Autowired
    private SubjectService subjectService;

    @RequestMapping(value = "/subjects",method = RequestMethod.GET)
    @ResponseBody
    public List<Subjects> getAllSubjects() {
        return subjectService.getAll();
    }

    @RequestMapping(value = "/subject/{id}",method = RequestMethod.GET)
    @ResponseBody
    public Subjects getSubject(@PathVariable("id") int subjectId) {
        return subjectService.getById(subjectId);
    }

    @RequestMapping(value = "/subject",method = RequestMethod.POST)
    @ResponseBody
    public Subjects saveSubject(@RequestBody Subjects subject) {
        return subjectService.save(subject);
    }

    @RequestMapping(value = "/remove_subject/{id}",method = RequestMethod.POST)
    @ResponseBody
    public void deleteSubject(@PathVariable("id") int subjectId) {
        subjectService.remove(subjectId);
    }
}
