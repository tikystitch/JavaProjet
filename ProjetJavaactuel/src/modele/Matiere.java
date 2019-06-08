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
public class Matiere {
    private int id=0;
    private int note=0;
    private String appreciation="";
    private int idenseignement=0;
    private String tablename="matiere";

    public Matiere() {
    }
    
    public Matiere(int id, int note, String appreciation, int idenseignement) {
        this.id=id;
        this.note=note;
        this.appreciation=appreciation;
        this.idenseignement=idenseignement;
    }    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }

    public String getAppreciation() {
        return appreciation;
    }

    public void setAppreciation(String appreciation) {
        this.appreciation = appreciation;
    }

    public String getTablename() {
        return tablename;
    }

    public int getIdenseignement() {
        return idenseignement;
    }

    public void setIdenseignement(int idenseignement) {
        this.idenseignement = idenseignement;
    }
    
    
}
