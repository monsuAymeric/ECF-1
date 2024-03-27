package org.simplon.ecf.persistance.repository.bedroom;

import java.util.List;

import org.simplon.ecf.persistance.entity.Bedroom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IBedroomRepository extends JpaRepository<Bedroom, Long>{

    /**
     * Find bedrooms by service.
     * 
     * @param service the service.
     * 
     * @return A list of bedrooms with the given service.
     */
    @Query(BedroomQueries.FIND_BY_SERVICE)
    List<Bedroom> findByService(final long id_service);
}
