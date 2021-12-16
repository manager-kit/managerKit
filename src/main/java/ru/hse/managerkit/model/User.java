package ru.hse.managerkit.model;

import lombok.*;
import lombok.experimental.SuperBuilder;
import ru.hse.managerkit.model.base.BaseNamedDeletedEntity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user")
@EqualsAndHashCode(callSuper = true)
@ToString
public class User extends BaseNamedDeletedEntity {

    private String lastName;

    private String username;

    private String password;

    private String email;

//    private Long scoreId;

//    @ManyToMany(fetch = FetchType.EAGER)
//    @JoinTable(name="user_role_binding",
//            joinColumns = @JoinColumn(name = "user_id"),
//            inverseJoinColumns = @JoinColumn(name = "role_id"))
//    List<Role> roles = new ArrayList<>();

}
