package com.journalServer.service.Impl;

import com.journalServer.entity.Teachers;
import com.journalServer.repository.TeacherRepository;
import com.journalServer.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by rocti on 11.06.2017.
 */
@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private TeacherRepository teacherRepository;

    public List<Teachers> getAll() {
        return teacherRepository.findAll();
    }

    public Teachers getById(int id) {
        return teacherRepository.findOne(id);
    }

    public Teachers save(Teachers teacher) {
        return teacherRepository.save(teacher);
    }

    public void remove(int id) {
        teacherRepository.delete(id);
    }
}
