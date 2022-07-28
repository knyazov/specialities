package akzholedu.kz.specialities.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "t_pairSubjects")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PairSubjects {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String subject;
}
