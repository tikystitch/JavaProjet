/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import java.sql.Date;

/**
 *
 * @author louis
 */
public class Trimestre {
    private int id=0;
    private String nom="";
    private Date dateDebut;
    private Date dateFin;
    private int id_bulletin=0;

    public Trimestre() {
    }
    
    public Trimestre(int id, String nom, Date debut, Date fin) {
        this.id=id;
        this.nom=nom;
        this.dateDebut=debut;
        this.dateFin=fin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public int getId_bulletin() {
        return id_bulletin;
    }

    public void setId_bulletin(int id_bulletin) {
        this.id_bulletin = id_bulletin;
    }
    
    
}
