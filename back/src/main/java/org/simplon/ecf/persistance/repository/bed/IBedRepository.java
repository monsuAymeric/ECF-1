package org.simplon.ecf.persistance.repository.bed;

import java.util.List;

import org.simplon.ecf.persistance.entity.Bed;
import org.simplon.ecf.persistance.entity.Bedroom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IBedRepository extends JpaRepository<Bed, Long> {

    /**
     * Find Bed by availability.
     * 
     * @param available the availability.
     * @return A list of beds that are available.
     */
    @Query(BedQueries.FIND_BY_AVAILABILITY)
    List<Bed> findByAvailability(final boolean available);
    
    /**
     * Find bed by bedroom.
     * 
     * @param bedroom the bedroom
     * 
     * @return the bed with the given bedroom
     */
    @Query(BedQueries.FIND_BY_BEDROOM)
    Bed findByBedroom(final Bedroom bedroom);
}
