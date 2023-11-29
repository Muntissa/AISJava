package ru.pin120.course.Services;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;
import ru.pin120.course.Entities.Clients;
import ru.pin120.course.Repositories.ClientsRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ClientsService {

    @Autowired
    private ClientsRepository repository;

    public Clients save(Clients client) {
        return  repository.save(client);
    }

    public Clients findById(Long clientId) {
        Optional<Clients> clientById = repository.findById(clientId);

        return clientById.orElseThrow(() -> new EntityNotFoundException("Клиент с ID " + clientId + " не найден"));
    }

    public List<Clients> getAllClients() {
        List<Clients> clients = new ArrayList<>();

        Streamable.of(repository.findAll())
                .forEach(clients::add);

        return clients;
    }

    public Clients update(Clients client) {
        return repository.save(client);
    }

    public void delete (long clientId) {
        repository.deleteById(clientId);
    }
}
