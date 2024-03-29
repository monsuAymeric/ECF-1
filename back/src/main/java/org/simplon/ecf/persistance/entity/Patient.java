package org.simplon.ecf.persistance.entity;

import java.util.Date;

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
    private Long id;

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

    /**
     * return the patient's id.
     * 
     * @return the patient's id
     */
    public Long getId() {
        return id;
    }

    /**
     * set the patient's id.
     * 
     * @param id the patient's id to set.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * return the patient's service.
     * 
     * @return the patient's service.
     */
    public Service getService() {
        return service;
    }

    /**
     * set the patient's service.
     * 
     * @param id the patient's service to set.
     */
    public void setService(Service service) {
        this.service = service;
    }

    /**
     * return the patient's bed.
     * 
     * @return the patient's bed.
     */
    public Bed getBed() {
        return bed;
    }

    /**
     * set the patient's bed.
     * 
     * @param id the patient's bed to set.
     */
    public void setBed(Bed bed) {
        this.bed = bed;
    }

    /**
     * return the patient's firstname.
     * 
     * @return the patient's firstname.
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * set the patient's firstname.
     * 
     * @param id the patient's firstname to set.
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /**
     * return the patient's lastname.
     * 
     * @return the patient's lastname.
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * set the patient's lastname.
     * 
     * @param id the patient's lastname to set.
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     * return the patient's gender.
     * 
     * @return the patient's gender.
     */
    public String getGender() {
        return gender;
    }

    /**
     * set the patient's gender.
     * 
     * @param id the patient's gender to set.
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * return the patient's birthday.
     * 
     * @return the patient's birthday.
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * set the patient's birthday.
     * 
     * @param id the patient's birthday to set.
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * return the patient's security number.
     * 
     * @return the patient's security number.
     */
    public String getSecurity_number() {
        return security_number;
    }

    /**
     * set the patient's security number.
     * 
     * @param id the patient's security number to set.
     */
    public void setSecurity_number(String security_number) {
        this.security_number = security_number;
    }

    
}
