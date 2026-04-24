package com.dailyserver.backend.dto;

import com.dailyserver.backend.persistence.entity.Food;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@AllArgsConstructor
@Getter
public class NoteRequestDto {

    private final List<String> weather;
    private final List<String> emotion;
    private final List<String> hobby;
    private final List<String> social;
    private final List<String> health;
    private final List<String> description;
    private final double weight;
    private final Set<Food> foods;
    private final LocalDate noteDate;
}
