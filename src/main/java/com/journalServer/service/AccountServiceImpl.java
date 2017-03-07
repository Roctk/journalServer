package com.journalServer.service;

import com.journalServer.entity.Account;
import com.journalServer.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by rocti on 01.03.2017.
 */
@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountRepository accountRepository;

    public List<Account> getAll() {
        return accountRepository.findAll();
    }

    public Account getById(int id) {
        return accountRepository.findOne(id);
    }

    public Account save(Account account) {
        return accountRepository.saveAndFlush(account);
    }

    public void remove(int id) {
        accountRepository.delete(id);
    }
}
