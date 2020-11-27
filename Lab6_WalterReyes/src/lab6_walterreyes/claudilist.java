/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_walterreyes;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class claudilist {
 private String nombre;
 private ArrayList<Programas>Lista = new ArrayList();
 

   

    public claudilist(String nombre, ArrayList<Programas> Lista) {
        this.nombre = nombre;
        this.Lista = Lista;
        
    }

    public claudilist() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Programas> getLista() {
        return Lista;
    }

    public void setLista(ArrayList<Programas> Lista) {
        this.Lista = Lista;
    }

  

    @Override
    public String toString() {
        return  nombre ;
    }
    
  public void setProgramas(Programas p) {
        this.Lista.add(p);
    }
    
        public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        File archivo = new File("./" + getNombre() + ".txt");
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Programas t : Lista) {
                bw.write(t.getNombre() + "/");
                bw.write(t.getPuntuación() + "/");
                bw.write(t.getFecha() + "/");
                bw.write(t.getTipo() + "/");
                bw.write(t.getGenero() + "/");
                bw.newLine();
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        Lista = new ArrayList();
          File archivo = new File("./"+getNombre() + ".txt");
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter("/");
                while (sc.hasNext()) {
                    Lista.add(new Programas(sc.next(),
                            sc.nextInt(), sc.next(),
                            sc.next(), sc.next()
                    )
                    );
                }
            } catch (Exception ex) {
            }
            sc.close();
        }//FIN IF
    }
    
    //------------------------//
     
 
}
