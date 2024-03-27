package org.simplon.ecf.persistance.repository.patient;

import org.simplon.ecf.persistance.entity.Bed;
import org.simplon.ecf.persistance.entity.Patient;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IPatientRepository {
    
    /**
     * Find bed by patient.
     * 
     * @param bed the bed.
     * 
     * @return the bed with the given patient.
     */
    @Query(PatientQueries.FIND_BY_BED)
    Patient findByBed(final Bed bed);

    /**
     * Find the patient by firstname
     * 
     * @param firstname the firstname
     * 
     * @return the firstname with the given patient
     */
    @Query(PatientQueries.FIND_BY_FIRSTNAME)
    Patient findByFirstname(final String firstname);

    /**
     * Find the patient by lastname
     * 
     * @param lastname the lastname
     * 
     * @return the lastname with the given patient
     */
    @Query(PatientQueries.FIND_BY_LASTNAME)
    Patient findByLastname(final String lastname);

    /**
     * Find the patient by service
     * 
     * @param service the service
     * 
     * @return the service with the given patient
     */
    @Query(PatientQueries.FIND_BY_SERVICE)
    Patient findByService(final Long id_service);
}
