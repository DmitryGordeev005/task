package com.rest.Lab_Rest.model;

import javax.persistence.*;
import java.sql.Timestamp;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "time")
public class Time {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idtime")
    private int idtime;

    @Column(name = "task_idtask")
    private int task_idtask;

    @Column(name = "start")
    private Timestamp interval;
    @Column(name = "end")
    private Timestamp onestarting;

    public int getIdtime() {
        return idtime;
    }

    public void setIdtime(int idtime) {
        this.idtime = idtime;
    }

    public int getTask_idtask() {
        return task_idtask;
    }

    public void setTask_idtask(int task_idtask) {
        this.task_idtask = task_idtask;
    }

    public Timestamp getInterval() {
        return interval;
    }

    public void setInterval(Timestamp interval) {
        this.interval = interval;
    }

    public Timestamp getOnestarting() {
        return onestarting;
    }

    public void setOnestarting(Timestamp onestarting) {
        this.onestarting = onestarting;
    }
}
