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
    private String dateDebut;
    private String dateFin;
    private int id_bulletin=0;

    public Trimestre() {
    }
    
    public Trimestre(int id, String nom, String debut, String fin, int id_bulletin) {
        this.id=id;
        this.nom=nom;
        this.dateDebut=debut;
        this.dateFin=fin;
        this.id_bulletin=id_bulletin;
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

    public String getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(String dateDebut) {
        this.dateDebut = dateDebut;
    }

    public String getDateFin() {
        return dateFin;
    }

    public void setDateFin(String dateFin) {
        this.dateFin = dateFin;
    }

    public int getId_bulletin() {
        return id_bulletin;
    }

    public void setId_bulletin(int id_bulletin) {
        this.id_bulletin = id_bulletin;
    }
    
}
