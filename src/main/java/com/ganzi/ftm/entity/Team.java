package com.ganzi.ftm.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Team {

    private int id;
    private String name;
    private Date createdAt;
    private Date updatedAt;

}
