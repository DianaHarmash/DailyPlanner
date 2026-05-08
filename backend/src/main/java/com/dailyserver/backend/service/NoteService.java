package com.dailyserver.backend.service;

import com.dailyserver.backend.dto.request.NoteRequestDto;
import com.dailyserver.backend.dto.response.NoteResponseDto;
import com.dailyserver.backend.dto.mapper.NoteMapper;
import com.dailyserver.backend.persistence.NoteRepository;
import com.dailyserver.backend.persistence.entity.Note;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class NoteService {

    private final NoteRepository repository;
    private final NoteMapper mapper;

    @Transactional
    public NoteResponseDto createNote(NoteRequestDto dto) {
        Note note = mapper.requestToEntity(dto);
        Note savedNote = repository.saveAndFlush(note);
        return mapper.responseToDto(repository.findByIdWithFoods(savedNote.getId()).orElseThrow());
    }
}
