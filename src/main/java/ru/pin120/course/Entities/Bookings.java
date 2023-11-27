package ru.pin120.course.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
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

    @Column(nullable = false)
    int price;

    @Column(nullable = false)
    boolean isActive = true;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "bookings_services",
            joinColumns = @JoinColumn(name = "bookings_id"),
            inverseJoinColumns = @JoinColumn(name = "services_id"))
    List<Services> services;
}
