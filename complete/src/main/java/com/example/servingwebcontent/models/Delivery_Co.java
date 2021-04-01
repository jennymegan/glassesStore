package com.example.servingwebcontent.models;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity

public class Delivery_Co
{
    @Id
    @Column
    private int id;
    @Column
    private int company_reg_no;
    @Column
    private String company_reg_date;
    @Column
    private String contract_end_date;

}