package com.journalServer.repository;

import com.journalServer.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by rocti on 01.03.2017.
 */
@Repository
public interface UserRepository extends JpaRepository<Users,Integer> {
}
