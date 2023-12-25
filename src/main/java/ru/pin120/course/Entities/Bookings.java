package ru.pin120.course.Entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Bookings {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    @Column(nullable = false)
    LocalDate startTime;

    @Column(nullable = false)
    LocalDate endTime;

    @Column(columnDefinition = "int default 0")
    int price;

    @Column(nullable = false)
    boolean isActive = true;

    @ManyToOne
    @JoinColumn(name = "clients_id", nullable = false)
    Clients client;

    @ManyToOne
    @JoinColumn(name = "apartaments_id")
    private Apartaments apartament;

    @ManyToMany
    @JoinTable(name = "bookings_services",
            joinColumns = @JoinColumn(name = "bookings_id"),
            inverseJoinColumns = @JoinColumn(name = "services_id"))
    List<Services> services;

    @PreRemove
    private void backReservation() {
        apartament.setReservation(false);
    }
}
