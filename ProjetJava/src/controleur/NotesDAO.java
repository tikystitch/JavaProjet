/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import modele.Notes;
/**
 *
 * @author louis
 */
public class NotesDAO extends DAO<Notes> {
    private Statement stmt; 
    public NotesDAO(Connection conn) {
    super(conn);
    this.stmt = null;
  }

  public boolean add(Notes obj) {
    String query =  "INSERT INTO notes (id,note,appreciation,idbulletinmatiere) VALUES ("+ obj.getId() +
                ",'"+obj.getNote()+
                ",'"+obj.getAppreciation()+
                "',"+obj.getId_bulletin_matiere()+")";
     try{
         this.stmt = this.connect.createStatement(); 
         int rs = this.stmt.executeUpdate(query); 
     }catch(SQLException e )
     {
         System.out.println(e);
     } finally 
     {
         if (this.stmt != null )
         {
             try {
                 this.stmt.close();
             } catch (SQLException ex) {
                 Logger.getLogger(NotesDAO.class.getName()).log(Level.SEVERE, null, ex);
             }
         }
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
