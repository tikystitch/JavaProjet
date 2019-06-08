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
public class Bulletin {
    private int id = 0;
    private int note = 0;
    private String appreciation="";
    private int trimestre =0;
    private int idmatiere=0;
    private String tablename="bulletin";
    
    public Bulletin(){};
    public Bulletin(int id, int note, String appreciation, int trimestre, int idmatiere){
        this.id=id;
        this.note=note;
        this.appreciation=appreciation;
        this.trimestre=trimestre;
        this.idmatiere=idmatiere;
    }

    public int getId() {
        return id;
    }

    public int getNote() {
        return note;
    }

    public String getAppreciation() {
        return appreciation;
    }

    public int getTrimestre() {
        return trimestre;
    }

    public String getTablename() {
        return tablename;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNote(int note) {
        this.note = note;
    }

    public void setAppreciation(String appreciation) {
        this.appreciation = appreciation;
    }

    public void setTrimestre(int trimestre) {
        this.trimestre = trimestre;
    }

    public int getIdmatiere() {
        return idmatiere;
    }

    public void setIdmatiere(int idmatiere) {
        this.idmatiere = idmatiere;
    }
    
    
}
