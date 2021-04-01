package com.example.servingwebcontent.models;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity

public class Customer
{
    @Id
    @Column
    private int id;
    @Column
    private String phone_no;
    @Column
    private String name;
    @Column
    private String address;

}