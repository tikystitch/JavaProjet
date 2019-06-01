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
        /*
        try
         {
          DAO<Eleve> eleveDao = new EleveDAO(new Connexion ("projet_java","root", ""));
         }
         catch( ClassNotFoundException | SQLException a)
            {
                System.out.println("Attention exception: "+ a );
            }
         */
         //En utilisant la factory
         DAO<Eleve> eleveDao = DAOFactory.getEleveDAO();
     }   
}
