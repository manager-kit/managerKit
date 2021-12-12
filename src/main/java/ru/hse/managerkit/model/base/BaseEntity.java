package ru.hse.managerkit.model.base;

import com.querydsl.core.annotations.QueryEntity;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.MappedSuperclass;
import java.util.Date;

@MappedSuperclass
@SuperBuilder
@NoArgsConstructor
@Data
@QueryEntity
public class BaseEntity implements IEntity<Long>{
    @Getter
    Long id;

    @Getter
    Date createdAt;

    @Getter
    Date updatedAt;
}
