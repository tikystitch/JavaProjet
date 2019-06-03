/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;

import java.sql.SQLException;
import modele.Eleve;

/**
 *
 * @author vuong
 */
public class test {
     public static void main(String[] args) {
        //Sans utiliser la Factory
        DAO<Eleve> eleveDao = null; 
        
        try
         {
           Connexion  a = new Connexion ("projet_java","root", ""); 
           //eleveDao = new EleveDAO(a.getConnection());
           eleveDao = new EleveDAO(a);
           
         }
         catch( ClassNotFoundException | SQLException b)
            {
                System.out.println("Attention exception: "+ b );
            }
          
        Eleve e = new Eleve(5, "Louis", "Samir",1, 1);
        //boolean add = eleveDao.add(e);
        // boolean add = eleveDao.supp(e); 
        //boolean add = eleveDao.update(e); 
        //En utilisant la factory
        //DAO<Eleve> eleveDao = DAOFactory.getEleveDAO();
        System.out.println(eleveDao.find(1).getNom()); 
       
     }   
}
