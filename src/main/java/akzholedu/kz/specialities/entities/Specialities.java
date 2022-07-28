package akzholedu.kz.specialities.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "t_specialities")
public class Specialities {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(columnDefinition = "text")
    private String description;

    private String salary;

    @ManyToMany(fetch = FetchType.LAZY)
    private List<Universities> universities;

    @ManyToOne(fetch = FetchType.EAGER)
    private PairSubjects subjects;
}
