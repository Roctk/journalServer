package com.journalServer.service;
import com.journalServer.entity.Teachers;

import java.util.List;

/**
 * Created by rocti on 11.06.2017.
 */
public interface TeacherService {
    List<Teachers> getAll();
    Teachers getById(int id);
    Teachers save(Teachers teacher);
    void remove(int id);
}
