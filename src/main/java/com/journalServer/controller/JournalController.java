package com.journalServer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by rocti on 26.02.2017.
 */
@Controller
@RequestMapping("/journal")
public class JournalController {

    @RequestMapping(value = "/get",method = RequestMethod.GET)
    @ResponseBody
    public String getJournal(ModelMap modelMap) {
        return "My journal";
    }
}
