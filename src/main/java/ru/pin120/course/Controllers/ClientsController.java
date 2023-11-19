package ru.pin120.course.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
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
}
