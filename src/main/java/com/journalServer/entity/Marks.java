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
    private String val;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dates;
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
        return val;
    }

    public void setValue(String val) {
        this.val = val;
    }

    public Date getDate() {
        return dates;
    }

    public void setDate(Date dates) {
        this.dates = dates;
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
