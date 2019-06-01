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
import modele.Bulletin;
/**
 *
 * @author louis
 */
public class BulletinDAO extends DAO<Bulletin> {
    private Statement stmt;
    public BulletinDAO(Connection conn) {
    super(conn);
    this.stmt = null;
  }

  public boolean add(Bulletin obj) {
    String query =  "INSERT INTO bulletin (id,note,appreciation,trimestre) VALUES ("+ obj.getId() +
                ","+obj.getNote()+
                ",'"+obj.getAppreciation()+
                "',"+obj.getTrimestre()+")";
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
                 Logger.getLogger(BulletinDAO.class.getName()).log(Level.SEVERE, null, ex);
             }
         }
     }
    
    return false;
  }

  public boolean supp(Bulletin obj) {
    return false;
  }
   
  public boolean update(Bulletin obj) {
    return false;
  }
  
  
  public Bulletin find(int id) {
    return null;
  }

}
