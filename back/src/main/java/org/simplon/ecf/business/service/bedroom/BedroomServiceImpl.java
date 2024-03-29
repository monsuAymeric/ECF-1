package org.simplon.ecf.business.service.bedroom;

import java.util.List;

import org.simplon.ecf.business.convert.BedroomConvert;
import org.simplon.ecf.business.dto.BedroomDto;
import org.simplon.ecf.persistance.repository.bedroom.IBedroomRepository;
import org.springframework.stereotype.Service;

@Service
public class BedroomServiceImpl implements IBedroomService{
    private IBedroomRepository bedroomRepository;

    public BedroomServiceImpl(final IBedroomRepository bedroomRepository) {
        this.bedroomRepository = bedroomRepository;
    }

    @Override
    public void createBedroom(BedroomDto bedroom) {
        bedroomRepository.save(BedroomConvert.getInstance().dtoToEntity(bedroom));
    }

    @Override
    public List<BedroomDto> getAllBedroom() {
        return BedroomConvert.getInstance().entityListToDtoList(bedroomRepository.findAll());
    }

    @Override
    public BedroomDto getBedroomById(long id) {
        return BedroomConvert.getInstance().entityToDto(bedroomRepository.findById(id).orElse(null));
    }

    @Override
    public void deleteBedroom(long id) {
        bedroomRepository.deleteById(id);
    }

}
