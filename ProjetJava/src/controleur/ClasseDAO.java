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

  public boolean add(Classe obj) {
         //Requête pour add
    String query =  "INSERT INTO classe (id,nom, niveau, anneescolaire,idecole,ideleve) VALUES ("+ obj.getId() +
                ",'"+obj.getNom()+
                "','"+obj.getNiveau()+
                "','"+obj.getAnnee_scolaire()+
                "',"+obj.getId_ecole()+
                ","+obj.getId_eleve()+")";
     
        try {
            this.connect.executeUpdate(query);
        } catch (SQLException ex) {
            System.out.println("Add: " + ex); 
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
