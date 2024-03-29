package org.simplon.ecf.presentation.controller.patient;

import java.util.List;

import org.simplon.ecf.business.dto.PatientDto;
import org.simplon.ecf.business.service.patient.IPatientService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class GetAllPatientController {
    private IPatientService patientService;

    /**
     * Injects the patient service
     * 
     * @param patientService the patient service
     */
    public GetAllPatientController(IPatientService patientService) {
        this.patientService = patientService;
    }

    /**
     * Returns all patients
     * 
     * @return all patients
     */
    @GetMapping("/patients")
    public List<PatientDto> getAllPatient(){
        return patientService.getAllPatient();
    }
}
