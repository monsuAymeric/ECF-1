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
    private long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_bedroom", referencedColumnName = "id_bedroom")
    private Bedroom bedroom;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Bedroom getBedroom() {
        return bedroom;
    }

    public void setBedroom(Bedroom bedroom) {
        this.bedroom = bedroom;
    }

    
}
