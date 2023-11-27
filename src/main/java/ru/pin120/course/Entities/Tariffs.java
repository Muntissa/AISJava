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
public class Tariffs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    @Column(nullable = false)
     String name;

    @Column(nullable = false)
    public String description;

    @Column(nullable = false)
    public int price;

    @JsonIgnore
    @OneToMany(mappedBy = "tariff")
    public List<Apartaments> apartaments;
}
