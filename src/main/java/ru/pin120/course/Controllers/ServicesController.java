package ru.pin120.course.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.pin120.course.Entities.Facilities;
import ru.pin120.course.Entities.Services;
import ru.pin120.course.Services.FacilitiesService;
import ru.pin120.course.Services.ServicesService;

import java.util.List;

@RestController
public class ServicesController {
    @Autowired
    private ServicesService service;

    @GetMapping("/services/get-all")
    public List<Services> getAllServices() {
        return service.getAllServices();
    }

    @PostMapping("/services/save")
    public Services save(@RequestBody Services services) {
        return service.save(services);
    }

    @PostMapping("/services/find")
    public Services getById(@RequestBody long id) {
        return service.findById(id);
    }

    @DeleteMapping("/services/delete")
    public void delete(@RequestBody Services services) {
        service.delete(services.getId());
    }

    @PostMapping("/services/edit")
    public Services update(@RequestBody Services services) {
        return service.update(services);
    }
}
