package ru.pin120.course.Services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;
import ru.pin120.course.Entities.Clients;
import ru.pin120.course.Entities.Facilities;
import ru.pin120.course.Repositories.ClientsRepository;
import ru.pin120.course.Repositories.FacilitiesRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class FacilitiesService {
    @Autowired
    private FacilitiesRepository repository;

    public Facilities save(Facilities facility) {
        return  repository.save(facility);
    }

    public List<Facilities> getAllFacilities() {
        List<Facilities> facilities = new ArrayList<>();

        Streamable.of(repository.findAll())
                .forEach(facilities::add);

        return facilities;
    }

    public Facilities update(Facilities facility) {
        return repository.save(facility);
    }

    public void delete (long facilityId) {
        repository.deleteById(facilityId);
    }
}
