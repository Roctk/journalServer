package com.journalServer.controller;

import com.journalServer.entity.Pupils;
import com.journalServer.service.PupilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by rocti on 26.02.2017.
 */
@RestController
public class PupilController {

    @Autowired
    private PupilService pupilService;

    @RequestMapping(value = "/pupils",method = RequestMethod.GET)
    @ResponseBody
    public List<Pupils> getAllPupils() {
        return pupilService.getAll();
    }

    @RequestMapping(value = "/pupil/{id}",method = RequestMethod.GET)
    @ResponseBody
    public Pupils getPupil(@PathVariable("id") int pupilId) {
        return pupilService.getById(pupilId);
    }

    @RequestMapping(value = "/pupil",method = RequestMethod.POST)
    @ResponseBody
    public Pupils savePupil(@RequestBody Pupils pupil) {
        return pupilService.save(pupil);
    }

    @RequestMapping(value = "/remove_pupil/{id}",method = RequestMethod.POST)
    @ResponseBody
    public void deletePupil(@PathVariable("id") int pupilId) {
        pupilService.remove(pupilId);
    }
}
