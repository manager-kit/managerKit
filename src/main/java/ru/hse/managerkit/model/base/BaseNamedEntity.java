package ru.hse.managerkit.model.base;

import lombok.Getter;

public class BaseNamedEntity extends BaseEntity implements INamedEntity{
    @Getter
    String name;
}
