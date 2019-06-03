/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;
import java.sql.Connection;
import modele.Prof;
/**
 *
 * @author louis
 */
public class ProfDAO extends DAO<Prof> {
     public ProfDAO(Connexion conn) {
    super(conn);
  }

  public boolean add(Prof obj) {
    return false;
  }

  public boolean supp(Prof obj) {
    return false;
  }
   
  public boolean update(Prof obj) {
    return false;
  }
  
  
  public Prof find(int id) {
    return null;     
  }

}
