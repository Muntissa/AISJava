package ru.pin120.course.Entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
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
public class Facilities extends BaseEntity{
    @Column(nullable = false)
    public String Name;

    @ManyToMany(mappedBy = "Facilities", cascade = CascadeType.ALL)
    public List<Apartaments> Apartaments;
}
