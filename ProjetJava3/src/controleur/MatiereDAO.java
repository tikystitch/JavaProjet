/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;
import java.sql.Connection;
import java.sql.SQLException;
import modele.Matiere;
/**
 *
 * @author louis
 */
public class MatiereDAO extends DAO<Matiere> {
     public MatiereDAO(Connexion conn) {
    super(conn);
  }

     @Override
  public boolean add(Matiere obj) {
            //Requête pour add
    String query =  "INSERT INTO matiere (id,note,appreciation,bulletin,prof) VALUES ("+ obj.getId() +
                ","+obj.getNote()+
                ",'"+obj.getAppreciation()+
                "',"+obj.getBulletin()+
                ","+obj.getProf()+")";
     
        try {
            this.connect.executeUpdate(query);
        } catch (SQLException ex) {
            System.out.println("Add: " + ex); 
        }
 
    return false;
  }

     @Override
  public boolean supp(Matiere obj) {
          //Requête pour supprimer
      String query =  "DELETE FROM matiere WHERE (id="+obj.getId()+")";
       try {
            this.connect.executeUpdate(query);
        } catch (SQLException ex) {
            System.out.println("Delete: "+ex); 
        }

    return false;
  }
   
     @Override
  public boolean update(Matiere obj) {
        
      //Requête pour upadte
      String query =  "UPDATE matiere SET id="+obj.getId()+",note="+obj.getNote()+",appreciation='"+obj.getAppreciation()+
                "',bulletin="+obj.getBulletin()+
                ",prof="+obj.getProf()+" WHERE (id="+obj.getId()+")";
        try {
            this.connect.executeUpdate(query);
        } catch (SQLException ex) {
            System.out.println("Update: "+ex); 
        }
 
   return false;
  }
  
  
     @Override
  public Matiere find(int id) {
     return null;    
  }
}
