package org.simplon.ecf.persistance.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "services")
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_service")
    private Long id;

    @Column(name = "name", nullable = false, length = 50)
    private String name;

    /**
     * return the service's id.
     * 
     * @return the service's id.
     */
    public Long getId() {
        return id;
    }

    /**
     * set the service's id.
     * 
     * @param id the service's id to set.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * return the service's name.
     * 
     * @return the service's name.
     */
    public String getName() {
        return name;
    }

    /**
     * set the service's name.
     * 
     * @param id the service's name to set.
     */
    public void setName(String name) {
        this.name = name;
    }

    
}
