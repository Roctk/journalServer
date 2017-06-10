package com.journalServer.service;

import com.journalServer.entity.SubjectGroup;

import java.util.List;

/**
 * Created by rocti on 10.06.2017.
 */
public interface SubjectGroupService {
    List<SubjectGroup> getAll();
    SubjectGroup getById(int id);
    SubjectGroup save(SubjectGroup subjectGroup);
    void remove(int id);
}
