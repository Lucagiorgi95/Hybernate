package co.develhope.hybernate.entities;

import javax.persistence.*;

@Table
@Entity
public class SchoolClass {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String description;


}