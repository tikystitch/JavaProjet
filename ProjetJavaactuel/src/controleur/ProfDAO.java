/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;
import java.sql.Connection;
import java.sql.SQLException;
import modele.Prof;
/**
 *
 * @author louis
 */
public class ProfDAO extends DAO<Prof> {
     public ProfDAO(Connexion conn) {
    super(conn);
  }

     @Override
  public boolean add(Prof obj) {
    String query =  "INSERT INTO prof (id,nom, prenom, idmatiere) VALUES ("+ obj.getId() +
                ",'"+obj.getNom()+
                "','"+obj.getPrenom()+
                "',"+obj.getIdmatiere()+")";
     
        try {
            this.connect.executeUpdate(query);
        } catch (SQLException ex) {
            System.out.println("Add: " + ex); 
        }
 
    return false;
  }

     @Override
  public boolean supp(Prof obj) {
             
      //Requête pour supprimer
      String query =  "DELETE FROM prof WHERE (id="+obj.getId()+")";
       try {
            this.connect.executeUpdate(query);
        } catch (SQLException ex) {
            System.out.println("Delete: "+ex); 
        }

    return false;
  }
  
    /**
     * 
     * @param obj
     * @return 
     */
     @Override
  public boolean update(Prof obj) {
        //Requête pour upadte
      String query =  "UPDATE prof SET id="+obj.getId()+",nom='"+obj.getNom()+"',prenom='"+obj.getPrenom()+
                "',idmatiere="+obj.getIdmatiere()+"WHERE (id="+obj.getId()+")";
        try {
            this.connect.executeUpdate(query);
        } catch (SQLException ex) {
            System.out.println("Update: "+ex); 
        }
 
   return false;
  }
  
  
     @Override
  public Prof find(int id) {
    return null;     
  }

}
