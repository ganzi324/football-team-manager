package com.ganzi.ftm.entity;

import com.ganzi.ftm.common.enums.GameType;
import lombok.Data;

import java.util.Date;

@Data
public class Game {

    private int id;
    private Team team;
    private GameType type;
    private Date gameDate;
    private Date createdAt;
    private Date updatedAt;
}
