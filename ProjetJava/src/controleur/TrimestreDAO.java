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
import modele.Trimestre;
/**
 *
 * @author louis
 */
public class TrimestreDAO extends DAO<Trimestre> {
     private Statement stmt;  
    public TrimestreDAO(Connection conn) {
    super(conn);
    this.stmt = null;
  }

  public boolean add(Trimestre obj) {
    String query =  "INSERT INTO trimestre (id,nom,debut,fin,idbulletin) VALUES ("+ obj.getId() +
                ",'"+obj.getNom()+
                "','"+obj.getDateDebut()+
                "','"+obj.getDateFin()+
                "',"+obj.getId_bulletin()+")";
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
                 Logger.getLogger(TrimestreDAO.class.getName()).log(Level.SEVERE, null, ex);
             }
         }
     }
    
    return false;
  }

  public boolean supp(Trimestre obj) {
    return false;
  }
   
  public boolean update(Trimestre obj) {
    return false;
  }
 
  public Trimestre find(int id) {
    return null;
  }
}
