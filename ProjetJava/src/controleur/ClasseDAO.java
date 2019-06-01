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
import modele.Classe;

/**
 *
 * @author louis
 */
public class ClasseDAO extends DAO<Classe>{
     private Statement stmt; 
    public ClasseDAO(Connection conn) {
    super(conn);
    this.stmt = null;
  }

  public boolean add(Classe obj) {
    String query =  "INSERT INTO classe (id,nom, niveau, anneescolaire,idecole,ideleve) VALUES ("+ obj.getId() +
                ",'"+obj.getNom()+
                "','"+obj.getNiveau()+
                "','"+obj.getAnnee_scolaire()+
                "',"+obj.getId_ecole()+
                "',"+obj.getId_eleve()+")";
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
                 Logger.getLogger(ClasseDAO.class.getName()).log(Level.SEVERE, null, ex);
             }
         }
     }
    
    return false;
  }

  public boolean supp(Classe obj) {
    return false;
  }
   
  public boolean update(Classe obj) {
    return false;
  }
  
  
  public Classe find(int id) {
      return null;
  }
}
