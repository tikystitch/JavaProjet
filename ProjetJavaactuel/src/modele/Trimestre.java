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
    private String tablename="trimestre";

    public Trimestre() {
    }
    
    public Trimestre(int id, String nom, String debut, String fin) {
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
    
    public String getTablename() {
        return tablename;
    }
    
}
