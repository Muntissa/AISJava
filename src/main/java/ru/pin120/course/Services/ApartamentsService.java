package ru.pin120.course.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;
import ru.pin120.course.Entities.Apartaments;
import ru.pin120.course.Entities.Clients;
import ru.pin120.course.Repositories.ApartamentsRepository;
import ru.pin120.course.Repositories.ClientsRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class ApartamentsService {
    @Autowired
    private ApartamentsRepository repository;

    public Apartaments save(Apartaments apartament) {
        return  repository.save(apartament);
    }

    public List<Apartaments> getAllApartaments() {
        List<Apartaments> apartaments = new ArrayList<>();

        Streamable.of(repository.findAll())
                .forEach(apartaments::add);

        return apartaments;
    }

    public Apartaments update(Apartaments apartament) {
        return repository.save(apartament);
    }

    public void delete (long apartamentId) {
        repository.deleteById(apartamentId);
    }
}
