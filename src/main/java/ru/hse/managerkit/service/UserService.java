package ru.hse.managerkit.service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
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
                .orElse(new User());
    }

    public User findByLogin(String login){
        return get(QUser.user.username.eq(login)).orElse(new User());
    }
}
