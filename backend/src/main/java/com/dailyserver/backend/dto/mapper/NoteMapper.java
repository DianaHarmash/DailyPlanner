package com.dailyserver.backend.dto.mapper;

import com.dailyserver.backend.dto.NoteRequestDto;
import com.dailyserver.backend.dto.NoteResponseDto;
import com.dailyserver.backend.persistence.entity.Note;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface NoteMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "createdAt", ignore = true)
    Note requestToEntity(NoteRequestDto dto);

    NoteResponseDto responseToDto(Note dto);
}
