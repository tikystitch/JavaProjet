/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;
import modele.Notes;
/**
 *
 * @author louis
 */
public class NotesDAO extends DAO<Notes> {
     public NotesDAO(Connexion conn) {
    super(conn);
  }

  public boolean add(Notes obj) {
    return false;
  }

  public boolean supp(Notes obj) {
    return false;
  }
   
  public boolean update(Notes obj) {
    return false;
  }
  /*
  public Notes find(int id) {
    
  }*/
}
