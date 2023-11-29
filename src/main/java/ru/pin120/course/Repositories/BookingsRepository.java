package ru.pin120.course.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.pin120.course.Entities.Bookings;

public interface BookingsRepository extends JpaRepository<Bookings, Long> {
}
