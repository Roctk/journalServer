package com.journalServer.entity;

import javax.persistence.*;

/**
 * Created by rocti on 26.02.2017.
 */
@Entity
@Table(name = "account")
public class Account {

    @Id
    private Integer id;
    private String name;
    private String phone;

    public Account(){
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String login) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
