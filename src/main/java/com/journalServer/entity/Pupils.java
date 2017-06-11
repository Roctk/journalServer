package com.journalServer.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

/**
 * Created by rocti on 06.06.2017.
 */
@Entity
@Table(name = "pupils")
public class Pupils {
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name= "increment", strategy= "increment")
    private Integer id;
    private String login;
    private String password;
    private String lastName;
    private String firstName;
    private String fatherName;
    private Integer gender;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date birth;
    private String mail;
    private String phone;
    private String address;
    private Integer groupId;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "groupId", nullable = false, insertable = false, updatable = false)
    private Group group;

    public Pupils() {
    }

    public Pupils(String login, String password, String lastName, String firstName,
                  String fatherName, Integer gender, Date birth, String mail,
                  String phone, String address, Group group) {
        this.login = login;
        this.password = password;
        this.lastName = lastName;
        this.firstName = firstName;
        this.fatherName = fatherName;
        this.gender = gender;
        this.birth = birth;
        this.mail = mail;
        this.phone = phone;
        this.address = address;
        this.group = group;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }
}
