/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

/**
 *
 * @author louis
 */
public class Prof {
    private int id=0;
    private String nom="";
    private String prenom="";
    private int classe=0;
    private int id_enseignement=0;
    private String tablename="prof";

    public Prof() {
    }
    public Prof(int id, String nom, String prenom, int classe, int id_enseignement) {
        this.id=id;
        this.nom=nom;
        this.prenom=prenom;
        this.classe=classe;
        this.id_enseignement=id_enseignement;
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

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getClasse() {
        return classe;
    }

    public void setClasse(int classe) {
        this.classe = classe;
    }

    public int getId_enseignement() {
        return id_enseignement;
    }

    public void setId_enseignement(int id_enseignement) {
        this.id_enseignement = id_enseignement;
    }

    public String getTablename() {
        return tablename;
    }
    
    
    
}
