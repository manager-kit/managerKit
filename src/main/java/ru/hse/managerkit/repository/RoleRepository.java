package ru.hse.managerkit.repository;

import org.springframework.stereotype.Repository;
import ru.hse.managerkit.model.QRole;
import ru.hse.managerkit.model.Role;
import ru.hse.managerkit.model.enums.RoleEnum;

@Repository
public interface RoleRepository extends BaseRepository<Role, Long, QRole> {
    Role findByName(RoleEnum enumRole);
}
