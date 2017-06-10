package com.journalServer.repository;

import com.journalServer.entity.Subjects;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by rocti on 10.06.2017.
 */
public interface SubjectRepository extends JpaRepository<Subjects,Integer> {
}
