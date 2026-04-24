package com.dailyserver.backend.persistence.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "note")
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Note {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ElementCollection
    @CollectionTable(name = "note_weather", joinColumns = @JoinColumn(name = "note_id"))
    @Column(name = "weather")
    private List<String> weather;

    @ElementCollection
    @CollectionTable(name = "note_emotion", joinColumns = @JoinColumn(name = "note_id"))
    @Column(name = "emotion")
    private List<String> emotion;

    @ElementCollection
    @CollectionTable(name = "note_hobby", joinColumns = @JoinColumn(name = "note_id"))
    @Column(name = "hobby")
    private List<String> hobby;

    @ElementCollection
    @CollectionTable(name = "note_social", joinColumns = @JoinColumn(name = "note_id"))
    @Column(name = "social")
    private List<String> social;

    @ElementCollection
    @CollectionTable(name = "note_health", joinColumns = @JoinColumn(name = "note_id"))
    @Column(name = "health")
    private List<String> health;

    @ElementCollection
    @CollectionTable(name = "note_description", joinColumns = @JoinColumn(name = "note_id"))
    @Column(name = "description")
    private List<String> description;

    @Column(name = "weight", nullable = false)
    private Double weight;

    @ManyToMany
    @JoinTable(
            name = "note_food",
            joinColumns = @JoinColumn(name = "note_id"),
            inverseJoinColumns = @JoinColumn(name = "food_id")
    )
    private Set<Food> foods;

    @Column(name = "note_date", nullable = false)
    private LocalDate noteDate;

    @CreationTimestamp
    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;

}