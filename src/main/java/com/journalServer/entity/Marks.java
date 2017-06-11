package com.journalServer.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by rocti on 06.06.2017.
 */
@Entity
@Table(name = "marks")
public class Marks {
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name= "increment", strategy= "increment")
    private Integer id;
    private Integer mark;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date date;
    private Integer pupilId;
    private Integer subjectId;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "pupilId", nullable = false, insertable = false, updatable = false)
    private Pupils pupil;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "subjectId", nullable = false, insertable = false, updatable = false)
    private Subjects subject;

    public Marks() {
    }

    public Marks(Integer mark, Date date, Integer pupilId,
                 Integer subjectId, Pupils pupil, Subjects subject) {
        this.mark = mark;
        this.date = date;
        this.pupilId = pupilId;
        this.subjectId = subjectId;
        this.pupil = pupil;
        this.subject = subject;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMark() {
        return mark;
    }

    public void setMark(Integer mark) {
        this.mark = mark;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getPupilId() {
        return pupilId;
    }

    public void setPupilId(Integer pupilId) {
        this.pupilId = pupilId;
    }

    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    public Pupils getPupil() {
        return pupil;
    }

    public void setPupil(Pupils pupil) {
        this.pupil = pupil;
    }

    public Subjects getSubject() {
        return subject;
    }

    public void setSubject(Subjects subject) {
        this.subject = subject;
    }
}
