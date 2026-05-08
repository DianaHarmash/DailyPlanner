package com.dailyserver.backend.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class FoodResponseDto {
    private Long id;
    private String dish;
    private Integer kkalPer100;
    private Integer weight;
    private Integer kkal;
}
