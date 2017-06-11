package com.journalServer.repository;

import com.journalServer.entity.Teachers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by rocti on 11.06.2017.
 */
@Repository
public interface TeacherRepository extends JpaRepository<Teachers,Integer> {
}
