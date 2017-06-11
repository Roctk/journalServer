package com.journalServer.repository;

import com.journalServer.entity.SubjectGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by rocti on 10.06.2017.
 */
@Repository
public interface SubjectGroupRepository extends JpaRepository<SubjectGroup,Integer> {
}
