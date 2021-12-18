package ru.hse.managerkit.repository;

import org.springframework.stereotype.Repository;
import ru.hse.managerkit.model.QUser;
import ru.hse.managerkit.model.User;

@Repository
public interface UserRepository extends BaseRepository<User, Long, QUser> {
}
