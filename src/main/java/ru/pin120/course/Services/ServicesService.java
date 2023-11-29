package ru.pin120.course.Services;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;
import ru.pin120.course.Entities.Clients;
import ru.pin120.course.Entities.Facilities;
import ru.pin120.course.Entities.Services;
import ru.pin120.course.Repositories.ClientsRepository;
import ru.pin120.course.Repositories.ServicesRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ServicesService {
    @Autowired
    private ServicesRepository repository;

    public Services save(Services service) {
        return repository.save(service);
    }

    public Services findById(Long serviceId) {
        Optional<Services> serviceById = repository.findById(serviceId);

        return serviceById.orElseThrow(() -> new EntityNotFoundException("Услуга с ID " + serviceId + " не найден"));
    }

    public List<Services> getAllServices() {
        List<Services> services = new ArrayList<>();

        Streamable.of(repository.findAll())
                .forEach(services::add);

        return services;
    }

    public Services update(Services services) {
        return repository.save(services);
    }

    public void delete (long serviceId) {
        repository.deleteById(serviceId);
    }
}
