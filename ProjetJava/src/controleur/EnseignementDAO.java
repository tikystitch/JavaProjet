/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;
import java.sql.Connection;
import java.sql.SQLException;
import modele.Enseignement;
/**
 *
 * @author louis
 */
public class EnseignementDAO extends DAO<Enseignement> {
     public EnseignementDAO(Connexion conn) {
    super(conn);
  }

  public boolean add(Enseignement obj) {
            //Requête pour add
    String query =  "INSERT INTO enseignement (id,nom_matiere) VALUES ("+ obj.getId() +
                ",'"+obj.getNom_matiere()+"')";
     
        try {
            this.connect.executeUpdate(query);
        } catch (SQLException ex) {
            System.out.println("Add: " + ex); 
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
