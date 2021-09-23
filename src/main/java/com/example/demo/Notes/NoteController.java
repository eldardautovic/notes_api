package com.example.demo.Notes;

import org.aspectj.weaver.ast.Not;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/notes")
public class NoteController {

    private final NotesService notesService;

    public NoteController(NotesService notesService) {
        this.notesService = notesService;
    }

    @GetMapping
    public List<Notes> getNotes() {
        return notesService.getAllNotes();
    }

    @PostMapping
    public void registerNewNote(@RequestBody Notes notes){
        notesService.addNewNote(notes);
    }




}
