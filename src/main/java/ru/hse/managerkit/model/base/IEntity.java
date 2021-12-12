package ru.hse.managerkit.model.base;

import java.io.Serializable;

public interface IEntity<T extends Serializable> {
    T getId();
}
