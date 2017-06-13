package com.journalServer.service.Impl;

import com.journalServer.entity.Subjects;
import com.journalServer.repository.SubjectRepository;
import com.journalServer.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by rocti on 10.06.2017.
 */
@Service
public class SubjectServiceImpl implements SubjectService {

    @Autowired
    private SubjectRepository subjectRepository;

    public List<Subjects> getAll() {
        return subjectRepository.findAll();
    }

    public Subjects getById(int id) {
        return subjectRepository.findOne(id);
    }

    public Subjects save(Subjects subjects) {
        return subjectRepository.save(subjects);
    }

    public void remove(int id) {
        subjectRepository.delete(id);
    }
}
