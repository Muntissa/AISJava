package ru.pin120.course.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.pin120.course.Entities.Services;

public interface ServicesRepository extends JpaRepository<Services, Long> {
}
