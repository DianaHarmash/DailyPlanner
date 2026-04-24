package com.dailyserver.backend.persistence.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Formula;

@Entity
@Table(name = "food")
@AllArgsConstructor
@NoArgsConstructor
@Getter
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
    @Formula("kkalPer100 * weight")
    private Integer kkal;
}
