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
import modele.Enseignement;
/**
 *
 * @author louis
 */
public class EnseignementDAO extends DAO<Enseignement> {
    private Statement stmt; 
    public EnseignementDAO(Connection conn) {
    super(conn);
    this.stmt = null;
  }

  public boolean add(Enseignement obj) {
    String query =  "INSERT INTO eleve (id,nom_matiere) VALUES ("+ obj.getId() +
                ",'"+obj.getNom_matiere()+"')";
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
                 Logger.getLogger(EnseignementDAO.class.getName()).log(Level.SEVERE, null, ex);
             }
         }
     }
    
    return false;
  }

  public boolean supp(Enseignement obj) {
    return false;
  }
   
  public boolean update(Enseignement obj) {
    return false;
  }

  public Enseignement find(int id) {
    return null;
  }

}
