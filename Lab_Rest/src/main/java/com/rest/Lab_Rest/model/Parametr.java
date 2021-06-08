package com.rest.Lab_Rest.model;

import javax.persistence.*;
import java.sql.Timestamp;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "parametr")
public class Parametr {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idparametr")
    private int idparametr;

    @Column(name = "name")
    private String name;
    @Column(name = "information")
    private String information;

    public Parametr(){
    }

    public Parametr(int idparametr, String name, String information) {
        this.idparametr = idparametr;
        this.name = name;
        this.information = information;
    }

    public int getIdparametr() {
        return idparametr;
    }
    public void setIdparametr(int idparametr) {
        this.idparametr = idparametr;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getInformation() {
        return information;
    }
    public void setInformation(String information) {
        this.information = information;
    }
}
