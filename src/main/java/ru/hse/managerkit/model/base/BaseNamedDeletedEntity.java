package ru.hse.managerkit.model.base;

import com.querydsl.core.annotations.QueryEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.MappedSuperclass;

@EqualsAndHashCode(callSuper = true)
@MappedSuperclass
@SuperBuilder
@NoArgsConstructor
@Data
@QueryEntity
public class BaseNamedDeletedEntity extends BaseDeletedEntity implements INamedEntity {
    @Getter
    String name;
}
