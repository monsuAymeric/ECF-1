package org.simplon.ecf.business.service.patient;

import java.util.List;

import org.simplon.ecf.business.convert.PatientConvert;
import org.simplon.ecf.business.dto.PatientDto;
import org.simplon.ecf.business.dto.ServiceDto;
import org.simplon.ecf.persistance.repository.patient.IPatientRepository;

public class PatientServiceImpl implements IPatientService {
    private IPatientRepository patientRepository;

    public PatientServiceImpl(final IPatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    @Override
    public void createPatient(final PatientDto patient) {
        patientRepository.save(PatientConvert.getInstance().dtoToEntity(patient));
    }

    @Override
    public List<PatientDto> getAllPatientByService(final ServiceDto service) {
        return PatientConvert.getInstance().entityListToDtoList(patientRepository.findAll());
    }

    @Override
    public List<PatientDto> getAllPatient() {
        return PatientConvert.getInstance().entityListToDtoList(patientRepository.findAll());
    }

    @Override
    public void modifyPatient(final PatientDto patient) {
        patientRepository.save(PatientConvert.getInstance().dtoToEntity(patient));
    }

    @Override
    public void deletePatient(final long id) {
        patientRepository.deleteById(id);
    }

    
}
