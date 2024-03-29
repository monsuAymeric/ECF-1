package org.simplon.ecf.business.service.patient;

import java.util.List;

import org.simplon.ecf.business.dto.PatientDto;
import org.simplon.ecf.business.dto.ServiceDto;

public interface IPatientService {

    /**
     * Saves a patient in the database.
     * 
     * @param patient the patient to save.
     */
    void createPatient(final PatientDto patient);

    /**
     * Returns all patient with the given service.
     * 
     * @param service the service of the patient
     *  
     * @return the patient with the given service.
     */
    List<PatientDto> getAllPatientByService(final ServiceDto service);

    /**
     * Returns all patient in the database.
     * 
     * @return all patients in the database.
     */
    List<PatientDto> getAllPatient();

    /**
     * Modifies the patient.
     * 
     * @param patient the patient to modify.
     */
    void modifyPatient(final PatientDto patient);

    /**
     * Delete the patient with the given id.
     * 
     * @param id the id of the patient.
     */
    void deletePatient(final long id);
}
