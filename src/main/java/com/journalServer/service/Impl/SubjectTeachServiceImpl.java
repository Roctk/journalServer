package com.journalServer.service.Impl;

import com.journalServer.entity.SubjectTeach;
import com.journalServer.repository.SubjectTeacherRepository;
import com.journalServer.service.SubjectTeachService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by rocti on 10.06.2017.
 */
@Service
public class SubjectTeachServiceImpl implements SubjectTeachService {

    @Autowired
    private SubjectTeacherRepository subjectTeacherRepository;

    public List<SubjectTeach> getAll() {
        return subjectTeacherRepository.findAll();
    }

    public SubjectTeach getById(int id) {
        return subjectTeacherRepository.findOne(id);
    }

    public SubjectTeach save(SubjectTeach subjectTeach) {
        return subjectTeacherRepository.save(subjectTeach);
    }

    public void remove(int id) {
        subjectTeacherRepository.delete(id);
    }
}
