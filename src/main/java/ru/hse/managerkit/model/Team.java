package ru.hse.managerkit.model;

import lombok.*;
import lombok.experimental.SuperBuilder;
import ru.hse.managerkit.model.base.BaseNamedDeletedEntity;

import javax.persistence.*;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "team", schema = "public")
@ToString
public class Team extends BaseNamedDeletedEntity {

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "director_id")
    private User director;

    @OneToMany(mappedBy = "team")
    List<UserTeamBinding> teams;
}
