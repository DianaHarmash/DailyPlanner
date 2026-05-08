package com.dailyserver.backend.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class NoteRequestDto {

    private List<String> weather;
    private List<String> emotion;
    private List<String> hobby;
    private List<String> social;
    private List<String> health;
    private List<String> description;
    private double weight;
    private Set<FoodRequestDto> foods;
    private LocalDate noteDate;
}
