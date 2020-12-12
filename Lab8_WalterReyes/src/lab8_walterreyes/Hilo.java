
package lab8_walterreyes;

import javax.swing.JProgressBar;

/**
 *
 * @author hp
 */
public class Hilo extends Thread {
 private JProgressBar barra;
 private boolean avanzar;
 private boolean vive;
 private String multimedia;

    public String getMultimedia() {
        return multimedia;
    }

    public void setMultimedia(String multimedia) {
        this.multimedia = multimedia;
    }

    public Hilo(JProgressBar barra) {
        this.barra = barra;
        avanzar = true;
        vive =true;
        
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

    public Hilo() {
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }
 
 @Override
 public void run(){
    while(vive){
    
        if(avanzar){
          
          barra.setValue(barra.getValue()+1);
       //activar y modificar propiedad stringPainted para que esto funciones
        barra.setString("Ahora Reproduciendo "+multimedia+" "+Integer.toString(barra.getValue())+"%" );
        
        
        }try{
         Thread.sleep(500);

        } catch (InterruptedException ex) {
            
        }
        if(barra.getValue()==100){
            barra.setValue(0);
            barra.setString(Integer.toString(barra.getValue())+"%");
            break;
        }
    }  
    
}
}
