package com.dailyserver.backend.controller;

import com.dailyserver.backend.dto.NoteRequestDto;
import com.dailyserver.backend.dto.NoteResponseDto;
import com.dailyserver.backend.service.NoteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/note")
@RequiredArgsConstructor
public class NoteController {

    private final NoteService service;

    @PostMapping("/create")
    public NoteResponseDto createNote(@RequestBody NoteRequestDto dto) {
        return service.createNote(dto);
    }
}
