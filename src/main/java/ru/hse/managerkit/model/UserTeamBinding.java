package ru.hse.managerkit.model;

import lombok.*;
import lombok.experimental.SuperBuilder;
import ru.hse.managerkit.model.embeded.UserTeamBindingKey;

import javax.persistence.*;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user_team_binding", schema = "public")
@ToString
public class UserTeamBinding {

    @EmbeddedId
    UserTeamBindingKey id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    @MapsId("userId")
    private User user;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "team_id")
    @MapsId("teamId")
    private Team team;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "team_role_id")
    private TeamRole teamRole;
}
