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
import modele.Classe;
import modele.Prof;

/**
 *
 * @author louis
 */
public class AddClasse extends JFrame{
     private JPanel pan= new JPanel();
    

    //declaration du bouton
    private Button add;
    
    //declaration des labels
    private JLabel jLabelNom;
    private JLabel jLabelNiveau;
    private JLabel jLabelAnneeScol;
    private JLabel jLabelTitre;
    
    //declaration des zones de texte
    private JTextField jTextFieldNom;
    private JTextField jTextFieldNiveau;
    private JTextField jTextFieldAnneeScol;
    
    String[] niveau = {"seconde", "premiere","terminale"};
    JComboBox comboniveau = new JComboBox(niveau);
    
    public AddClasse(){
    
    //Initialisation de la feunetre et du panel
    this.setTitle("Ajouter une classe");
    this.setSize(600, 800);
    this.setLocationRelativeTo(null);
    JPanel formulaire = new JPanel() ;
    //declaration du splitpanel
    JSplitPane splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
    
    
      formulaire.setBounds(0, 0, 600, 800);
   // formulaire.setLayout(new BorderLayout());
  
        //declaration des composants
    
        jTextFieldNom = new JTextField();
        jTextFieldNiveau = new JTextField();
        jTextFieldAnneeScol = new JTextField();
        
        jLabelNom = new JLabel();
        jLabelNiveau = new JLabel();
        jLabelAnneeScol = new JLabel();
        jLabelTitre = new JLabel();
        add = new Button();
        
        //instanciation des composants
        jLabelNom.setText("Nom");
        jLabelNom.setFont(new Font("Arial",Font.BOLD,32));
        jLabelNom.setHorizontalAlignment(0);
        
        jTextFieldNom.setFont(new Font("Arial",Font.BOLD,32));
        jTextFieldNom.setHorizontalAlignment(0);
        
        jLabelNiveau.setText("Niveau");
        jLabelNiveau.setFont(new Font("Arial",Font.BOLD,32));
        jLabelNiveau.setHorizontalAlignment(0);
        
        jTextFieldNiveau.setFont(new Font("Arial",Font.BOLD,32));
        jTextFieldNiveau.setHorizontalAlignment(0);
        
        
        jLabelAnneeScol.setText("Année scolaire");
        jLabelAnneeScol.setFont(new Font("Arial",Font.BOLD,32));
        jLabelAnneeScol.setHorizontalAlignment(0);
        
        jTextFieldAnneeScol.setFont(new Font("Arial",Font.BOLD,32));
        jTextFieldAnneeScol.setHorizontalAlignment(0);
               
        jLabelTitre.setText("Ajouter une classe");
        jLabelTitre.setFont(new Font("Arial",Font.BOLD,32));
        jLabelTitre.setHorizontalAlignment(0);
        
       // jTextFieldTitre.setFont(new Font("Arial",Font.BOLD,32));
        add.setLabel("Ajouter");
        add.setFont(new Font("Arial",Font.BOLD,32));
       
        //pan.add(jLabelTitre);
        formulaire.add(jLabelNom);
        formulaire.add(jTextFieldNom);
        formulaire.add(jLabelNiveau);
        formulaire.add(comboniveau);
        formulaire.add(jLabelAnneeScol);
        formulaire.add(jTextFieldAnneeScol);
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
        DAO<Classe> classe=DAOFactory.getClasseDAO();
        String nom=jTextFieldNom.getText();
        String niveau= comboniveau.getSelectedItem().toString();
        // int anneescol=jTextFieldAnneeScol.getText();
        String anneescol=jTextFieldAnneeScol.getText();
        
        Classe newclasse;
        newclasse = new Classe(0,nom,niveau,anneescol);
        classe.add(newclasse);
        this.dispose();
        
    }
}
