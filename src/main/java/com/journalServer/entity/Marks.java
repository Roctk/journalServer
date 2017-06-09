package com.journalServer.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by rocti on 06.06.2017.
 */
@Entity
@Table(name = "`marks`")
public class Marks {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String value;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date date;
    private Integer user_id;
    private Integer subject_id;
    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "user_id", nullable = false,updatable = false,insertable = false)
    private Users users;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "subject_id", nullable = false, updatable = false,insertable = false)
    private Subjects subjects;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Integer getSubject_id() {
        return subject_id;
    }

    public void setSubject_id(Integer subject_id) {
        this.subject_id = subject_id;
    }
}
