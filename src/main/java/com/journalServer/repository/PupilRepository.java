package com.journalServer.repository;

import com.journalServer.entity.Pupils;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by rocti on 01.03.2017.
 */
@Repository
public interface PupilRepository extends JpaRepository<Pupils,Integer> {
}
