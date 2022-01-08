package ru.hse.managerkit.model.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum RoleEnum {
    ADMIN("ADMIN"),
    USER("USER");

    private final String value;

}
