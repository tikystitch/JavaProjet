/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;

import controleur.DAO;
import controleur.DAOFactory;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import modele.Eleve;

/**
 *
 * @author vuong
 */
public class Fenetre extends JFrame {
 
    public Fenetre(){
    this.setTitle("Menu");
    //Pour affiche la fenêtre en grand s
    this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    this.setLocationRelativeTo(null);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
    
    JPanel panel = new JPanel(); 
    panel.setLayout(new BorderLayout()); //
    //Recuperation des données:
    
     //initialise la DAOFactory 
    DAOFactory a = new DAOFactory(); 
    DAO<Eleve> eleveDao = a.getEleveDAO();
    TableauData buffer= new TableauData(); 
    
    JTable tab; 
        try {
             tab = buffer.Tableau(eleveDao);
             panel.add(tab);
            //Pour faire mettre le petit encadré en haut.


            panel.add(new JScrollPane(tab)); 
            this.setContentPane(panel);
            this.setVisible(true);
            
        } catch (SQLException ex) {
            Logger.getLogger(Fenetre.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    //Déclaration des panels de séparation
    JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
    JSplitPane split2=new JSplitPane(JSplitPane.VERTICAL_SPLIT);
    splitPane.setDividerLocation(150);
    
    //Déclaration des panel pour les boutons
    JPanel p = new JPanel();
    p.setLayout(new GridLayout(6,1));
    
    //déclaration des boutons
    JLabel texte=new JLabel("Fonctionnalite");
    JButton classe=new JButton("Classe");
    JButton eleve=new JButton("Eleve");
    JButton prof=new JButton("Professeur");
    JButton notes=new JButton("Notes");
    JButton enseignement= new JButton("Enseignement");

    //ajout des boutons dans le panel des boutons 
    p.add(texte);
    p.add(classe);
    p.add(eleve);
    p.add(prof);
    p.add(notes);
    p.add(enseignement);
    
    //Déclaration des panel pour le titre
    JPanel titre= new JPanel();
    
    //Déclaration de la zone de texte
    JTextArea area = new JTextArea();
    
    //Placement du titre
    area.setBounds(0,0,400,400);
    
    //Police du titre
    area.setFont(new Font("Times New Roman",Font.BOLD,26));
    area.append("ECOLE ECE");
    
    //add le text dans le panel du titre 
    titre.add(area);    
    
    //Placement des panels
    splitPane.setLeftComponent(p);
    splitPane.setRightComponent(split2);
    split2.setTopComponent(titre);
    split2.setBottomComponent(panel);
    this.setContentPane(splitPane);
    this.setVisible(true);
    
     eleve.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonelevePerformed(evt);
            }
        }); 
     
     prof.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonprofPerformed(evt);
            }
        });
     
      classe.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonclassePerformed(evt);
            }
        });
     
     
  }
    private void jButtonelevePerformed(ActionEvent evt) {
                    
        AddEleve louis=new AddEleve();    
        this.setVisible(true);
    }
    
    private void jButtonprofPerformed(ActionEvent evt) {
        AddProf sensei=new AddProf();
        this.setVisible(true);
    }
    private void jButtonclassePerformed(ActionEvent evt) {
        AddClasse classe=new AddClasse();
        this.setVisible(true);
    }
}

