package ru.hse.managerkit.service.base;

import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import ru.hse.managerkit.model.base.IEntity;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;
import com.querydsl.core.types.Predicate;

public interface BaseService<T extends IEntity<I>, I extends Serializable> {

    Optional<T> get(I id);

    Page<T> findAll(Predicate predicate, Pageable pageable);

    List<T> findAll(Predicate predicate);

    List<T> findAll();

    T save(T t);

    void delete(T t);

    void delete(I id) throws ChangeSetPersister.NotFoundException;

    boolean isExist(I id);

    Optional<T> get(Predicate predicate);
}
