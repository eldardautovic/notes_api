package com.example.demo.Notes;

import javax.persistence.*;

@Entity
@Table
public class Notes {

    @Id
    @SequenceGenerator(
            name = "notes_sequence",
            sequenceName = "notes_sequence",
            allocationSize = 1
    )

    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "notes_sequence"
    )

    private Long id;
    private String date;
    private String content;

    public Notes() {
    }

    public Notes(Long id, String date, String content) {
        this.id = id;
        this.date = date;
        this.content = content;
    }

    public Notes(String date, String content) {
        this.date = date;
        this.content = content;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
