package com.example.CV.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import jakarta.persistence.*;

@Data
@AllArgsConstructor
@Entity
@Table(name = "Schools")
public class School {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SchoolID")
    private Long id;

    @Column(name = "SchoolName", nullable = false)
    private String schoolName;

    @ManyToOne
    @JoinColumn(name = "AddressID")
    private Address address;
}
