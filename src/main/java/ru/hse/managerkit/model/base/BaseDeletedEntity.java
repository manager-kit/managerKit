package ru.hse.managerkit.model.base;

import lombok.Getter;

public class BaseDeletedEntity extends BaseEntity{
    @Getter
    boolean isDeleted;
}
