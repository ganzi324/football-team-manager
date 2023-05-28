package com.ganzi.ftm.common.enums;

public enum MemberRole {
    ADMIN(0, "관리자"),
    NORMAL(1, "일반 맴버")
    ;

    private final String label;

    MemberRole(int number, String label) {
        this.label = label;
    }
}
