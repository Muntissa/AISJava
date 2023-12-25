package ru.pin120.course.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.pin120.course.Entities.Apartaments;
import ru.pin120.course.Entities.Clients;
import ru.pin120.course.Services.ApartamentsService;
import ru.pin120.course.Services.ClientsService;

import java.util.List;


@RestController
public class ApartamentsController {
    @Autowired
    private ApartamentsService service;

    @GetMapping("/apartaments/get-all")
    public List<Apartaments> getAllApartaments() {
        return service.getAllApartaments();
    }

    @PostMapping("/apartaments/save")
    public Apartaments save(@RequestBody Apartaments apartament) {
        return service.save(apartament);
    }

    @PostMapping("/apartaments/find")
    public Apartaments getById(@RequestBody long id) {
        return service.findById(id);
    }

    @PostMapping("/apartaments/delete")
    public void delete(@RequestBody Apartaments apartament) {
        service.delete(apartament.getId());
    }

    @PostMapping("/apartaments/edit")
    public Apartaments update(@RequestBody Apartaments apartament) {
        return service.update(apartament);
    }
}
