package com.journalServer.service;

import com.journalServer.entity.Pupils;

import java.util.List;

/**
 * Created by rocti on 01.03.2017.
 */
public interface PupilService {
    List<Pupils> getAll();
    Pupils getById(int id);
    Pupils save(Pupils pupil);
    void remove(int id);
}
