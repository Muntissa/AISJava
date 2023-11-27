package ru.pin120.course.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.pin120.course.Entities.Facilities;

public interface FacilitiesRepository extends JpaRepository<Facilities, Long> {
}
