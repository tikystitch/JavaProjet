/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;

import controleur.DAO;
import controleur.DAOFactory;
import java.awt.Button;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextField;
import modele.Eleve;
import modele.Prof;

/**
 *
 * @author louis
 */
public class AddProf extends JFrame{
    private JPanel pan= new JPanel();
    

    //declaration du bouton
    private Button add;
    
    //declaration des labels
    private JLabel jLabelNom;
    private JLabel jLabelPrenom;
    private JLabel jLabelMatiere;
    private JLabel jLabelTitre;

    
    //declaration des zones de texte
    private JTextField jTextFieldNom;
    private JTextField jTextFieldPrenom;
    
    
    String[] matiere = {"mathématiques", "physique"};
    JComboBox combomatiere = new JComboBox(matiere);
    
    public AddProf(){
    
    //Initialisation de la feunetre et du panel
    this.setTitle("Ajouter un prof");
    this.setSize(600, 800);
    this.setLocationRelativeTo(null);
    JPanel formulaire = new JPanel() ;
    //declaration du splitpanel
    JSplitPane splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
    
    
      formulaire.setBounds(0, 0, 600, 800);
   // formulaire.setLayout(new BorderLayout());
  
        //declaration des composants
    
        jTextFieldNom = new JTextField();
        jTextFieldPrenom = new JTextField();
        
        jLabelNom = new JLabel();
        jLabelPrenom = new JLabel();
        jLabelMatiere=new JLabel();
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
        
        jLabelMatiere.setText("Matière");
        jLabelMatiere.setFont(new Font("Arial",Font.BOLD,32));
        jLabelMatiere.setHorizontalAlignment(0);
        
        combomatiere.setFont(new Font("Arial",Font.BOLD,32));
        combomatiere.setAlignmentX(120);
        
               
        jLabelTitre.setText("Ajouter un professeur");
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
        formulaire.add(jLabelMatiere);
        formulaire.add(combomatiere);
        formulaire.add(add);
        
        
        //pan.add(formulaire);
        pan.add(new JScrollPane(formulaire));
        //pan.add(add);
        //formulaire.add(add, BorderLayout.NORTH);
        
        formulaire.setLayout(new GridLayout(5,1));
        
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

    private void addActionPerformed(ActionEvent evt) {                                        
        // TODO add your handling code here:
        DAO<Prof> prof=DAOFactory.getProfDAO();
        String nom=jTextFieldNom.getText();
        String prenom= jTextFieldPrenom.getText();
        
        if (combomatiere.getSelectedItem().toString()=="mathématiques"){
            int idmatiere=10;
            Prof newprof;
        newprof = new Prof(0,nom,prenom, idmatiere);
        prof.add(newprof);
        }
        else if (combomatiere.getSelectedItem().toString()=="physique"){
            int idmatiere=11;
            Prof newprof;
        newprof = new Prof(0,nom,prenom, idmatiere);
        prof.add(newprof);
        }
        this.dispose();
        
    }
}
