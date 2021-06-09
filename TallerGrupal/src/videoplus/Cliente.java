/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videoplus;
import java.util.Scanner;
import java.util.ArrayList;

public class Cliente {
    private ArrayList<Video> listaReproduccion;
    private String nombre;
    
    public Cliente(String nombre){
        this.nombre = nombre;
        listaReproduccion = new ArrayList<>();
        
    }
    public boolean agregarLista(Video v){
        if(listaReproduccion.size()<5){
            listaReproduccion.add(v);
            return true;
        }
        return false;
    }
    
    Scanner sc= new Scanner(System.in);
    
    public void reproducir(){
        String continuar = "no";
        int reproducciones=0;
        do{
            for(Video v: listaReproduccion){
                if (v!=null){
                    getnombre(v);
                    reproducciones +=1;
                    listaReproduccion.remove(reproducciones);   
                } 
            }
            System.out.print("Desea continuar?");
            continuar=sc.nextLine();
        }while(continuar.equals("si"));
    }
}