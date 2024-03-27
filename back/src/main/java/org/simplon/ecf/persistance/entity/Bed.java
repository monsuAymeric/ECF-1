package org.simplon.ecf.persistance.entity;

import jakarta.persistence.Column;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "beds")
public class Bed {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_bed")
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_bedroom", referencedColumnName = "id_bedroom")
    private Bedroom bedroom;

    /**
     * return the bed's id.
     * 
     * @return the bed's id.
     */
    public long getId() {
        return id;
    }

    /**
     * set the bed's id.
     * 
     * @param id the bed's id to set.
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * return the bed's bedroom.
     * 
     * @return the bed's bedroom.
     */
    public Bedroom getBedroom() {
        return bedroom;
    }

    /**
     * set the bed's bedroom.
     * 
     * @param id the bed's bedroom to set.
     */
    public void setBedroom(Bedroom bedroom) {
        this.bedroom = bedroom;
    }

    
}
