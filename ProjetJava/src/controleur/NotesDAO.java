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

  public boolean supp(Notes obj) {
    return false;
  }
   
  public boolean update(Notes obj) {
    return false;
  }
  
  public Notes find(int id) {
    return null; 
    
  }
}
