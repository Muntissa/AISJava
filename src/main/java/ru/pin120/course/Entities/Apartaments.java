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
public class Apartaments extends BaseEntity{
    @Column(nullable = false)
    public int Number;

    @Column(nullable = false)
    public int Area;

    @Column(nullable = false)
    public String PhotoPath;

    @Column(nullable = false)
    public boolean Reservation;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "apartments_facilities",
            joinColumns = @JoinColumn(name = "apartments_id"),
            inverseJoinColumns = @JoinColumn(name = "facilities_id"))
    public List<Facilities> Facilities;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "apartments_services",
            joinColumns = @JoinColumn(name = "apartments_id"),
            inverseJoinColumns = @JoinColumn(name = "services_id"))
    public List<Services> Services;

    @ManyToOne
    @NotEmpty
    @JoinColumn(name = "tariffs_id", nullable = false)
    private Tariffs Tariff;
}
