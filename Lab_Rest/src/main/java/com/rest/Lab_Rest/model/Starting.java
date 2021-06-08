package com.rest.Lab_Rest.model;

import javax.persistence.*;
import java.sql.Timestamp;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "starting")
public class Starting {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idstarting")
    private int idstarting;

    @Column(name = "task_idtask")
    private int task_idtask;

    @Column(name = "month")
    private String month;
    @Column(name = "dayofweek")
    private String dayofweek;
    @Column(name = "time")
    private Timestamp time;
    @Column(name = "interval")
    private Timestamp interval;
    @Column(name = "onestarting")
    private Timestamp onestarting;

    public int getIdstarting() {
        return idstarting;
    }

    public void setIdstarting(int idstarting) {
        this.idstarting = idstarting;
    }

    public int getTask_idtask() {
        return task_idtask;
    }

    public void setTask_idtask(int task_idtask) {
        this.task_idtask = task_idtask;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getDayofweek() {
        return dayofweek;
    }

    public void setDayofweek(String dayofweek) {
        this.dayofweek = dayofweek;
    }

    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
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
