package ru.pin120.course.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
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



}
