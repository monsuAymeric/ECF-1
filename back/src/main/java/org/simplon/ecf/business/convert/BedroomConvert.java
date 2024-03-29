package org.simplon.ecf.business.convert;

import java.util.ArrayList;
import java.util.List;

import org.simplon.ecf.business.dto.BedroomDto;
import org.simplon.ecf.persistance.entity.Bedroom;

public class BedroomConvert {
    private static BedroomConvert instance;
    private ServiceConvert serviceConvert = ServiceConvert.getInstance();

    /**
     * Get the singleton instance of the class.
     * 
     * @return the singleton instance of the class.
     */
    public static BedroomConvert getInstance() {
        if (instance == null) {
            instance = new BedroomConvert();
        }
        return instance;
    }

    /**
     * Convert an entity to DTO.
     * 
     * @param entity the entity to convert.
     * 
     * @return the converted DTO.
     */
    public BedroomDto entityToDto(final Bedroom entity) {
        BedroomDto dto = new BedroomDto();
        dto.setId(entity.getId());
        dto.setService(entity.getService() != null ? serviceConvert.entityToDto(entity.getService()) : null);

        return dto;
    }

    /**
     * Convert a DTO to an entity.
     * 
     * @param dto the dto to convert.
     * 
     * @return the converted entity.
     */
    public Bedroom dtoToEntity(final BedroomDto dto) {
        Bedroom entity = new Bedroom();
        entity.setId(dto.getId());
        entity.setService(dto.getService() != null ? serviceConvert.dtoToEntity(dto.getService()) : null);

        return entity;
    }

    /**
     * Convert an entity list to a dto list.
     * 
     * @param entityList the entity list to convert.
     * 
     * @return the converted DTO list.
     */
    public List<BedroomDto> entityListToDtoList(final List<Bedroom> entityList) {
        List<BedroomDto> dtoList = new ArrayList<>();
        for (Bedroom entity : entityList) {
            dtoList.add(entityToDto(entity));
        }
        return dtoList;
    }

    /**
     * Convert a DTO list to an entity list.
     * 
     * @param dtoList the dto list to convert.
     * 
     * @return the converted entity list.
     */
    public List<Bedroom> dtoListToEntityList(final List<BedroomDto> dtoList) {
        List<Bedroom> entityList = new ArrayList<>();
        for (BedroomDto dto : dtoList) {
            entityList.add(dtoToEntity(dto));
        }
        return entityList;
    }

}
