package ru.pin120.course.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.pin120.course.Entities.Apartaments;
import ru.pin120.course.Entities.Facilities;
import ru.pin120.course.Services.ApartamentsService;
import ru.pin120.course.Services.FacilitiesService;

import java.util.List;

@RestController
public class FacilitiesController {
    @Autowired
    private FacilitiesService service;

    @GetMapping("/facilities/get-all")
    public List<Facilities> getAllFacilties() {
        return service.getAllFacilities();
    }

    @PostMapping("/facilities/save")
    public Facilities save(@RequestBody Facilities facility) {
        return service.save(facility);
    }

    @PostMapping("/facilities/find")
    public Facilities getById(@RequestBody long id) {
        return service.findById(id);
    }

    @PostMapping("/facilities/delete")
    public void delete(@RequestBody Facilities facility) {
        service.delete(facility.getId());
    }

    @PostMapping("/facilities/edit")
    public Facilities update(@RequestBody Facilities facility) {
        return service.update(facility);
    }
}
