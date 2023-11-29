package ru.pin120.course.Services;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;
import ru.pin120.course.Entities.Apartaments;
import ru.pin120.course.Entities.Bookings;
import ru.pin120.course.Repositories.ApartamentsRepository;
import ru.pin120.course.Repositories.BookingsRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BookingsService {
    @Autowired
    private BookingsRepository repository;

    public Bookings save(Bookings booking) {
        return  repository.save(booking);
    }

    public Bookings findById(Long bookingId) {
        Optional<Bookings> bookingById = repository.findById(bookingId);

        return bookingById.orElseThrow(() -> new EntityNotFoundException("Заказ с ID " + bookingId + " не найден"));
    }

    public List<Bookings> getAllBookings() {
        List<Bookings> bookings = new ArrayList<>();

        Streamable.of(repository.findAll())
                .forEach(bookings::add);

        return bookings;
    }

    public Bookings update(Bookings booking) {
        return repository.save(booking);
    }

    public void delete (long bookingId) {
        repository.deleteById(bookingId);
    }
}
