package com.journalServer.service;

import com.journalServer.entity.Account;

import java.util.List;

/**
 * Created by rocti on 01.03.2017.
 */
public interface AccountService {
    List<Account> getAll();
    Account getById(int id);
    Account save(Account account);
    void remove(int id);
}
