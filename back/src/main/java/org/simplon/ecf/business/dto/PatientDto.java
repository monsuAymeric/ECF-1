package org.simplon.ecf.business.dto;

import java.util.Date;

public class PatientDto {
    private long id;
    private ServiceDto service;
    private BedDto bed;
    private String firstname;
    private String lastname;
    private String gender;
    private Date birthday;
    private String security_number;

    /**
     * Get the patient's id to set.
     * 
     * @return the patient's id.
     */
    public long getId() {
        return id;
    }

    /**
     * Set the patient's id.
     * 
     * @param id the patient's id to set.
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * Get the patient's service.
     * 
     * @return the patient's service.
     */
    public ServiceDto getService() {
        return service;
    }

    /**
     * Set the patient's service.
     * 
     * @param service the patient's service to set
     */
    public void setService(ServiceDto service) {
        this.service = service;
    }

    /**
     * Get the patient's bed.
     * 
     * @return the patient's bed.
     */
    public BedDto getBed() {
        return bed;
    }

    /**
     * Set the patient's bed
     * @param bed the patient's bed to set
     */
    public void setBed(BedDto bed) {
        this.bed = bed;
    }

    /**
     * Get the patient's firstname.
     * 
     * 
     * @return the patient's firstname.
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * Set the patient's firstname.
     * 
     * @param firstname the patient's firstname to set
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /**
     * Get the patient's lastname.
     * 
     * @return the patient's lastname.
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * Set the patient's lastname.
     * 
     * @param lastname the patient's lastname to set.
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     * Get the patient's gender.
     * 
     * @return the patient's gender.
     */
    public String getGender() {
        return gender;
    }

    /**
     * Set the patient's gender.
     * @param gender the patient's gender to set.
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * Get the patient's birthday.
     * 
     * @return the patient's birthday.
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * Set the patient's birthday.
     * 
     * @param birthday the patient's birthday to set.
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * Get the patient's security number.
     * 
     * @return the patient's security number
     */
    public String getSecurity_number() {
        return security_number;
    }

    /**
     * Set the patient's security number
     * 
     * @param security_number the patient's security number to set.
     */
    public void setSecurity_number(String security_number) {
        this.security_number = security_number;
    }

    

}
