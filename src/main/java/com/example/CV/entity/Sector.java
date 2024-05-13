package com.example.CV.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import jakarta.persistence.*;

@Data
@AllArgsConstructor
@Entity
@Table(name = "Sectors")
public class Sector {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SectorID")
    private Long id;

    @Column(name = "SectorName", nullable = false)
    private String sectorName;
}
