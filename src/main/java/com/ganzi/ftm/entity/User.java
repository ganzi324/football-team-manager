package com.ganzi.ftm.entity;

import lombok.Data;

import java.util.Date;

@Data
public class User {

    private int id;
    private String email;
    private String password;
    private Date createdAt;
    private Date updatedAt;

}
