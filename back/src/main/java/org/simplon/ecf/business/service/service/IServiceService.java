package org.simplon.ecf.business.service.service;

import org.simplon.ecf.business.dto.ServiceDto;

public interface IServiceService {

    /**
     * Saves a service in the database.
     * 
     * @param service the service to save.
     */
    void createService(final ServiceDto service);

    /**
     * Modifies the service.
     * 
     * @param service the service to modify.
     */
    void modifyService(final ServiceDto service);

    /**
     * Delete the service with the given id.
     * 
     * @param id the id of the product.
     */
    void deleteService(final long id);
}
