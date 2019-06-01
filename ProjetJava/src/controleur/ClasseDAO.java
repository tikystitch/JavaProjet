/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;
import java.sql.Connection;
import modele.Classe;
/**
 *
 * @author louis
 */
public class ClasseDAO extends DAO<Classe>{
     public ClasseDAO(Connection conn) {
    super(conn);
  }

  public boolean add(Classe obj) {
    return false;
  }

  public boolean supp(Classe obj) {
    return false;
  }
   
  public boolean update(Classe obj) {
    return false;
  }
  
  /*
  public Classe find(int id) {
    
  }
*/
}
