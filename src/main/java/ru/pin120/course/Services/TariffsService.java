package ru.pin120.course.Services;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;
import ru.pin120.course.Entities.Clients;
import ru.pin120.course.Entities.Services;
import ru.pin120.course.Entities.Tariffs;
import ru.pin120.course.Repositories.ClientsRepository;
import ru.pin120.course.Repositories.TariffsRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TariffsService {
    @Autowired
    private TariffsRepository repository;

    public Tariffs save(Tariffs tarriff) {
        return  repository.save(tarriff);
    }

    public Tariffs findById(Long tariffId) {
        Optional<Tariffs> tariffById = repository.findById(tariffId);

        return tariffById.orElseThrow(() -> new EntityNotFoundException("Тариф с ID " + tariffId + " не найден"));
    }

    public List<Tariffs> getAllTariffs() {
        List<Tariffs> tariffs = new ArrayList<>();

        Streamable.of(repository.findAll())
                .forEach(tariffs::add);

        return tariffs;
    }

    public Tariffs update(Tariffs tarriff) {
        return repository.save(tarriff);
    }

    public void delete (long tariffId) {
        repository.deleteById(tariffId);
    }
}
