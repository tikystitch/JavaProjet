/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import java.util.ArrayList;

/**
 *
 * @author louis
 */
public class Classe {
    private int id=0;
    private String nom="";
    private String niveau="";
    private String annee_scolaire="";
    ArrayList<Eleve> listEleve = new ArrayList<Eleve>();
    private String tablename="classe";
    
    public Classe() {
    }
    
    public Classe(int id, String nom, String niveau, String annee_scolaire) {
        this.id=id;
        this.nom=nom;
        this.niveau=niveau;
        this.annee_scolaire=annee_scolaire;     
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

    public String getNiveau() {
        return niveau;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }

    public String getAnnee_scolaire() {
        return annee_scolaire;
    }

    public void setAnnee_scolaire(String annee_scolaire) {
        this.annee_scolaire = annee_scolaire;
    }

    public ArrayList<Eleve> getListEleve() {
        return listEleve;
    }

    public void setListEleve(ArrayList<Eleve> listEleve) {
        this.listEleve = listEleve;
    }

    public String getTablename() {
        return tablename;
    }
    
    
}
