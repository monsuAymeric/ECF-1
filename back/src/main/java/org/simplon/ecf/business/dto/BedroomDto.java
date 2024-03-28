package org.simplon.ecf.business.dto;

public class BedroomDto {
    private long id;
    private ServiceDto service;

    /**
     * Get the bedroom's id.
     * 
     * @return the bedroom's id.
     */
    public long getId() {
        return id;
    }
    /**
     *  Set the bedroom's id.
     * 
     * @param id the bedroom's id to set.
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * Get the bedroom's service.
     * 
     * @return the bedroom's service.
     */
    public ServiceDto getService() {
        return service;
    }

    /**
     * Set the bedroom's service.
     * 
     * @param service the bedroom's service to set.
     */
    public void setService(ServiceDto service) {
        this.service = service;
    }

    
}
