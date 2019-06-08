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
public class Eleve {
    private int id=0;
    private String nom="";
    private String prenom="";
    private int classe=0;

    private int idclasse=0;
    private String tablename="eleve";

    public Eleve() {
    }
    
    public Eleve( int id,String nom, String prenom,int classe) {
        this.id=id;
        this.nom=nom;
        this.prenom=prenom;
        this.classe=classe;

    }   

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getClasse() {
        return this.classe;
    }

    public void setClasse(int classe) {
        this.classe = classe;
    }

    public String getTablename() {
        return tablename;
    }

    public int getIdclasse() {
        return idclasse;
    }

    public void setIdclasse(int idclasse) {
        this.idclasse = idclasse;
    }
    
    
}
