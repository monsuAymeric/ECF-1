package org.simplon.ecf.persistance.repository.bed;

public class BedQueries {
    
    private BedQueries() {
        throw new IllegalStateException("Utility class not meant for instantiation!");
    }

    public static final String FIND_BY_BEDROOM = "Select b FROM Bed b WHERE b.bedroom.id = :id_bedroom";
}
