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
import modele.Bulletin_matiere;
/**
 *
 * @author louis
 */
public class Bulletin_matiereDAO extends DAO<Bulletin_matiere>  {
    private Statement stmt; 
    public Bulletin_matiereDAO(Connection conn) {
    super(conn);
    this.stmt = null;
  }

  public boolean add(Bulletin_matiere obj) {
    String query =  "INSERT INTO bulletinmatière (id,appreciation, idbulletin) VALUES ("+ obj.getId() +
                ",'"+obj.getAppreciation()+
                "',"+obj.getIdbulletin()+")";
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
                 Logger.getLogger(Bulletin_matiereDAO.class.getName()).log(Level.SEVERE, null, ex);
             }
         }
     }
    
    return false;
  }

  public boolean supp(Bulletin_matiere obj) {
    return false;
  }
   
  public boolean update(Bulletin_matiere obj) {
    return false;
  }
  
  
  public Bulletin_matiere find(int id) {
    return null;
  }

}
