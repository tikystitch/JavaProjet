/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.*;
/**
 *
 * @author louis
 */
public class AddEleve extends JFrame{
    private JPanel pan= new JPanel();
    

    //declaration du bouton
    private Button add;
    
    //declaration des labels
    private JLabel jLabelNom;
    private JLabel jLabelPrenom;
    private JLabel jLabelClasse;
    private JLabel jLabelBulletin;
    private JLabel jLabelTitre;
    private JLabel jLabelNiveau;
    
    //declaration des zones de texte
    private JTextField jTextFieldNom;
    private JTextField jTextFieldPrenom;
    private JTextField jTextFieldClasse;
    private JTextField jTextFieldBulletin;
    
    String[] items = {"item1", "item2"};
    JComboBox LeNomDeTaComboBox = new JComboBox(items);
    
    public AddEleve(){
    /*this.setTitle("Ajouter un élève");
    this.setSize(600, 800);
    this.setLocationRelativeTo(null);
    JPanel pan =new JPanel();
    pan.setBackground(Color.ORANGE);
    this.setContentPane(pzn);
    
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);             
    this.setVisible(true);*/
    
    //Initialisation de la feunetre et du panel
    this.setTitle("Ajouter un élève");
    this.setSize(600, 800);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLocationRelativeTo(null);
    
    JPanel formulaire = new JPanel() ;
    
    //declaration du splitpanel
    JSplitPane splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
    
     formulaire.setBounds(0, 0, 600, 800);
   // formulaire.setLayout(new BorderLayout());
  
        //declaration des composants
    
        jTextFieldNom = new JTextField();
        jTextFieldPrenom = new JTextField();
        jTextFieldClasse = new JTextField();
        jTextFieldBulletin = new JTextField();
        jLabelNom = new JLabel();
        jLabelPrenom = new JLabel();
        jLabelClasse = new JLabel();
        jLabelBulletin = new JLabel();
        jLabelTitre = new JLabel();
        add = new Button();
        
        //instanciation des composants
        jLabelNom.setText("Nom");
        jLabelNom.setFont(new Font("Arial",Font.BOLD,32));
        jLabelNom.setHorizontalAlignment(0);
        
        jTextFieldNom.setFont(new Font("Arial",Font.BOLD,32));
        jTextFieldNom.setHorizontalAlignment(0);
        
        jLabelPrenom.setText("Prénom");
        jLabelPrenom.setFont(new Font("Arial",Font.BOLD,32));
        jLabelPrenom.setHorizontalAlignment(0);
        
        jTextFieldPrenom.setFont(new Font("Arial",Font.BOLD,32));
        jTextFieldPrenom.setHorizontalAlignment(0);
        
        
        jLabelClasse.setText("Classe");
        jLabelClasse.setFont(new Font("Arial",Font.BOLD,32));
        jLabelClasse.setHorizontalAlignment(0);
        
        jTextFieldClasse.setFont(new Font("Arial",Font.BOLD,32));
        jTextFieldClasse.setHorizontalAlignment(0);
        
        jLabelBulletin.setText("Bulletin");
        jLabelBulletin.setFont(new Font("Arial",Font.BOLD,32));
        jLabelBulletin.setHorizontalAlignment(0);
        
        jTextFieldBulletin.setFont(new Font("Arial",Font.BOLD,32));
        jTextFieldBulletin.setHorizontalAlignment(0);
        
        jLabelTitre.setText("Ajouter un élève");
        jLabelTitre.setFont(new Font("Arial",Font.BOLD,32));
        jLabelTitre.setHorizontalAlignment(0);
        
       // jTextFieldTitre.setFont(new Font("Arial",Font.BOLD,32));
        add.setLabel("Ajouter");
        add.setFont(new Font("Arial",Font.BOLD,32));
       
        //pan.add(jLabelTitre);
        formulaire.add(jLabelNom);
        formulaire.add(jTextFieldNom);
        formulaire.add(jLabelPrenom);
        formulaire.add(jTextFieldPrenom);
        formulaire.add(jLabelClasse);
        formulaire.add(jTextFieldClasse);
        formulaire.add(jLabelBulletin);
        formulaire.add(jTextFieldBulletin);        
        formulaire.add(add);
        
        
        //pan.add(formulaire);
        pan.add(new JScrollPane(formulaire));
        //pan.add(add);
        //formulaire.add(add, BorderLayout.NORTH);
        
        formulaire.setLayout(new GridLayout(5,1));
        
        jTextFieldNom.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomActionPerformed(evt);
            }
        });

        jTextFieldPrenom.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPrenomActionPerformed(evt);
            }
        });

        jTextFieldClasse.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldClasseActionPerformed(evt);
            }
        });
        
        jTextFieldBulletin.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBulletinActionPerformed(evt);
            }
        });
        
        add.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        
        splitPane.setTopComponent(jLabelTitre);
        splitPane.setBottomComponent(formulaire);
        //splitPane.setBottomComponent(add);
    this.setContentPane(splitPane);
    this.setVisible(true);
    }
    
    private void jTextFieldNomActionPerformed(ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void jTextFieldPrenomActionPerformed(ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void addActionPerformed(ActionEvent evt) {                                        
        // TODO add your handling code here:
        this.setVisible(false);
        this.dispose();
        //setDefaultCloseOperation(AddEleve.EXIT_ON_CLOSE);
    }                                       

    private void jTextFieldClasseActionPerformed(ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void jTextFieldBulletinActionPerformed(ActionEvent evt) {                                            
        // TODO add your handling code here:
    }
    
}
