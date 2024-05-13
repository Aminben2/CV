package com.example.CV.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import jakarta.persistence.*;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@Entity
@Table(name = "PersonalInformation")
public class PersonalInformation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PersonalInfoID")
    private Long id;

    @Column(name = "FirstName", nullable = false)
    private String firstName;

    @Column(name = "LastName", nullable = false)
    private String lastName;

    @Column(name = "DateOfBirth", nullable = false)
    private LocalDate dateOfBirth;

    @Column(name = "Email", nullable = false, unique = true)
    private String email;

    @Column(name = "PhoneNumber", unique = true)
    private String phoneNumber;

    @Column(name = "Website")
    private String website;

    @Enumerated(EnumType.STRING)
    @Column(name = "Sex", nullable = false)
    private SexType sex;

    @ManyToOne
    @JoinColumn(name = "AddressID")
    private Address address;

    @ManyToOne
    @JoinColumn(name = "Nationality")
    private Country nationality;
}



