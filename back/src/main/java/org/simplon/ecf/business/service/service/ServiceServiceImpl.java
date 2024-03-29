package org.simplon.ecf.business.service.service;

import org.simplon.ecf.business.convert.ServiceConvert;
import org.simplon.ecf.business.dto.ServiceDto;
import org.simplon.ecf.persistance.repository.service.IServiceRepository;
import org.springframework.stereotype.Service;

@Service
public class ServiceServiceImpl implements IServiceService {
    private IServiceRepository serviceRepository;

    public ServiceServiceImpl(final IServiceRepository serviceRepository) {
        this.serviceRepository = serviceRepository;
    }

    @Override
    public void createService(ServiceDto service) {
        serviceRepository.save(ServiceConvert.getInstance().dtoToEntity(service));
    }

    @Override
    public void modifyService(ServiceDto service) {
        serviceRepository.save(ServiceConvert.getInstance().dtoToEntity(service));
    }

    @Override
    public void deleteService(long id) {
        serviceRepository.deleteById(id);
    }
}
