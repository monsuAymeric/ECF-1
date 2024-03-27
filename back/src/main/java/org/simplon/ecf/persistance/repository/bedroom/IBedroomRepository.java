package org.simplon.ecf.persistance.repository.bedroom;

import org.simplon.ecf.persistance.entity.Bedroom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IBedroomRepository extends JpaRepository<Bedroom, Long>{
    @Query(BedroomQueries.FIND_BY_SERVICE)
    Bedroom findByService(final long id_service);
}
