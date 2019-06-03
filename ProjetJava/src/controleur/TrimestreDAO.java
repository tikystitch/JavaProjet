/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;
import java.sql.Connection;
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
