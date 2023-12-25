package ru.pin120.course.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
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
public class Services {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    @Column(nullable = false)
    String name;

    @Column(nullable = false)
    String description;

    @Column(nullable = false)
    int price;

    @JsonIgnore
    @ManyToMany(mappedBy = "services")
    List<Apartaments> apartaments;

    @JsonIgnore
    @ManyToMany(mappedBy = "services")
    List<Bookings> bookings;

    @PreRemove
    private void removeServicesFromAll() {
        for (Apartaments apartament : apartaments) {
            apartament.getServices().remove(this);
        }
        for (Bookings booking : bookings) {
            booking.getServices().remove(this);
        }
    }
}
