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
import modele.Matiere;
/**
 *
 * @author louis
 */
public class MatiereDAO extends DAO<Matiere> {
     private Statement stmt;
    public MatiereDAO(Connection conn) {
    super(conn);
    this.stmt = null;
  }

  public boolean add(Matiere obj) {
    String query =  "INSERT INTO enseignement (id,note,appreciation,bulletin,prof) VALUES ("+ obj.getId() +
                ",'"+obj.getNote()+
                ",'"+obj.getAppreciation()+
                "',"+obj.getBulletin()+
                ","+obj.getProf()+")";
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
                 Logger.getLogger(EleveDAO.class.getName()).log(Level.SEVERE, null, ex);
             }
         }
     }
    
    return false;
  }

  public boolean supp(Matiere obj) {
    return false;
  }
   
  public boolean update(Matiere obj) {
    return false;
  }
  
  /*
  public Matiere find(int id) {
    
  }*/
}
