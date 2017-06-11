package com.journalServer.service;

import com.journalServer.entity.SubjectTeach;

import java.util.List;

/**
 * Created by rocti on 10.06.2017.
 */
public interface SubjectTeachService {
    List<SubjectTeach> getAll();
    SubjectTeach getById(int id);
    SubjectTeach save(SubjectTeach subjectTeach);
    void remove(int id);
}
