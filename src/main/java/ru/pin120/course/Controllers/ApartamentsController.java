package ru.pin120.course.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.pin120.course.Entities.Apartaments;
import ru.pin120.course.Services.ApartamentsService;

import java.util.List;

@RestController
public class ApartamentsController {
    @Autowired
    private ApartamentsService service;

    @GetMapping("/apartaments/get-all")
    public List<Apartaments> getAllApartaments() {
        return service.getAllApartaments();
    }
}
