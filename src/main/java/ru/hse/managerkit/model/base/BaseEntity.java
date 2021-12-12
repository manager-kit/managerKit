package ru.hse.managerkit.model.base;

import lombok.Getter;

import java.util.Date;

public class BaseEntity implements IEntity{
    @Getter
    Long id;

    @Getter
    Date createdAt;

    @Getter
    Date updatedAt;
}
