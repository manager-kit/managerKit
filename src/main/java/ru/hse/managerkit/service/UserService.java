package ru.hse.managerkit.service;

import com.querydsl.core.types.Predicate;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import ru.hse.managerkit.exception.NotFoundException;
import ru.hse.managerkit.exception.message.ExceptionMessage;
import ru.hse.managerkit.model.QUser;
import ru.hse.managerkit.model.User;
import ru.hse.managerkit.repository.UserRepository;
import ru.hse.managerkit.service.base.AbstractBaseService;

@Service
@AllArgsConstructor
public class UserService extends AbstractBaseService<User, Long, QUser, UserRepository> {
    @Getter
    private final UserRepository repository;

    public User findById(Long id) {
        return get(id)
                .orElseThrow(() -> new NotFoundException(ExceptionMessage.USER_NOT_FOUND));
    }

    public User findByUsername(String username) {
        return get(QUser.user.username.eq(username))
                .orElseThrow(() -> new NotFoundException(ExceptionMessage.USER_NOT_FOUND));
    }

    public Page<User> list(Pageable pageable, Predicate predicate) {
        return findAll(predicate, pageable);
    }

    public void deleteById(Long id) {
        findById(id);
        delete(id);
    }

    public User create(User user) {
        return save(user);
    }

    public User update(User user, Long id) {
        findById(id);
        user.setId(id);
        return save(user);
    }
}
