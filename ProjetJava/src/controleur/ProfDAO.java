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

  public boolean add(Prof obj) {
    String query =  "INSERT INTO prof (id,nom, prenom, classe,idenseignement) VALUES ("+ obj.getId() +
                ",'"+obj.getNom()+
                "','"+obj.getPrenom()+
                "',"+obj.getClasse()+
                ","+obj.getId_enseignement()+")";
     
        try {
            this.connect.executeUpdate(query);
        } catch (SQLException ex) {
            System.out.println("Add: " + ex); 
        }
 
    return false;
  }

  public boolean supp(Prof obj) {
    return false;
  }
   
  public boolean update(Prof obj) {
    return false;
  }
  
  
  public Prof find(int id) {
    return null;     
  }

}
