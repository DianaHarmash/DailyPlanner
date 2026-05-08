package com.dailyserver.backend.persistence;

import com.dailyserver.backend.persistence.entity.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {

    @Query("SELECT n FROM Note n LEFT JOIN FETCH n.foods WHERE n.id = :id")
    Optional<Note> findByIdWithFoods(@Param("id") Long id);
}
