package co.develhope.hybernate.entities;

import javax.persistence.*;

@Table
@Entity
public class Enrollment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "school_class_id")
    private SchoolClass schoolClass;


}