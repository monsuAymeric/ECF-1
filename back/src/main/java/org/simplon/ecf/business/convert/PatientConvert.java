package org.simplon.ecf.business.convert;

import java.util.ArrayList;
import java.util.List;

import org.simplon.ecf.business.dto.PatientDto;
import org.simplon.ecf.persistance.entity.Patient;

public class PatientConvert {
    private static PatientConvert instance;
    private ServiceConvert serviceConvert = ServiceConvert.getInstance();
    private BedConvert bedConvert = BedConvert.getInstance();

    public static PatientConvert getInstance() {
        if (instance == null) {
            instance = new PatientConvert();
        }
        return instance;
    }

    /**
     * Convert an entity to DTO.
     * 
     * @param entity the entity to convert.
     * 
     * @return the covnerted DTO.
     */
    public PatientDto entityToDto(final Patient entity) {
        PatientDto dto = new PatientDto();
        dto.setId(entity.getId());
        dto.setService(entity.getService() != null ? serviceConvert.entityToDto(entity.getService()) : null);
        dto.setBed(entity.getBed() != null ? bedConvert.entityToDto(entity.getBed()) : null);
        dto.setFirstname(entity.getFirstname());
        dto.setLastname(entity.getLastname());
        dto.setGender(entity.getGender());
        dto.setBirthday(entity.getBirthday());
        dto.setSecurity_number(entity.getSecurity_number());

        return dto;
    }

    /**
     * Convert a DTO to an entity.
     * 
     * @param dto the dto to convert.
     * 
     * @return the converted entity.
     */
    public Patient dtoToEntity(final PatientDto dto) {
        Patient entity = new Patient();
        entity.setId(dto.getId());
        entity.setService(dto.getService() != null ? serviceConvert.dtoToEntity(dto.getService()) : null);
        entity.setBed(dto.getBed() != null ? bedConvert.dtoToEntity(dto.getBed()) : null);
        entity.setFirstname(dto.getFirstname());
        entity.setLastname(dto.getLastname());
        entity.setGender(dto.getGender());
        entity.setBirthday(dto.getBirthday());
        entity.setSecurity_number(dto.getSecurity_number());

        return entity;
    }

    /**
     * Convert an entity list to a dto list.
     * 
     * @param entityList the entity list to convert.
     * 
     * @return the converted DTO list
     */
    public List<PatientDto> entityListToDtoList(final List<Patient> entityList) {
        List<PatientDto> dtoList  = new ArrayList<>();
        for (Patient entity : entityList) {
            dtoList.add(entityToDto(entity));
        }
        return dtoList;
    }

    /**
     * Convert a Dto List to an entity list.
     * 
     * @param dtoList the dto list to conveert.
     * 
     * @return the converted entity list.
     */
    public List<Patient> dtoListToEntityList(final List<PatientDto> dtoList) {
        List<Patient> entityList = new ArrayList<>();
        for (PatientDto dto : dtoList) {
            entityList.add(dtoToEntity(dto));
        }
        return entityList;
    }
}
