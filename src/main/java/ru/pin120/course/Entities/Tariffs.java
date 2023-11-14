package ru.pin120.course.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
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
public class Tariffs extends BaseEntity{
    @Column(nullable = false)
    public String Name;

    @Column(nullable = false)
    public String Description;

    @Column(nullable = false)
    public int Price;

    @OneToMany(mappedBy = "Tariff")
    public List<Apartaments> Apartaments;
}
