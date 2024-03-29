package org.simplon.ecf.business.service.bedroom;

import java.util.List;
import org.simplon.ecf.business.dto.BedroomDto;

public interface IBedroomService {
    
    /**
     * Saves a bedroom in the database.
     * 
     * @param bedroom the bedroom to save.
     */
    void createBedroom(final BedroomDto bedroom);

    /**
     * Returns all bedrooms in the database.
     * 
     * @return all bedrooms in the database.
     */
    List<BedroomDto> getAllBedroom();

    /**
     * Returns the bedroom with the given id.
     * 
     * @param id the id of the bedroom.
     * 
     * @return the bedroom with the given id.
     */
    BedroomDto getBedroomById(final long id);

    /**
     * delete the bedroom with the given id.
     * 
     * @param id the id of the bedroom.
     */
    void deleteBedroom(final long id);
}
