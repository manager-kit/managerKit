package ru.hse.managerkit.model.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum TeamRoleEnum {
    PROGRAMMER("PROGRAMMER"),
    DESIGNER("DESIGNER"),
    TEAM_OWNER("TEAM_OWNER"),
    QA("QA"),
    TEAM_LEAD("TEAM_LEAD");

    private final String value;

}
