package com.emsi.jx_project.entity;

import com.emsi.jx_project.enumeration.Typecompte;
import jakarta.persistence.*;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@XmlRootElement
public class Compte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double solde;
    @Temporal(TemporalType.DATE)
    private Date date;
    @Enumerated(EnumType.ORDINAL)
    private Typecompte type;

    public Compte(Long id, double solde, Date date, Typecompte type) {
        this.id = id;
        this.solde = solde;
        this.date = date;
        this.type = type;
    }

    public Compte() {

    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setType(Typecompte type) {
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public double getSolde() {
        return solde;
    }

    public Typecompte getType() {
        return type;
    }
}
