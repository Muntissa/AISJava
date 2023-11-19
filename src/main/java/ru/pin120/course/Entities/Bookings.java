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
public class Bookings extends BaseEntity{
    @Column(nullable = false)
    public LocalDate StartTime;

    @Column(nullable = false)
    public LocalDate EndTime;

    @Column(nullable = false)
    public int Price;

    @Column(nullable = false)
    public boolean IsActive = true;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "bookings_services",
            joinColumns = @JoinColumn(name = "bookings_id"),
            inverseJoinColumns = @JoinColumn(name = "services_id"))
    public List<Services> Services;
}
