/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javagraphiquetest;
import javax.swing.JFrame;


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
    this.setVisible(true);
  }
}

