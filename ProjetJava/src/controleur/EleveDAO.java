/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;

import modele.Eleve;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author louis
 */
public class EleveDAO extends DAO<Eleve> {
    private Statement stmt;
    //private Connection conn;
    
    public EleveDAO(Connection conn) {
    super(conn);
    this.stmt = null;
  }

    @Override
  public boolean add(Eleve obj) {
      
      /*
      try{
        ResultSet result = this.connect.createStatement(
        ResultSet.TYPE_SCROLL_INSENSITIVE,
        ResultSet.CONCUR_READ_ONLY).executeQuery(
                "INSERT INTO eleve (id,nom, prenom, classe, bulletin) VALUES ("+4+",'jfuf','dyfsy',"+45+","+58+")"); 
                
                
                
                //"INSERT INTO eleve (`nom`, `prenom`, `classe`, `bulletin`) VALUES ("+obj.getNom()+
                //","+obj.getPrenom()+
                //","+obj.getClasse()+
                //","+obj.getBulletin()+")");
        System.out.println("ajout de:"+obj.getNom()+" "+obj.getPrenom());
      }
      catch (SQLException e) {
          System.out.println("Exception: "+ e ); 
    }
      */
    
    //String query = "INSERT INTO eleve (id,nom, prenom, classe, bulletin) VALUES ("+4+",'jfuf','dyfsy',"+45+","+58+")"; 
     String query =  "INSERT INTO eleve (id,nom, prenom, classe, bulletin) VALUES ("+ obj.getId() +
                ","+obj.getNom()+
                ","+obj.getPrenom()+
                ","+obj.getClasse()+
                ","+obj.getBulletin()+")"; 
     try{
         this.stmt = this.connect.createStatement(); 
         int rs = this.stmt.executeUpdate(query); 
     }catch(SQLException e )
     {
         System.out.println(e);
     } finally 
     {
         if (this.stmt != null )
         {
             try {
                 this.stmt.close();
             } catch (SQLException ex) {
                 Logger.getLogger(EleveDAO.class.getName()).log(Level.SEVERE, null, ex);
             }
         }
     }
    
    return false;
  }

  public boolean supp(Eleve obj) {
      try{
        ResultSet result = this.connect.createStatement(
        ResultSet.TYPE_SCROLL_INSENSITIVE,
        ResultSet.CONCUR_READ_ONLY).executeQuery("DELETE * FROM eleve WHERE id = " + obj.getId());
        System.out.println("suppression de:"+obj.getNom()+" "+obj.getPrenom());
      } 
      catch (SQLException e) {
      e.printStackTrace();
      }
    return false;
  }
   
  public boolean update(Eleve obj) {
      
      try{
        ResultSet result = this.connect.createStatement(
        ResultSet.TYPE_SCROLL_INSENSITIVE,
        ResultSet.CONCUR_READ_ONLY).executeQuery(
                "UPDATE eleve SET nom='"+obj.getNom()+
                "',prenom='"+obj.getPrenom()+
                "',classe='"+obj.getClasse()+
                "',bulletin='"+obj.getBulletin()+
                "WHERE id = " + obj.getId());
       System.out.println("mise a jour de:"+obj.getNom()+" "+obj.getPrenom());
      }
      catch (SQLException e) {
      e.printStackTrace();
    }
   return false;
  }
  
  
  public Eleve find(int id) {
        Eleve eleve = new Eleve();      
      
    try {
        ResultSet result = this.connect.createStatement(
        ResultSet.TYPE_SCROLL_INSENSITIVE,
        ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM eleve WHERE id = " + id);
        
        if(result.first())
        eleve = new Eleve(
          id,  
          result.getString("nom"),
          result.getString("prenom"),
          Integer.parseInt(result.getString("classe")),
          Integer.parseInt(result.getString("bulletin")));         
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return eleve;
  }
  
}
