package com.journalServer.repository;

import com.journalServer.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by rocti on 01.03.2017.
 */
public interface AccountRepository extends JpaRepository<Account,Integer> {
}
