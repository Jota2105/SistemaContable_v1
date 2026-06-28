package com.sistema.cxc.modelo;


import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "LOG_JDAH")
public class Log_JDAH implements Serializable {

    @Id
    @Column(name = "ID_LOG_JDAH")
    private Integer idLogJDAH;

    @Column(name = "ACTIVIDAD_JDAH")
    private String actividadJDAH;

    @Column(name = "FECHA_JDAH")
    private LocalDate fechaJDAH;

    @Column(name = "HORA_JDAH")
    private LocalTime horaJDAH;

    public Log_JDAH(){

    }

    public Integer getIdLogJDAH() {
        return idLogJDAH;
    }

    public void setIdLogJDAH(Integer idLogJDAH) {
        this.idLogJDAH = idLogJDAH;
    }

    public String getActividadJDAH() {
        return actividadJDAH;
    }

    public void setActividadJDAH(String actividadJDAH) {
        this.actividadJDAH = actividadJDAH;
    }

    public LocalDate getFechaJDAH() {
        return fechaJDAH;
    }

    public void setFechaJDAH(LocalDate fechaJDAH) {
        this.fechaJDAH = fechaJDAH;
    }

    public LocalTime getHoraJDAH() {
        return horaJDAH;
    }

    public void setHoraJDAH(LocalTime horaJDAH) {
        this.horaJDAH = horaJDAH;
    }
}
