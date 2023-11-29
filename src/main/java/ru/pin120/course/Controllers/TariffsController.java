package ru.pin120.course.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.pin120.course.Entities.Clients;
import ru.pin120.course.Entities.Tariffs;
import ru.pin120.course.Services.ClientsService;
import ru.pin120.course.Services.TariffsService;

import java.util.List;

@RestController
public class TariffsController {
    @Autowired
    private TariffsService service;

    @GetMapping("/tariffs/get-all")
    public List<Tariffs> getAllTariffs() {
        return service.getAllTariffs();
    }

    @PostMapping("/tariffs/save")
    public Tariffs save(@RequestBody Tariffs tariff) {
        return service.save(tariff);
    }

    @PostMapping("/tariffs/find")
    public Tariffs getById(@RequestBody long id) {
        return service.findById(id);
    }

    @DeleteMapping("/tariffs/delete")
    public void delete(@RequestBody Tariffs tariff) {
        service.delete(tariff.getId());
    }

    @PostMapping("/tariffs/edit")
    public Tariffs update(@RequestBody Tariffs tariff) {
        return service.update(tariff);
    }
}
