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
    public String name;

    @Column(nullable = false)
    public String description;

    @Column(nullable = false)
    public int price;

    @JsonIgnore
    @ManyToMany(mappedBy = "services", cascade = CascadeType.ALL)
    public List<Apartaments> apartaments;

    @JsonIgnore
    @ManyToMany(mappedBy = "services", cascade = CascadeType.ALL)
    public List<Bookings> bookings;
}
