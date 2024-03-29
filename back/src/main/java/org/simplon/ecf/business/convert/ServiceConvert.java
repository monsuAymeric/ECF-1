package org.simplon.ecf.business.convert;

import java.util.List;
import java.util.ArrayList;

import org.simplon.ecf.business.dto.ServiceDto;
import org.simplon.ecf.persistance.entity.Service;

public class ServiceConvert {
    private static ServiceConvert instance;
    
    /**
     * Get the singleton instance of the class.
     * 
     * @return the singleton instance of the class.
     */
    public static ServiceConvert getInstance() {
        if (instance == null) {
            instance = new ServiceConvert();
        }
        return instance;
    }

    /**
     * Convert an entity to a DTO.
     * 
     * @param entity the entity to convert.
     * 
     * @return the converted DTO.
     */
    public ServiceDto entityToDto(final Service entity) {
        ServiceDto dto = new ServiceDto();
        dto.setId(entity.getId());
        dto.setName(entity.getName());

        return dto;
    }
    /**
     * Convert a DTO to an entity.
     * 
     * @param dto the dto to convert.
     * 
     * @return the converted entity.
     */
    public Service dtoToEntity(final ServiceDto dto) {
        Service entity = new Service();
        entity.setId(dto.getId());
        entity.setName(dto.getName());

        return entity;
    }

    /**
     * Convert an entity list to a dto list.
     * 
     * @param entityList the entity list to convert.
     * 
     * @return the converted DTO list.
     */
    public List<ServiceDto> entityListToDtoList(final List<Service> entityList) {
        List<ServiceDto> dtoList = new ArrayList<>();
        for (Service entity : entityList) {
            dtoList.add(entityToDto(entity));
        }
        return dtoList;
    }

    /**
     * Convert a DTO list to an entity  list.
     * 
     * @param dtoList the dto list to convert.
     * 
     * @return the converted entity list.
     */
    public List<Service> dtoListToEntityList(final List<ServiceDto> dtoList) {
        List<Service> entityList = new ArrayList<>();
        for (ServiceDto dto : dtoList) {
            entityList.add(dtoToEntity(dto));
        }
        return entityList;
    }
}
