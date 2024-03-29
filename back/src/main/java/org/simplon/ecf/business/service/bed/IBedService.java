package org.simplon.ecf.business.service.bed;

import java.util.List;
import org.simplon.ecf.business.dto.BedDto;

public interface IBedService {
    
    /**
     * Saves a bed in the database.
     * 
     * @param bed the bed to save.
     */
    void createBed(final BedDto bed);

    /**
     *  Returns all available beds in the database.
     * 
     * @return all available beds in the database.
     */
    List<BedDto> getAvailableBed();

    /**
     * Returns the bed with the given id.
     * 
     * @param id the id of the bed.
     * 
     * @return the bed with the given id.
     */
    BedDto getBedById(final long id);

    /**
     * Deletes the car with the given id.
     * 
     * @param id the id of the bed.
     */
    void deleteBed(final long id);
}
