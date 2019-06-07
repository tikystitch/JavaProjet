/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;
import java.sql.Connection;
import java.sql.SQLException;
import modele.Notes;
/**
 *
 * @author louis
 */
public class NotesDAO extends DAO<Notes> {
     public NotesDAO(Connexion conn) {
    super(conn);
  }

     @Override
  public boolean add(Notes obj) {
    String query =  "INSERT INTO notes (id,note,appreciation,idbulletinmatiere) VALUES ("+ obj.getId() +
                ","+obj.getNote()+
                ",'"+obj.getAppreciation()+
                "',"+obj.getId_bulletin_matiere()+")";
     
        try {
            this.connect.executeUpdate(query);
        } catch (SQLException ex) {
            System.out.println("Add: " + ex); 
        }
 
    return false;
  }

     @Override
  public boolean supp(Notes obj) {
         //Requête pour supprimer
      String query =  "DELETE FROM notes WHERE (id="+obj.getId()+")";
       try {
            this.connect.executeUpdate(query);
        } catch (SQLException ex) {
            System.out.println("Delete: "+ex); 
        }

    return false;
  }
   
     @Override
  public boolean update(Notes obj) {
        //Requête pour upadte
      String query =  "UPDATE notes SET id="+obj.getId()+",note="+obj.getNote()+",appreciation='"+obj.getAppreciation()+
                "',idbulletinmatiere="+obj.getId_bulletin_matiere()+
                " WHERE (id="+obj.getId()+")";
        try {
            this.connect.executeUpdate(query);
        } catch (SQLException ex) {
            System.out.println("Update: "+ex); 
        }
 
   return false;
  }
  
     @Override
  public Notes find(int id) {
    return null; 
    
  }
}
