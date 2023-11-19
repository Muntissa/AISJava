package ru.pin120.course.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.yaml.snakeyaml.events.Event;
import ru.pin120.course.Entities.Clients;

public interface ClientsRepository extends JpaRepository<Clients, Long> {
}
