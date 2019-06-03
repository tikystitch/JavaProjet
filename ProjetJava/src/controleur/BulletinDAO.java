/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;
import java.sql.Connection;
import modele.Bulletin;
/**
 *
 * @author louis
 */
public class BulletinDAO extends DAO<Bulletin> {
    public BulletinDAO(Connexion conn) {
    super(conn);
  }

  public boolean add(Bulletin obj) {
    return false;
  }

  public boolean supp(Bulletin obj) {
    return false;
  }
   
  public boolean update(Bulletin obj) {
    return false;
  }
  
  
  public Bulletin find(int id) {
      
    return null; 
  }

}
