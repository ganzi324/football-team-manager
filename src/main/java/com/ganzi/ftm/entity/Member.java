package com.ganzi.ftm.entity;

import com.ganzi.ftm.common.enums.MemberRole;
import com.ganzi.ftm.common.enums.Position;
import lombok.Data;

@Data
public class Member {

    private int id;
    private User user;
    private Team team;
    private MemberRole role;
    private int number;
    private Position position;
}
