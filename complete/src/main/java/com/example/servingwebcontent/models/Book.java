package com.example.servingwebcontent.models;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity(name = "book")
@Table

public class Book
{
    @Id
    @Column
    private int id;
    @Column
    private String name;
    @Column
    private String author;
    @Column
    private String publisher;
    @Column
    private double price;
    @Column
    private int genre;

}
