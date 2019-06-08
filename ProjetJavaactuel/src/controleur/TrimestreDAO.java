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

     @Override
  public boolean add(Trimestre obj) {
    String query =  "INSERT INTO trimestre (id,nom,debut,fin) VALUES ("+ obj.getId() +
                ",'"+obj.getNom()+
                "','"+obj.getDateDebut()+
                "','"+obj.getDateFin()+
                "')";
     
        try {
            this.connect.executeUpdate(query);
        } catch (SQLException ex) {
            System.out.println("Add: " + ex); 
        }
 
    return false;
  }

     @Override
  public boolean supp(Trimestre obj) {
          //Requête pour supprimer
      String query =  "DELETE FROM trimestre WHERE (id="+obj.getId()+")";
       try {
            this.connect.executeUpdate(query);
        } catch (SQLException ex) {
            System.out.println("Delete: "+ex); 
        }

    return false;
  }
   
     @Override
  public boolean update(Trimestre obj) {
          //Requête pour upadte
      String query =  "UPDATE trimestre SET id="+obj.getId()+",nom='"+obj.getNom()+"',debut='"+obj.getDateDebut()+
                "',fin='"+obj.getDateFin()+
                "' WHERE (id="+obj.getId()+")";
        try {
            this.connect.executeUpdate(query);
        } catch (SQLException ex) {
            System.out.println("Update: "+ex); 
        }
 
   return false;
  }
 
     @Override
  public Trimestre find(int id) {
    return null;     
  }

}
