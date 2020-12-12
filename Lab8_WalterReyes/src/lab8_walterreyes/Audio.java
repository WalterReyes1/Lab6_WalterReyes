/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8_walterreyes;

import static com.sun.glass.ui.Application.run;
import java.applet.AudioClip;
public class Audio extends Thread {
   AudioClip Sound;
   private boolean vive;
   private boolean avanzar;

    public Audio(boolean vive, boolean avanzar) {
        this.vive = vive;
        this.avanzar = avanzar;
    }

    public Audio() {
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }
   
   
   public void  canción(){
     
   
   
   }
   int cont= 1;
   @Override
   
    public void run(){
    
     while(vive){
         if(avanzar){
             // con este cont hago que la música no se repita mil veces hasta que explote. Aprendí por las malas.
             if(cont == 1){
           Sound = java.applet.Applet.newAudioClip(getClass().getResource("/lab8_walterreyes/Zelda-Main-Theme-Song.wav"));
            Sound.play();
            cont++;
                 
             }
         }
     }try{
         Thread.sleep(5000);

        } catch (InterruptedException ex) {
            
        }  
    
}
}
