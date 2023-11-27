package ru.pin120.course.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.pin120.course.Entities.Apartaments;

public interface ApartamentsRepository extends JpaRepository<Apartaments, Long> {
}
