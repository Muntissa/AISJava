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
public class Facilities {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    @Column(nullable = false)
    String name;

    @JsonIgnore
    @ManyToMany(mappedBy = "facilities")
    List<Apartaments> apartaments;

    @PreRemove
    private void removeFacilityFromApartaments() {
        for (Apartaments apartament : apartaments) {
            apartament.getFacilities().remove(this);
        }
    }
}
