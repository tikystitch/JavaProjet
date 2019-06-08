/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;
import java.sql.Connection;
import java.sql.SQLException;
import modele.Bulletin;
/**
 *
 * @author louis
 */
public class BulletinDAO extends DAO<Bulletin> {
    public BulletinDAO(Connexion conn) {
    super(conn);
  }

    @Override
  public boolean add(Bulletin obj) {
     //Requête pour add
      String query =  "INSERT INTO bulletin (id,note,appreciation,trimestre, idmatiere) VALUES ("+ obj.getId() +
                ","+obj.getNote()+
                ",'"+obj.getAppreciation()+
                "',"+obj.getTrimestre()+","+obj.getIdmatiere()+")";
     
        try {
            this.connect.executeUpdate(query);
        } catch (SQLException ex) {
            System.out.println("Add: " + ex); 
        }
 
    return false;
  }

    @Override
  public boolean supp(Bulletin obj) {
            
      //Requête pour supprimer
      String query =  "DELETE FROM bulletin WHERE (id="+obj.getId()+")";
       try {
            this.connect.executeUpdate(query);
        } catch (SQLException ex) {
            System.out.println("Delete: "+ex); 
        }

    return false;
  }
   
    @Override
  public boolean update(Bulletin obj) {
       
      //Requête pour upadte
      String query =  "UPDATE bulletin SET id="+obj.getId()+",note="+obj.getNote()+",appreciation='"+obj.getAppreciation()+
                "',trimestre="+obj.getTrimestre()+",idmatiere="+obj.getIdmatiere()+" WHERE (id="+obj.getId()+")";
        try {
            this.connect.executeUpdate(query);
        } catch (SQLException ex) {
            System.out.println("Update: "+ex); 
        }
 
   return false;
  }
  
  
    @Override
  public Bulletin find(int id) {
      
    return null; 
  }

}
