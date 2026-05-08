package com.dailyserver.backend.controller;

import com.dailyserver.backend.dto.request.NoteRequestDto;
import com.dailyserver.backend.dto.response.NoteResponseDto;
import com.dailyserver.backend.service.NoteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/note")
@RequiredArgsConstructor
public class NoteController {

    private final NoteService service;

    @PostMapping("/create")
    public NoteResponseDto createNote(@RequestBody NoteRequestDto dto) {
        return service.createNote(dto);
    }
}
