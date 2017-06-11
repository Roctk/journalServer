package com.journalServer.service.Impl;

import com.journalServer.entity.Pupils;
import com.journalServer.repository.PupilRepository;
import com.journalServer.service.PupilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by rocti on 01.03.2017.
 */
@Service
public class PupilServiceImpl implements PupilService {

    @Autowired
    private PupilRepository pupilRepository;

    public List<Pupils> getAll() {
        return pupilRepository.findAll();
    }

    public Pupils getById(int id) {
        return pupilRepository.findOne(id);
    }

    public Pupils save(Pupils pupil) {
        return pupilRepository.save(pupil);
    }

    public void remove(int id) {
        pupilRepository.delete(id);
    }
}
