package ru.hse.managerkit.model;

import lombok.*;
import lombok.experimental.SuperBuilder;
import ru.hse.managerkit.model.base.BaseDeletedEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "score", schema = "public")
@EqualsAndHashCode(callSuper = true)
@ToString
public class Score extends BaseDeletedEntity {
    @Column(name = "main_score")
    private int mainScore;

    @Column(name = "team_satisfaction")
    private int teamSatisfaction;

    @Column(name = "management_satisfaction")
    private int managementSatisfaction;

    @Column(name = "relations_with_subordinates")
    private int relationsWithSubordinates;

    @Column(name = "relations_with_superiors")
    private int relationsWithSuperiors;

    @Column(name = "management_control")
    private int managementControl;

    @Column(name = "professional_burnout")
    private int professionalBurnout;

    @Column(name = "achievements_at_work")
    private int achievementsAtWork;

    @Column(name = "tasks_performed")
    private int tasksPerformed;

    @Column(name = "level_of_responsibility")
    private int levelOfResponsibility;

    @Column(name = "career_growth")
    private int careerGrowth;

    @Column(name = "personal_growth")
    private int personalGrowth;

    @Column(name = "recognition_in_the_team")
    private int recognitionInTheTeam;
}
