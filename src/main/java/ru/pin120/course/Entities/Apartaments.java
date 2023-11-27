package ru.pin120.course.Entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Apartaments{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    @Column(nullable = false)
    int number;

    @Column(nullable = false)
    int area;

    @Column(nullable = false)
    String photoPath;

    @Column(nullable = false)
    boolean reservation;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "apartaments_facilities",
            joinColumns = @JoinColumn(name = "apartaments_id"),
            inverseJoinColumns = @JoinColumn(name = "facilities_id"))
    List<Facilities> facilities;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "apartaments_services",
            joinColumns = @JoinColumn(name = "apartaments_id"),
            inverseJoinColumns = @JoinColumn(name = "services_id"))
    List<Services> services;

    @ManyToOne
    @NotEmpty
    @JoinColumn(name = "tariffs_id", nullable = false)
    Tariffs tariff;
}
