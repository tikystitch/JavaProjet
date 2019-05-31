/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;

import java.sql.SQLException;

/**
 *
 * @author louis
 */
public class DAOFactory {
    
    ///issu d'openclassroom, a adapter a notre methode connection.
    
    protected static final Connexion conn = new Connexion("localhost","root","");   
   
  /**
  * Retourne un objet Bulletin interagissant avec la BDD
  * @return DAO
  */
  public static DAO getBulletinDAO(){
    return new BulletinDAO(conn);
  }

  /**
  * Retourne un objet Bulletin_matiere interagissant avec la BDD
  * @return DAO
  */
  public static DAO getBulletin_matiereDAO(){
    return new Bulletin_matiereDAO(conn);
  }

  /**
  * Retourne un objet Classe interagissant avec la BDD
  * @return DAO
  */
  public static DAO getClasseDAO(){
    return new ClasseDAO(conn);
  }

  /**
  * Retourne un objet Ecole interagissant avec la BDD
  * @return DAO
  */
  public static DAO getEcoleDAO(){
    return new EcoleDAO(conn);
  }   
    /**
  * Retourne un objet Eleve interagissant avec la BDD
  * @return DAO
  */
  public static DAO getleveDAO(){
    return new EleveDAO(conn);
  }   
    /**
  * Retourne un objet Enseignement interagissant avec la BDD
  * @return DAO
  */
  public static DAO getEnseignementDAO(){
    return new EnseignementDAO(conn);
  }   
    /**
  * Retourne un objet Matiere interagissant avec la BDD
  * @return DAO
  */
  public static DAO getMatiereDAO(){
    return new MatiereDAO(conn);
  }   
    /**
  * Retourne un objet Notes interagissant avec la BDD
  * @return DAO
  */
  public static DAO getNotesDAO(){
    return new NotesDAO(conn);
  }   
    /**
  * Retourne un objet Prof interagissant avec la BDD
  * @return DAO
  */
  public static DAO getProfDAO(){
    return new ProfDAO(conn);
  }   
    /**
  * Retourne un objet Trimestre interagissant avec la BDD
  * @return DAO
  */
  public static DAO getTrimesreDAO(){
    return new TrimestreDAO(conn);
  }   
}
