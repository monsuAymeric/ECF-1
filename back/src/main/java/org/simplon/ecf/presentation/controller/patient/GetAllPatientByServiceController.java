package org.simplon.ecf.presentation.controller.patient;

import java.util.List;

import org.simplon.ecf.business.dto.PatientDto;
import org.simplon.ecf.business.service.patient.IPatientService;
import org.simplon.ecf.persistance.entity.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class GetAllPatientByServiceController {
    private IPatientService patientService;

    /**
     * Injects the patient service
     * 
     * @param patientService the patient service
     */
    public GetAllPatientByServiceController(IPatientService patientService) {
        this.patientService = patientService;
    }

    @GetMapping("/patients/{service}")
    public List<PatientDto> getAllPatientByService(final @PathVariable Service service){
        //TODO Create the rest of the method to get all the patient with the given service.
    }
}