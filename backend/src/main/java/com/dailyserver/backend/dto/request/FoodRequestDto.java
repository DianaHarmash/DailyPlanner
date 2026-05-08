package com.dailyserver.backend.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class FoodRequestDto {
    private String dish;
    private Integer kkalPer100;
    private Integer weight;
}
