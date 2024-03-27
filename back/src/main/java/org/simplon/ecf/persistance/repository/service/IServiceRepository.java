package org.simplon.ecf.persistance.repository.service;

import org.simplon.ecf.persistance.entity.Service;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IServiceRepository extends JpaRepository<Service, Long>{
    
    @Query(ServiceQueries.FIND_BY_NAME)
    Service findByName(final String name);
}
