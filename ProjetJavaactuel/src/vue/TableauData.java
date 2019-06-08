/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;

import controleur.DAO;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import modele.Eleve;

/**
 *
 * @author vuong
 */
public class TableauData {
    
    //Besoins de créer un constructeur surchargé. 
    
    //Besoins de créer un setData Table qui va update la Jtable et passer en paramère un DAO<Eleve> obj
    
    //Faire un constructeur pour afficher de base la liste de élèves.
    
    //Pour add le tableau: 
    public JTable Tableau(DAO<Eleve> obj ) throws SQLException
    {
    
    //JPanel panel = new JPanel(); 
    //panel.setLayout(new BorderLayout()); //
    
    
    //Recuperation des données:
    
    //Contenue de la requête
    ArrayList<String> InsideTable;
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
    //On override la méthode qui enable l'edit de la Jtable
    //https://community.oracle.com/thread/1896000
    JTable table = new JTable(personnes, tbN){
    @Override
    public boolean isCellEditable(int row, int col) {
      return false;
    }
  };       
    
    //Pour bidouiller le tableau 
    table.setRowHeight(32);
    table.setFont(new Font ("Arial", Font.BOLD, 16)); 
   
    //Mettre en couleur la row selectionnée.
    //table.setRowSelectionInterval(0, 0);
    //table.removeRowSelectionInterval(0, 1);
    
  
    //Source: https://stackoverflow.com/questions/29345792/java-jtable-getting-the-data-of-the-selected-row
    
    // Permet de add un event de Mouse pour lire l'id de la column 
     table.addMouseListener(new MouseAdapter() {
         //http://esus.com/detecting-double-click-row-jtable/
        @Override
        public void mouseClicked(MouseEvent e) { 
           if (e.getClickCount() == 1) {
              JTable target = (JTable)e.getSource();
              int row = target.getSelectedRow();
              
              // On récupère ici la value de la première colonne de la row
              String value = table.getModel().getValueAt(row, 0).toString();
              
              
              //Plus qu'a linker ça avec le delete et le modifier --> bouton.
              System.out.println(value);
              }
        }
     });
     
    return  table; 
   /*
    //Cette partie sert à mettre la JTable dans le Jpanel dans la JFrame
    this.add(panel); 
    panel.add(table);
    //Pour faire mettre le petit encadré en haut.
    panel.add(new JScrollPane(table)); 
    this.setContentPane(panel);
    this.setVisible(true);
    }*/
    }
}
