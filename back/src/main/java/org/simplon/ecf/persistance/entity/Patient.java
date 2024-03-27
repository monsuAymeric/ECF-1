package org.simplon.ecf.persistance.entity;

import java.sql.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "patients")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_patient")
    private Long patient;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_service", referencedColumnName = "id_service")
    private Service service;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_bed", referencedColumnName = "id_bed")
    private Bed bed;

    @Column(name = "firstname", nullable = false, length = 50)
    private String firstname;

    @Column(name = "lastname", nullable = false, length = 50)
    private String lastname;

    @Column(name = "gender", nullable = false, length = 10)
    private String gender;

    @Column(name = "birthday", nullable = false)
    private Date birthday;

    @Column(name = "security_number", nullable = false, length = 15)
    private String security_number;
}
