package com.journalServer.controller;

import com.journalServer.entity.Teachers;
import com.journalServer.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by rocti on 11.06.2017.
 */
@RestController
public class TeacherController {
    @Autowired
    private TeacherService teacherService;

    @RequestMapping(value = "/teachers",method = RequestMethod.GET)
    @ResponseBody
    public List<Teachers> getAllTeachers() {
        return teacherService.getAll();
    }

    @RequestMapping(value = "/teacher/{id}",method = RequestMethod.GET)
    @ResponseBody
    public Teachers getTeacher(@PathVariable("id") int teacherId) {
        return teacherService.getById(teacherId);
    }

    @RequestMapping(value = "/teacher",method = RequestMethod.POST)
    @ResponseBody
    public Teachers saveTeacher(@RequestBody Teachers teacher) {
        return teacherService.save(teacher);
    }

    @RequestMapping(value = "/remove_teacher/{id}",method = RequestMethod.POST)
    @ResponseBody
    public void deleteTeacher(@PathVariable("id") int teacherId) {
        teacherService.remove(teacherId);
    }
}

