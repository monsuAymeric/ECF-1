package org.simplon.ecf.business.dto;

public class ServiceDto {
    private long id;
    private String name;

    /**
     * Get the service's id.
     * 
     * @return the service's id.
     */
    public long getId() {
        return id;
    }
    
    /**
     * Set the service's id.
     * 
     * @param id the service's id to set.
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * Get the service's name.
     * 
     * @return the service's name.
     */
    public String getName() {
        return name;
    }

    /**
     * Set the service's name.
     * 
     * @param name the service's name to set.
     */
    public void setName(String name) {
        this.name = name;
    }

    
}
