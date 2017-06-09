package com.journalServer.entity;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by rocti on 06.06.2017.
 */
@Entity
@Table(name = "`group`")
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "group")
    private Set<Users> users;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "group")
    private Set<SubjectGroup> subjectGroups;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
