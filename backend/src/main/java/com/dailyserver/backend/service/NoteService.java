package com.dailyserver.backend.service;

import com.dailyserver.backend.dto.NoteRequestDto;
import com.dailyserver.backend.dto.NoteResponseDto;
import com.dailyserver.backend.dto.mapper.NoteMapper;
import com.dailyserver.backend.persistence.NoteRepository;
import com.dailyserver.backend.persistence.entity.Note;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class NoteService {

    private final NoteRepository repository;
    private final NoteMapper mapper;

    public NoteResponseDto createNote(NoteRequestDto dto) {
        Note note = mapper.requestToEntity(dto);
        Note savedNote = repository.saveAndFlush(note);
        return mapper.responseToDto(savedNote);
    }
}
