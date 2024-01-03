package com.example.notesapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.notesapi.Service.*;
import com.example.notesapi.Model.*;

@RestController
public class NotesController {
    @Autowired
    UserService userservice;

    @GetMapping(value = "/api/notes")
    public Notes allNotes() {
        return userservice.findNotes(id);
    }

    @GetMapping(value = "/api/notes/{id}")
    public Notes notesbyId(@PathVariable String id) {
        return userservice.findNotes(id);
    }

    @PostMapping(value = "/api/notes")
    public Notes createNote(@PathVariable String id) {
        return userservice.findNotes(id);
    }

    @PutMapping(value = "/api/notes/{id}")
    public Notes updateNote(@PathVariable String id) {
        return userservice.findNotes(id);
    }

    @PostMapping(value = "/api/notes/{id}/share") // POST /api/notes/:id/share
    public Notes shareNote(@PathVariable String id) {
        return userservice.findNotes(id);
    }

    @GetMapping(value = "/api/search/{query}") // GET /api/search?q=:query
    public Notes search(@PathVariable String id, @RequestParam(name = "q", defaultValue = "default") String param1) {
        return userservice.findNotes(id);
    }
}
