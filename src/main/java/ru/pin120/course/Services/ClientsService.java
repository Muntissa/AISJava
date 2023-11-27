package ru.pin120.course.Services;

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

    public Optional<Clients> findById(Long clientId) {
        return repository.findById(clientId);
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
