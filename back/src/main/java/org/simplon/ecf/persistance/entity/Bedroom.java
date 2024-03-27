package org.simplon.ecf.persistance.entity;

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
@Table(name = "bedrooms")
public class Bedroom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_bedroom")
    private Long id;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_service", referencedColumnName = "id_service")
    private Service service;

    /**
     * return the bedroom's id.
     * 
     * @return the bedroom's id.
     */
    public Long getId() {
        return id;
    }

    /**
     * set the bedroom's id.
     * @param id the bedroom's id to set.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * return the bedroom's service.
     * 
     * @return the bedroom's service.
     */
    public Service getService() {
        return service;
    }

    /**
     * set the bedroom's service.
     * @param id the bedroom's service to set.
     */
    public void setService(Service service) {
        this.service = service;
    }

    
}
