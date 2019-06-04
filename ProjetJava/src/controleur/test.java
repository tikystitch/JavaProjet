/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.sql.SQLException;
import java.text.ParseException;
import modele.*;

/**
 *
 * @author vuong
 */
public class test {
     public static void main(String[] args) throws ParseException {
        //Sans utiliser la Factory
        //DAO<Eleve> eleveDao = null; 
      
       /* 
        try
         {
           Connexion  a = new Connexion ("projet_java","root", ""); 
           //eleveDao = new EleveDAO(a.getConnection());
          // eleveDao = new EleveDAO(a);
           
         }
         catch( ClassNotFoundException | SQLException b)
            {
                System.out.println("Attention exception: "+ b );
            }
        */
       
        DAO<Trimestre> trimestreDao = null;
        try
         {
           Connexion  a = new Connexion ("projet_java","root", ""); 

           trimestreDao = new TrimestreDAO(a);
         }
         catch( ClassNotFoundException | SQLException b)
            {
                System.out.println("Attention exception: "+ b );
            }
        
        String date1="02/12/2012";
        String date2="01/02/2013";
        //SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        //SimpleDateFormat sdf2= new SimpleDateFormat("dd/MM/yyy");
        //java.util.Date date1=null;
        //java.util.Date date2=null;
        
        //Date date1=(Date) new SimpleDateFormat("dd/MM/yyyy").parse(sdate1);
        //Date date2=(Date) new SimpleDateFormat("dd/MM/yyyy").parse(sdate2);
        Trimestre c = new Trimestre(3,"deuxieme",  date1, date2,1);
        boolean add= trimestreDao.add(c);
        //System.out.println(bulletinDao.add(b)); 
         
         
       //Eleve e = new Eleve(5, "Louis", "Samir",1, 1);
        
        //boolean add = eleveDao.add(e);
        // boolean add = eleveDao.supp(e); 
        //boolean add = eleveDao.update(e); 
        //En utilisant la factory
        //DAO<Eleve> eleveDao = DAOFactory.getEleveDAO();
        
       // System.out.println(eleveDao.find(1).getNom()); 
       
       
     }   
}
