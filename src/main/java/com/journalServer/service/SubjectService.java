package com.journalServer.service;

import com.journalServer.entity.Subjects;

import java.util.List;

/**
 * Created by rocti on 10.06.2017.
 */
public interface SubjectService {
    List<Subjects> getAll();
    Subjects getById(int id);
    Subjects save(Subjects subjects);
    void remove(int id);
}
