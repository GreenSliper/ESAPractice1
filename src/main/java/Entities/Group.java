package Entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;
import java.util.UUID;

@Entity
@Getter
@Setter
@Table(name="GROUPS")
public class Group {
    @Id
    @Column(name = "id")
    @GeneratedValue
    private UUID id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "group_id")
    private Set<Student> students;
}
