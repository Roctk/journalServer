package com.journalServer.service;

import com.journalServer.entity.Marks;

import java.util.List;

/**
 * Created by rocti on 10.06.2017.
 */
public interface MarksService {
    List<Marks> getAll();
    Marks getById(int id);
    Marks save(Marks marks);
    void remove(int id);
}
