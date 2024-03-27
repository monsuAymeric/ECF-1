package org.simplon.ecf.persistance.repository.bed;

public class BedQueries {
    
    private BedQueries() {
        throw new IllegalStateException("Utility class not meant for instantiation!");
    }

    public static final String FIND_BY_BEDROOM = "Select c FROM Bed c WHERE c.bedroom.id = :id_bedroom";
}
