/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;

import modele.Eleve;
import java.sql.Connection;

/**
 *
 * @author louis
 */
public class EleveDAO extends DAO<Eleve> {
    public EleveDAO(Connexion conn) {
    super(conn);
  }

  public boolean add(Eleve obj) {
    return false;
  }

  public boolean supp(Eleve obj) {
    return false;
  }
   
  public boolean update(Eleve obj) {
    return false;
  }
  
  /*
  public Eleve find(int id) {
    
  }*/
}
