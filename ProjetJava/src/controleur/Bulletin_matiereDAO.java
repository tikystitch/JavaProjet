/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;
import java.sql.Connection;
import modele.Bulletin_matiere;
/**
 *
 * @author louis
 */
public class Bulletin_matiereDAO extends DAO<Bulletin_matiere>  {
     public Bulletin_matiereDAO(Connexion conn) {
    super(conn);
  }

  public boolean add(Bulletin_matiere obj) {
    return false;
  }

  public boolean supp(Bulletin_matiere obj) {
    return false;
  }
   
  public boolean update(Bulletin_matiere obj) {
    return false;
  }
  
  
  public Bulletin_matiere find(int id) {
    return null;     
  }

}
