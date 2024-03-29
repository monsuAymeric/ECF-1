package org.simplon.ecf.business.convert;

import java.util.ArrayList;
import java.util.List;

import org.simplon.ecf.business.dto.BedDto;
import org.simplon.ecf.persistance.entity.Bed;

public class BedConvert {
    private static BedConvert instance;
    private BedroomConvert bedroomConvert = BedroomConvert.getInstance();


    /**
     * Get the singleton instance of the class.
     * 
     * @return the singleton instance of the class.
     */
    public static BedConvert getInstance() {
        if (instance == null) {
            instance = new BedConvert();
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
    public BedDto entityToDto(final Bed entity) {
        BedDto dto = new BedDto();
        dto.setId(entity.getId());
        dto.setBedroomDto(entity.getBedroom() != null ? bedroomConvert.entityToDto(entity.getBedroom()) : null);
        
        return dto;
    }

    /**
     * Convert a DTO to an entity.
     * 
     * @param dto the dto to convert.
     * 
     * @return the converted entity.
     */
    public Bed dtoToEntity(final BedDto dto) {
        Bed entity = new Bed();
        entity.setId(dto.getId());
        entity.setBedroom(dto.getBedroomDto() != null ? bedroomConvert.dtoToEntity(dto.getBedroomDto()) : null);

        return entity;
    }

    /**
     * Convert an entity list to a dto list.
     * 
     * @param entityList the entity list to convert.
     * 
     * @return the converted DTO list.
     */
    public List<BedDto> entityListToDtoList(final List<Bed> entityList) {
        List<BedDto> dtoList = new ArrayList<>();
        for (Bed entity : entityList) {
            dtoList.add(entityToDto(entity));
        }
        return dtoList;
    }

    /**
     * Convert a dto list to an entity list.
     * 
     * @param dtoList the dto list to convert.
     * 
     * @return the converted entity list.
     */
    public List<Bed> dtoListToEntityList(final List<BedDto> dtoList) {
        List<Bed> entityList = new ArrayList<>();
        for (BedDto dto : dtoList) {
            entityList.add(dtoToEntity(dto));
        }
        return entityList;
    }
}
