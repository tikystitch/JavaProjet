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
import modele.Ecole;
/**
 *
 * @author louis
 */
public class EcoleDAO extends DAO<Ecole> {
    private Statement stmt; 
    public EcoleDAO(Connection conn) {
    super(conn);
    this.stmt = null;
  }

  public boolean add(Ecole obj) {
    String query =  "INSERT INTO ecole (id,nom,idclasse) VALUES ("+ obj.getId() +
                ",'"+obj.getNom()+
                "',"+obj.getIdclasse()+")";
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
                 Logger.getLogger(EcoleDAO.class.getName()).log(Level.SEVERE, null, ex);
             }
         }
     }
    
    return false;
  }

  public boolean supp(Ecole obj) {
    return false;
  }
   
  public boolean update(Ecole obj) {
    return false;
  }
 
  public Ecole find(int id) {
    return null;
  }

}
