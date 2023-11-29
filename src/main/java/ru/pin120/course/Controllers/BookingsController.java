package ru.pin120.course.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.pin120.course.Entities.Apartaments;
import ru.pin120.course.Entities.Bookings;
import ru.pin120.course.Services.ApartamentsService;
import ru.pin120.course.Services.BookingsService;

import java.util.List;

@RestController
public class BookingsController {
    @Autowired
    private BookingsService service;

    @GetMapping("/bookings/get-all")
    public List<Bookings> getAllBookings() {
        return service.getAllBookings();
    }

    @PostMapping("/bookings/save")
    public Bookings save(@RequestBody Bookings booking) {
        return service.save(booking);
    }

    @PostMapping("/bookings/find")
    public Bookings getById(@RequestBody long id) {
        return service.findById(id);
    }

    @DeleteMapping("/bookings/delete")
    public void delete(@RequestBody Bookings booking) {
        service.delete(booking.getId());
    }

    @PostMapping("/bookings/edit")
    public Bookings update(@RequestBody Bookings booking) {
        return service.update(booking);
    }
}
