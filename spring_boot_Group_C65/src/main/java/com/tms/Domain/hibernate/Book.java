package com.tms.Domain.hibernate;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Collection;

@Entity(name = "books")
@Data
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "book_seq")
    @SequenceGenerator(name = "book_seq", sequenceName = "books_id_seq", allocationSize = 1)
    private long id;

    @Column(name = "book_name")
    private String bookName;

    @OneToMany(mappedBy = "book",fetch = FetchType.EAGER)
    private Collection<Page> pages;

    @ManyToMany(mappedBy = "books",fetch = FetchType.EAGER)
    private Collection<Author> authors;
}
