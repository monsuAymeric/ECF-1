package org.simplon.ecf.business.dto;

public class BedDto {
    private long id;
    private BedroomDto bedroom;
    private boolean available;

    /**
     * Get the bed's id.
     * 
     * @return the bed's id.
     */
    public long getId() {
        return id;
    }

    /**
     * Set the bed's id.
     * 
     * @param id the bed's id to set
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * Get the bed's bedroom.
     * 
     * @return the bed's bedroom.
     */
    public BedroomDto getBedroomDto() {
        return bedroom;
    }

    /**
     * Set the bed's bedroom.
     * 
     * @param bedroom the bed's bedroom to set
     */
    public void setBedroomDto(BedroomDto bedroom) {
        this.bedroom = bedroom;
    }

    /**
     * Get the bed's availability.
     * 
     * @return the bed's availability.
     */
    public boolean isAvailable() {
        return available;
    }

    /**
     * Set the bed's availability.
     * 
     * @param available the bed's availability to set
     */
    public void setAvailable(boolean available) {
        this.available = available;
    }

    
}
