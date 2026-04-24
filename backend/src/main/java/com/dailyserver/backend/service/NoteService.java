package com.dailyserver.backend.service;

import com.dailyserver.backend.persistence.NoteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class NoteService {

    private final NoteRepository repository;

    public Object createNote() {

    }
}
