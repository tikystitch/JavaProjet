/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;

import java.awt.Button;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author louis
 */
public class Bouton {
    //declaration du bouton
    private Button bouton;
    public Bouton(){
        
         bouton = new Button();
    }
    public void addBouton(){
       
        bouton.setLabel("Ajouter");
        bouton.setFont(new Font("Arial",Font.BOLD,32));
        
        
        bouton.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutonActionPerformed(evt);
            }
        });   
    }
    
       public void suppBouton(){
        bouton = new Button();
        bouton.setLabel("Supprimer");
        bouton.setFont(new Font("Arial",Font.BOLD,32));
        
        
        bouton.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutonActionPerformed(evt);
            }
        });   
    }
    //action performed pour les boutons
    private void boutonActionPerformed(ActionEvent evt) {                                        
        // TODO add your handling code here:
      if(){
          
      }
        }
    
}
