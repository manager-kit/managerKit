package ru.hse.managerkit.model;


import lombok.*;
import lombok.experimental.SuperBuilder;
import ru.hse.managerkit.model.base.IEntity;
import ru.hse.managerkit.model.enums.AccessTeamAccessRoleEnum;
import ru.hse.managerkit.model.enums.TeamRoleEnum;

import javax.persistence.*;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "team_role", schema = "public")
@ToString
public class TeamRole implements IEntity<Long> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private TeamRoleEnum teamRole;

    @Enumerated(EnumType.STRING)
    private AccessTeamAccessRoleEnum accessTeamRole;
}
