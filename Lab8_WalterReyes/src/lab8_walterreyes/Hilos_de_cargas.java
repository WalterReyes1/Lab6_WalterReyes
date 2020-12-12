/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8_walterreyes;

import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.JTable;

import javax.swing.JButton;

/**
 *
 * @author hp
 */
public class Hilos_de_cargas extends Thread{
    private JProgressBar barra;
 private boolean avanzar;
 private boolean vive;
 private int cont;
 private JTable tabla;
 private boolean aiuda;
 private JButton botoncito;
    public boolean isAiuda() {
        return aiuda;
    }

    public JButton getBotoncito() {
        return botoncito;
    }

    public void setBotoncito(JButton botoncito) {
        this.botoncito = botoncito;
    }

    public void setAiuda(boolean aiuda) {
        this.aiuda = aiuda;
    }

    public JTable getTabla() {
        return tabla;
    }

    public void setTabla(JTable tabla) {
        this.tabla = tabla;
    }

    public Hilos_de_cargas() {
    }

    public Hilos_de_cargas(JProgressBar barra) {
        this.barra = barra;
        avanzar = true;
        vive = true;
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }

    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }
        
    
    @Override
  public void run(){
          barra.setMaximum(100);
    while(vive){
    
        if(avanzar){
          barra.setValue(barra.getValue()+1);
       //activar y modificar propiedad stringPainted para que esto funciones
        barra.setString("Manipulando Archivo "+Integer.toString(barra.getValue())+"%" );
        if(barra.getValue()==100){
            botoncito.setVisible(true);
            botoncito.doClick();
            barra.setValue(0);
            break;
        }
        
        }try{
         Thread.sleep(50);

        } catch (InterruptedException ex) {
            
        }
        
        
    }  
    
}
    
    
  public void bandera(boolean k){
      
  }
}
