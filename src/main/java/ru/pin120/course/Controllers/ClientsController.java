package ru.pin120.course.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.pin120.course.Entities.Clients;
import ru.pin120.course.Services.ClientsService;

import java.util.List;

@RestController
public class ClientsController {

    @Autowired
    private ClientsService service;

    @GetMapping("/clients/get-all")
    public List<Clients> getAllClients() {
        return service.getAllClients();
    }

    @PostMapping("/clients/save")
    public Clients save(@RequestBody Clients client) {
        return service.save(client);
    }

    @PostMapping("/clients/find")
    public Clients getById(@RequestBody long id) {
        return service.findById(id);
    }

    @DeleteMapping("/clients/delete")
    public void delete(@RequestBody Clients client) {
        service.delete(client.getId());
    }

    @PostMapping("/clients/edit")
    public Clients update(@RequestBody Clients client) {
        return service.update(client);
    }
}
