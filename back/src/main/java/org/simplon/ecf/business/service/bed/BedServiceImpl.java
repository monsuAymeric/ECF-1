package org.simplon.ecf.business.service.bed;

import java.util.List;
import org.simplon.ecf.business.convert.BedConvert;
import org.simplon.ecf.business.dto.BedDto;
import org.simplon.ecf.persistance.repository.bed.IBedRepository;
import org.springframework.stereotype.Service;

@Service
public class BedServiceImpl implements IBedService {
    private IBedRepository bedRepository;

    public BedServiceImpl(final IBedRepository bedRepository) {
        this.bedRepository = bedRepository;
    }

    @Override
    public void createBed(final BedDto bed) {
        bedRepository.save(BedConvert.getInstance().dtoToEntity(bed));
    }

    @Override 
    public List<BedDto> getAvailableBed() {
        return BedConvert.getInstance().entityListToDtoList(bedRepository.findAll());
    }

    @Override
    public BedDto getBedById(final long id) {
        return BedConvert.getInstance().entityToDto(bedRepository.findById(id).orElse(null));
    }

    @Override 
    public void deleteBed(final long id) {
        bedRepository.deleteById(id);
    }
}

