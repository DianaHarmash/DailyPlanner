package com.dailyserver.backend.persistence.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "food")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Food {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "dish")
    private String dish;

    @Column(name = "kkal_per_100")
    private Integer kkalPer100;

    @Column(name = "weight")
    private Integer weight;

    @Column(name = "kkal")
    private Integer kkal;
}
