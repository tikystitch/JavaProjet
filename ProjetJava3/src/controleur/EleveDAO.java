/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;

import modele.Eleve;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author louis
 */
public class EleveDAO extends DAO<Eleve> {
    private Statement stmt;
    //private Connection conn;
    
    public EleveDAO(Connexion conn) {
    super(conn);
    this.stmt = null;
  }

    @Override
  public boolean add(Eleve obj) {
      
      //Requête pour add
      String query = "INSERT INTO eleve (id,nom, prenom, classe, bulletin) VALUES ("+ obj.getId() +
                ",'"+obj.getNom()+
                "','"+obj.getPrenom()+
                "',"+obj.getClasse()+
                ","+obj.getBulletin()+")";
     
        try {
            this.connect.executeUpdate(query);
        } catch (SQLException ex) {
            System.out.println("Add: " + ex); 
        }
 
        
    return false;
  }

    @Override
  public boolean supp(Eleve obj) {
     
      //Requête pour supprimer
      String query =  "DELETE FROM eleve WHERE (id="+obj.getId()+")";
       try {
            this.connect.executeUpdate(query);
        } catch (SQLException ex) {
            System.out.println("Delete: "+ex); 
        }

    return false;
  }
   
    @Override
  public boolean update(Eleve obj) {
      
      //Requête pour upadte
      String query =  "UPDATE eleve SET id="+obj.getId()+",nom='"+obj.getNom()+"',prenom='"+obj.getPrenom()+
                "',classe="+obj.getClasse()+
                ",bulletin="+obj.getBulletin()+" WHERE (id="+obj.getId()+")";
        try {
            this.connect.executeUpdate(query);
        } catch (SQLException ex) {
            System.out.println("Update: "+ex); 
        }
 
   return false;
  }
  
  public ArrayList<String> getNameTable()
  {
      ArrayList<String> buffer = new ArrayList(); 
      try
      {
        buffer =  this.connect.remplirChampsTable("eleve");             
      }
      catch(SQLException a )
      {
          System.out.println(a); 
      }
      return buffer; 
  }
  
  @Override
  public Eleve find(int id) {
    
    Eleve eleve = new Eleve();      
    
    //requete qui recupere l'eleve correspondant a l'id en parametre
    String query="SELECT * FROM eleve WHERE id = "+id;
    try{
        //connexion a la bdd 
         this.stmt = this.connect.getConnection().createStatement(); 
         ResultSet result = this.stmt.executeQuery(query); 
         //instancie un eleve avec les donnees recuperees dans la bdd
          if(result.first())
        eleve = new Eleve(
          id,  
          result.getString("nom"), 
          result.getString("prenom"),
          Integer.parseInt(result.getString("classe")),
          Integer.parseInt(result.getString("bulletin")));
     }catch(SQLException e)
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
    return eleve;
  }
  
}
