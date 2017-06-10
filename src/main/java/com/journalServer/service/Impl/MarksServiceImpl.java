package com.journalServer.service.Impl;

import com.journalServer.entity.Marks;
import com.journalServer.repository.MarksRepository;
import com.journalServer.service.MarksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by rocti on 10.06.2017.
 */
@Service
public class MarksServiceImpl implements MarksService {

    @Autowired
    private MarksRepository marksRepository;

    public List<Marks> getAll() {
        return marksRepository.findAll();
    }

    public Marks getById(int id) {
        return marksRepository.findOne(id);
    }

    public Marks save(Marks marks) {
        return marksRepository.saveAndFlush(marks);
    }

    public void remove(int id) {
        marksRepository.delete(id);
    }
}
