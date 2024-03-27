package org.simplon.ecf.persistance.repository.bedroom;

public class BedroomQueries {
    
    private BedroomQueries() {
        throw new IllegalStateException("Utility class not meant for instantiation!");
    }

    public static final String FIND_BY_SERVICE = "SELECT b from Bedroom u WHERE b.service = :id_service";
}
