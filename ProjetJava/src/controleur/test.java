/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;

import java.sql.SQLException;
import modele.Eleve;
import modele.Prof;

/**
 *
 * @author vuong
 */
public class test {
     public static void main(String[] args) {
        //Sans utiliser la Factory
       //DAO<Eleve> eleveDao = null; 
       DAO<Prof> profDao=null;
        try
         {
           Connexion  a = new Connexion ("projet_java","root", ""); 
           //eleveDao = new EleveDAO(a.getConnection());
           profDao = new ProfDAO(a.getConnection());
         }
         catch( ClassNotFoundException | SQLException b)
            {
                System.out.println("Attention exception: "+ b );
            }
          
       //Eleve e1 = new Eleve(6, "Jimmou", "Vuong",1, 1);
        //boolean update = eleveDao.add(e1);
         Prof p1=new Prof(4, "moi", "Me",1,1);
         boolean update2=profDao.add(p1);
         //En utilisant la factory
         //DAO<Eleve> eleveDao = DAOFactory.getEleveDAO();
        
       
     }   
}
