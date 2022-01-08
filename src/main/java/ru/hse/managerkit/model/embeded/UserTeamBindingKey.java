package ru.hse.managerkit.model.embeded;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class UserTeamBindingKey implements Serializable {
    @Column(name = "user_id")
    Long userId;

    @Column(name = "team_id")
    Long teamId;
}
