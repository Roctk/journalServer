package com.journalServer.controller;

import com.journalServer.entity.Marks;
import com.journalServer.service.MarksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by rocti on 10.06.2017.
 */
@RestController
public class MarksController {
    
    @Autowired
    private MarksService marksService;

    @RequestMapping(value = "/marks",method = RequestMethod.GET)
    @ResponseBody
    public List<Marks> getAllMarks() {
        return marksService.getAll();
    }

    @RequestMapping(value = "/mark/{id}",method = RequestMethod.GET)
    @ResponseBody
    public Marks getMark(@PathVariable("id") int markId) {
        return marksService.getById(markId);
    }

    @RequestMapping(value = "/mark",method = RequestMethod.POST)
    @ResponseBody
    public Marks saveMark(@RequestBody Marks mark) {
        return marksService.save(mark);
    }

    @RequestMapping(value = "/remove_mark/{id}",method = RequestMethod.POST)
    @ResponseBody
    public void deleteMark(@PathVariable("id") int markId) {
        marksService.remove(markId);
    }
}
