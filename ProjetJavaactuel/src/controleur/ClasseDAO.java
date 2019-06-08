/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;
import java.sql.Connection;
import java.sql.SQLException;
import modele.Classe;
/**
 *
 * @author louis
 */
public class ClasseDAO extends DAO<Classe>{
     public ClasseDAO(Connexion conn) {
    super(conn);
  }

     @Override
  public boolean add(Classe obj) {
         //Requête pour add
    String query =  "INSERT INTO classe (id,nom, niveau, anneescolaire) VALUES ("+ obj.getId() +
                ",'"+obj.getNom()+
                "','"+obj.getNiveau()+
                "','"+obj.getAnnee_scolaire()+
                "')";
     
        try {
            this.connect.executeUpdate(query);
        } catch (SQLException ex) {
            System.out.println("Add: " + ex); 
        }
 
    return false;
  }

     @Override
  public boolean supp(Classe obj) {
             
      //Requête pour supprimer
      String query =  "DELETE FROM classe WHERE (id="+obj.getId()+")";
       try {
            this.connect.executeUpdate(query);
        } catch (SQLException ex) {
            System.out.println("Delete: "+ex); 
        }

    return false;
  }
   
     @Override
  public boolean update(Classe obj) {
      //Requête pour upadte
      String query =  "UPDATE classe SET id="+obj.getId()+",nom='"+obj.getNom()+"',niveau='"+obj.getNiveau()+
                "',anneescolaire='"+obj.getAnnee_scolaire()+
                "'WHERE (id="+obj.getId()+")";
        try {
            this.connect.executeUpdate(query);
        } catch (SQLException ex) {
            System.out.println("Update: "+ex); 
        }
 
   return false;
  }
  
 
     @Override
  public Classe find(int id) {
    return null; 
    
  }

}
