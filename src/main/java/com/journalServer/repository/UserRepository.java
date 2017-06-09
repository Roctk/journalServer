package com.journalServer.repository;

import com.journalServer.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by rocti on 01.03.2017.
 */
public interface UserRepository extends JpaRepository<Users,Integer> {
}
