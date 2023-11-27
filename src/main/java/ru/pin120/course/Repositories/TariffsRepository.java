package ru.pin120.course.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.pin120.course.Entities.Tariffs;

public interface TariffsRepository extends JpaRepository<Tariffs, Long> {
}
