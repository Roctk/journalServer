package com.journalServer.controller;

import com.journalServer.entity.Account;
import com.journalServer.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by rocti on 26.02.2017.
 */
@RestController
public class JournalController {

    @Autowired
    private AccountService service;

    @RequestMapping(value = "/accounts",method = RequestMethod.GET)
    @ResponseBody
    public List<Account> getAllAccounts() {
        return service.getAll();
    }

    @RequestMapping(value = "/accounts/{id}",method = RequestMethod.GET)
    @ResponseBody
    public Account getAccount(@PathVariable("id") int accountId) {
        return service.getById(accountId);
    }

    @RequestMapping(value = "/accounts/",method = RequestMethod.POST)
    @ResponseBody
    public Account saveAccount(@RequestBody Account account) {
        return service.save(account);
    }

    @RequestMapping(value = "/accounts/{id}",method = RequestMethod.POST)
    @ResponseBody
    public void deleteAccount(@PathVariable("id") int accountId) {
        service.remove(accountId);
    }
}
