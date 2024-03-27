package org.simplon.ecf.persistance.repository.bed;

public class BedQueries {
    
    private BedQueries() {
        throw new IllegalStateException("Utility class not meant for instantiation!");
    }

    public static final String FIND_BY_BEDROOM = "SELECT b FROM Bed b WHERE b.bedroom.id = :id_bedroom";
    public static final String FIND_BY_AVAILABILITY = "SELECT b FROM Bed b WHERE b.available = true";
}
