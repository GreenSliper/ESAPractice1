package Entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Getter
@Setter
@Table(name="STUDENTS")
public class Student {
    @Id
    @Column(name = "id")
    @GeneratedValue
    private UUID id;

    @Column(name="group_id")
    private UUID group_id;

    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "group_id")
    private Group group;
}
