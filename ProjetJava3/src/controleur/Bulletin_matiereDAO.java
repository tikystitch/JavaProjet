/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;
import java.sql.Connection;
import java.sql.SQLException;
import modele.Bulletin_matiere;
/**
 *
 * @author louis
 */
public class Bulletin_matiereDAO extends DAO<Bulletin_matiere>  {
     public Bulletin_matiereDAO(Connexion conn) {
    super(conn);
  }

     @Override
  public boolean add(Bulletin_matiere obj) {
         //Requête pour add
    String query =  "INSERT INTO bulletinmatière (id,appreciation, idbulletin) VALUES ("+ obj.getId() +
                ",'"+obj.getAppreciation()+
                "',"+obj.getIdbulletin()+")";
     
        try {
            this.connect.executeUpdate(query);
        } catch (SQLException ex) {
            System.out.println("Add: " + ex); 
        }
 
    return false;
  }

     @Override
  public boolean supp(Bulletin_matiere obj) {
             
      //Requête pour supprimer
      String query =  "DELETE FROM bulletin_matiere WHERE (id="+obj.getId()+")";
       try {
            this.connect.executeUpdate(query);
        } catch (SQLException ex) {
            System.out.println("Delete: "+ex); 
        }

    return false;
  }
   
     @Override
  public boolean update(Bulletin_matiere obj) {
        
      //Requête pour upadte
      String query =  "UPDATE bulletin_matiere SET id="+obj.getId()+",appreciation='"+obj.getAppreciation()+"',idbulletin="+obj.getIdbulletin()+
                " WHERE (id="+obj.getId()+")";
        try {
            this.connect.executeUpdate(query);
        } catch (SQLException ex) {
            System.out.println("Update: "+ex); 
        }
 
   return false;
  }
  
  
  public Bulletin_matiere find(int id) {
    return null;     
  }

}
