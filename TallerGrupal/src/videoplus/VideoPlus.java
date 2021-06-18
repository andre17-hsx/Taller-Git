/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videoplus;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author rocio
 */
public class VideoPlus {
    
    public static void main(String[] args){
        Cliente c = new Cliente("jose");
        ArrayList<Video> videos = new ArrayList<Video>();
        videos.add(new Video("Cruela"));
        videos.add(new Video("Lazo While"));
        videos.add(new Video("El rey Leon"));
        videos.add(new Video("Chapie"));
        videos.add(new Video("Blanca Nieves"));
        videos.add(new Video("Buscando a neno"));
        
        for (Video v: videos){
            boolean valor=c.agregarLista(v);
        }

        c.reproducir();

    }
}
