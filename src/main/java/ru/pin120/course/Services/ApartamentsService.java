package ru.pin120.course.Services;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;
import ru.pin120.course.Entities.Apartaments;
import ru.pin120.course.Repositories.ApartamentsRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ApartamentsService {
    @Autowired
    private ApartamentsRepository repository;

    public Apartaments save(Apartaments apartament) {
        return  repository.save(apartament);
    }

    public Apartaments findById(Long apartamentId) {
        Optional<Apartaments> apartamentById = repository.findById(apartamentId);

        return apartamentById.orElseThrow(() -> new EntityNotFoundException("Апартаменты с ID " + apartamentId + " не найден"));
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
