package org.simplon.ecf.presentation.controller.patient;

import org.simplon.ecf.business.service.patient.IPatientService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class DeletePatientController {
    private IPatientService patientService;

    /**
     * Injects the patient service.
     * 
     * @param patientService the patient service
     */
    public DeletePatientController(IPatientService patientService) {
        this.patientService = patientService;
    }

    /**
     * Deletes the patient with the given id.
     * 
     * @param id the id of the patient
     */
    @DeleteMapping("/patients/{id}")
    public void deletePatient(final @PathVariable long id) {
        patientService.deletePatient(id);
    }
}
