package com.dailyserver.backend.controller;

import com.dailyserver.backend.service.NoteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/note")
@RequiredArgsConstructor
public class NoteController {

    private final NoteService service;

    @PostMapping("/create")
    public Object createNote() {
        return service.createNote();
    }
}
