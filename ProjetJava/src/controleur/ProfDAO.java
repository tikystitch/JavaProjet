/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import modele.Prof;
/**
 *
 * @author louis
 */
public class ProfDAO extends DAO<Prof> {
    private Statement stmt; 
     public ProfDAO(Connection conn) {
    super(conn);
    this.stmt = null;
  }

    @Override
  public boolean add(Prof obj) {
    String query =  "INSERT INTO prof (id,nom, prenom, classe,idenseignement) VALUES ("+ obj.getId() +
                ",'"+obj.getNom()+
                "','"+obj.getPrenom()+
                "',"+obj.getClasse()+
                ","+obj.getId_enseignement()+")";
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
                 Logger.getLogger(ProfDAO.class.getName()).log(Level.SEVERE, null, ex);
             }
         }
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
        Prof p = new Prof();
    String query="SELECT * FROM prof WHERE id = "+id;
    try{
         this.stmt = this.connect.createStatement(); 
         ResultSet result = this.stmt.executeQuery(query); 
          if(result.first())
        p = new Prof(
          id,  
          result.getString("nom"),
          result.getString("prenom"),
          Integer.parseInt(result.getString("classe")),
          Integer.parseInt(result.getString("idenseignement")));
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
                 Logger.getLogger(ProfDAO.class.getName()).log(Level.SEVERE, null, ex);
             }
         }
     }
    return p;
  }

}
