package org.simplon.ecf.presentation.controller.patient;

import org.simplon.ecf.business.dto.PatientDto;
import org.simplon.ecf.business.service.patient.IPatientService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class CreatePatientController {
    private IPatientService patientService;

    /**
     * Injects the patient service.
     * 
     * @param patientService the patient service.
     */
    public CreatePatientController(IPatientService patientService) {
        this.patientService = patientService;
    }

    @PostMapping("/patients")
    public void createPatient(final @RequestBody PatientDto patient) {
        patientService.createPatient(patient);
    }
}
