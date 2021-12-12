package ru.hse.managerkit.model.base;

import lombok.Getter;

public class BaseNamedDeletedEntity extends BaseDeletedEntity implements INamedEntity {
    @Getter
    String name;
}
