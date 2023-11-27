package ru.pin120.course.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;
import ru.pin120.course.Entities.Clients;
import ru.pin120.course.Entities.Tariffs;
import ru.pin120.course.Repositories.ClientsRepository;
import ru.pin120.course.Repositories.TariffsRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class TariffsService {
    @Autowired
    private TariffsRepository repository;

    public Tariffs save(Tariffs tarriff) {
        return  repository.save(tarriff);
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
