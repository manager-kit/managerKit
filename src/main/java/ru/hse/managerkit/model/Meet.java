package ru.hse.managerkit.model;

import lombok.*;
import lombok.experimental.SuperBuilder;
import ru.hse.managerkit.model.base.BaseNamedEntity;

import javax.persistence.*;
import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "meet", schema = "public")
@ToString
public class Meet extends BaseNamedEntity {

    @Column(name = "agenda")
    private String agenda;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "interviewer_id")
    private User interviewer;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "respondent_id")
    private User respondent;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "score_id")
    private Score score;

    @Column(name = "date_from")
    private Date dateFrom;

    @Column(name = "date_to")
    private Date dateTo;

    @Column(name = "is_closed")
    private boolean isClosed;
}
