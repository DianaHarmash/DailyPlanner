package com.dailyserver.backend.dto.mapper;

import com.dailyserver.backend.dto.request.FoodRequestDto;
import com.dailyserver.backend.dto.request.NoteRequestDto;
import com.dailyserver.backend.dto.response.FoodResponseDto;
import com.dailyserver.backend.dto.response.NoteResponseDto;
import com.dailyserver.backend.persistence.entity.Food;
import com.dailyserver.backend.persistence.entity.Note;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface NoteMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "createdAt", ignore = true)
    @Mapping(target = "noteDate", expression = "java(dto.getNoteDate() != null ? dto.getNoteDate() : java.time.LocalDate.now())")
    Note requestToEntity(NoteRequestDto dto);

    NoteResponseDto responseToDto(Note note);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "kkal", expression = "java(dto.getKkalPer100() != null && dto.getWeight() != null ? dto.getKkalPer100() * dto.getWeight() / 100 : null)")
    Food foodToEntity(FoodRequestDto dto);

    FoodResponseDto foodToDto(Food food);
}
