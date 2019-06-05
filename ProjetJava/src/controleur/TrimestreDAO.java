/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;
import java.sql.Connection;
import java.sql.SQLException;
import modele.Trimestre;
/**
 *
 * @author louis
 */
public class TrimestreDAO extends DAO<Trimestre> {
     public TrimestreDAO(Connexion conn) {
    super(conn);
  }

  public boolean add(Trimestre obj) {
    String query =  "INSERT INTO trimestre (id,nom,debut,fin,idbulletin) VALUES ("+ obj.getId() +
                ",'"+obj.getNom()+
                "','"+obj.getDateDebut()+
                "','"+obj.getDateFin()+
                "',"+obj.getId_bulletin()+")";
     
        try {
            this.connect.executeUpdate(query);
        } catch (SQLException ex) {
            System.out.println("Add: " + ex); 
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
