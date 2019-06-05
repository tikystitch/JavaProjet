/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;
import java.sql.Connection;
import java.sql.SQLException;
import modele.Ecole;
/**
 *
 * @author louis
 */
public class EcoleDAO extends DAO<Ecole> {
     public EcoleDAO(Connexion conn) {
    super(conn);
  }

  public boolean add(Ecole obj) {
        //Requête pour add
    String query =  "INSERT INTO ecole (id,nom,idclasse) VALUES ("+ obj.getId() +
                ",'"+obj.getNom()+
                "',"+obj.getIdclasse()+")";
     
        try {
            this.connect.executeUpdate(query);
        } catch (SQLException ex) {
            System.out.println("Add: " + ex); 
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
