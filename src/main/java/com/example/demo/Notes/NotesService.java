package com.example.demo.Notes;

import org.aspectj.weaver.ast.Not;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotesService {

    private final NotesRepository notesRepository;


    public NotesService(NotesRepository notesRepository) {
        this.notesRepository = notesRepository;
    }

    public List<Notes> getAllNotes() {
        return notesRepository.findAll();
    }

    public void addNewNote(Notes note) {
        notesRepository.save(note);
    }

}
