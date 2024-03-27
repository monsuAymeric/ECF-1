package org.simplon.ecf.persistance.repository.patient;

public class PatientQueries {

    private PatientQueries() {
        throw new IllegalStateException("Utility class not meant for instantation!");
    }

    public static final String FIND_BY_SERVICE = "SELECT p FROM Patient p WHERE p.service.id = :id_service";
    public static final String FIND_BY_BED = "SELECT p FROM Patient p WHERE p.bed.id = :id_bed";
    public static final String FIND_BY_FIRSTNAME = "SELECT p FROM Patient p WHERE p.firstname = :firstname";
    public static final String FIND_BY_LASTNAME = "SELECT p FROM Patient p WHERE p.lastname = :lastname";
}
