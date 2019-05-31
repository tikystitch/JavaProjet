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
    
}
