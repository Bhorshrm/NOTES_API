package com.example.notesapi.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity
@Table(name = "notes")
public class Notes {

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User username;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotEmpty
    private String id;

    @NotEmpty
    private String title;

    @NotEmpty
    private String description;

}