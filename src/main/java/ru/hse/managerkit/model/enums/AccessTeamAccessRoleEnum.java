package ru.hse.managerkit.model.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum AccessTeamAccessRoleEnum {
    MANAGER("MANAGER"),
    PARTICIPANT("PARTICIPANT");

    private final String value;

}
