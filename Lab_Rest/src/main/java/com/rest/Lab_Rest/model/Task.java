package com.rest.Lab_Rest.model;

import javax.persistence.*;
import java.sql.Timestamp;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "task")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idtask")
    private int idtask;

    @Column(name = "name")
    private String name;
    @Column(name = "information")
    private String information;

    public Task(){
    }

    public Task(int idtask, String name, String information) {
        this.idtask = idtask;
        this.name = name;
        this.information = information;
    }

    public int getIdtask() {
        return idtask;
    }
    public void setIdtask(int idtask) {
        this.idtask = idtask;
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
