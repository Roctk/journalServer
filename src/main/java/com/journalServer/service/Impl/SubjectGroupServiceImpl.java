package com.journalServer.service.Impl;

import com.journalServer.entity.SubjectGroup;
import com.journalServer.repository.SubjectGroupRepository;
import com.journalServer.service.SubjectGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by rocti on 10.06.2017.
 */
@Service
public class SubjectGroupServiceImpl implements SubjectGroupService {

    @Autowired
    private SubjectGroupRepository subjectGroupRepository;

    public List<SubjectGroup> getAll() {
        return subjectGroupRepository.findAll();
    }

    public SubjectGroup getById(int id) {
        return subjectGroupRepository.findOne(id);
    }

    public SubjectGroup save(SubjectGroup subjectGroup) {
        return subjectGroupRepository.saveAndFlush(subjectGroup);
    }

    public void remove(int id) {
        subjectGroupRepository.delete(id);
    }
}
