package org.simplon.ecf.persistance.repository.service;

public class ServiceQueries {
    
    private ServiceQueries() {
        throw new IllegalStateException("Utility class not meant for instantiation!");
    }

    public static final String FIND_BY_NAME = "SELECT s FROM Service s WHERE s.name = :name";
    
}
