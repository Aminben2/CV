package com.example.CV.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
@Table(name = "Enterprises")
public class Enterprise {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EnterpriseID")
    private Long id;

    @Column(name = "EnterpriseName", nullable = false)
    private String enterpriseName;

    @Column(name = "PhoneNumber")
    private String phoneNumber;

    @Column(name = "Email")
    private String email;

    @ManyToOne
    @JoinColumn(name = "AddressID")
    private Address address;
}
