package ru.pin120.course.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Clients extends BaseEntity{
    @Column(nullable = false)
    public String SecondName;

    @Column(nullable = false)
    public String FirstName;

    @Column(nullable = false)
    public String LastName;

    @Column(nullable = false)
    public String Email;

    @Column(nullable = false)
    public String Phone;
}
