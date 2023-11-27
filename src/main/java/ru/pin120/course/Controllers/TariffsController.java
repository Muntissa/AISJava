package ru.pin120.course.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
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
}
