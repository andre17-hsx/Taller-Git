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
    
    //=====> Scanner sc= new Scanner(System.in);
    
    public void reproducir(){
        String continuar = "no";
        int reproducciones=0;
        int indiceActual=0;
        Video videoActual;
        
        Scanner sc= new Scanner(System.in);
        
        do{
            
            /*==>for(Video v: listaReproduccion){
                    if (v!=null){
                       getnombre(v);
                       reproducciones +=1;
                       listaReproduccion.remove(reproducciones);   
                } 
            ==>}*/
            
 
            
            //obtengo el primer video de la lista - use metodo get
                if(indiceActual<listaReproduccion.size()){
                    videoActual=listaReproduccion.get(indiceActual);
                    //muestro el video
                    videoActual.mostrarInformacion();
                    //Incremento numero de Reproduccione
                        reproducciones=videoActual.getNumeroReproducciones();
                        videoActual.setNumeroReproducciones(reproducciones+1);
                        System.out.println("\nReproduciendo video : "+ videoActual.getnombre());
                        System.out.println("Reproducciones      : "+videoActual.getNumeroReproducciones());
                                listaReproduccion.remove(indiceActual);                       
                }else if(listaReproduccion.size()==0){
                
                    System.out.println("La lista está vacia...!");
                }
                
 
            System.out.println("\nDesea reproducir el siguiente?");
            System.out.print("Ingrese <s> para seguir, o Ingrense cualquier caracter para salir: ");
            continuar=sc.nextLine();

            
        }while((continuar.toUpperCase().equals("S")));
        
        sc.close();
    }
}