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

     @Override
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

     @Override
  public boolean supp(Ecole obj) {
            
      //Requête pour supprimer
      String query =  "DELETE FROM ecole WHERE (id="+obj.getId()+")";
       try {
            this.connect.executeUpdate(query);
        } catch (SQLException ex) {
            System.out.println("Delete: "+ex); 
        }

    return false;
  }
   
     @Override
  public boolean update(Ecole obj) {
         //Requête pour upadte
      String query =  "UPDATE ecole SET id="+obj.getId()+",nom='"+obj.getNom()+"',idclasse="+obj.getIdclasse()+
                " WHERE (id="+obj.getId()+")";
        try {
            this.connect.executeUpdate(query);
        } catch (SQLException ex) {
            System.out.println("Update: "+ex); 
        }
 
   return false;
  }
 
     @Override
  public Ecole find(int id) {
    return null;     
  }

}
