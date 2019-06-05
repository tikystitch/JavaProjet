/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;

import controleur.DAO;
import java.awt.BorderLayout;
import java.awt.Font;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import modele.Eleve;

/**
 *
 * @author vuong
 */
public class Fenetre extends JFrame {
 
    public Fenetre(){
    this.setTitle("Ma première fenêtre Java");
    //Pour affiche la fenêtre en grand s
    this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    this.setLocationRelativeTo(null);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);             
  }
    
    //Pour add le tableau: 
    public void Tableau(DAO<Eleve> obj ) throws SQLException
    {
    
    JPanel panel = new JPanel(); 
    panel.setLayout(new BorderLayout()); //
    //ATTENION METTRE UN JSCROLL PANE !!! 
    
    //Recuperation des données:
    
    //Contenue de la requête
    ArrayList<String> InsideTable;
    //InsideTable = (String)(obj.connect.remplirChampsRequete("SELECT * FROM eleve")).toArray(); 
    InsideTable = obj.getConnexion().remplirChampsRequete("SELECT * FROM eleve"); 
    
    //Nom des colonnes
    ArrayList<String> tableName;
    tableName = obj.getConnexion().remplirChampsTable("eleve"); 
    String[] buffer = new String[tableName.size()]; //
    
    Object[] tb2 = obj.getConnexion().remplirChampsTable("eleve").toArray(); 
    
    //Pour faire pour mettre l'Array en String[]
    //Pour split les différentes name de table
    for (int i =0; i< tableName.size(); i++)
    {
        buffer = tableName.get(i).split(","); 
    }
    //Pour enlever le blanc au début 
    String[] tbN = new String[buffer.length-1];  
    int cpt2=0; 
    for (int i =1; i< buffer.length; i++)
    {
        tbN[cpt2] = buffer[i];
        cpt2++;   
    }
    
    //Pour créer la matrice epour la Jtable
    String[][] personnes = new String[InsideTable.size()][tableName.size()];  
    
    //Différentaiation des différentes données 
    for (int i=0; i< InsideTable.size(); i++)
    {
        for (int j=0; j< tableName.size(); j++)
        {
            personnes[i] = InsideTable.get(i).split(",");            
        }
    }
    
    //Création de la JTable grâce aux données recueiillis 
    JTable table = new JTable(personnes, tbN);       
    
    //Pour bidouiller le tableau 
    table.setRowHeight(32);
    table.setFont(new Font ("Arial", Font.BOLD, 16)); 
   
    
   // table.setAutoResizeMode( JTable.AUTO_RESIZE_OFF ); //
    this.add(panel); 
    panel.add(table);
    //Pour faire mettre le petit encadré en haut.
    panel.add(new JScrollPane(table)); 
    this.setContentPane(panel);
    this.setVisible(true);
    }
}

