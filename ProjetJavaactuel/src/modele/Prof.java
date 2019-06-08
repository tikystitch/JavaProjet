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
    private int idmatiere=0;
    private String tablename="prof";

    public Prof() {
    }
    public Prof(int id, String nom, String prenom, int idmatiere) {
        this.id=id;
        this.nom=nom;
        this.prenom=prenom;
        this.idmatiere=idmatiere;
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

    public String getTablename() {
        return tablename;
    }

    public int getIdmatiere() {
        return idmatiere;
    }

    public void setIdmatiere(int idmatiere) {
        this.idmatiere = idmatiere;
    }
    
    
    
}
