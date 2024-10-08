package com.pinguicursos.screenmatchapp.principal;

import com.pinguicursos.screenmatchapp.modelos.Pelicula;
import com.pinguicursos.screenmatchapp.modelos.Serie;
import com.pinguicursos.screenmatchapp.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PrincipalConListas {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula("Mars attack", 1996,106,true,"Tim Burton" );
        miPelicula.evalua(8);
        Serie miSerie = new Serie("Ghost in the shell", 2002,true,2,26,25 );
        Pelicula otraPelicula = new Pelicula("Matrix",1998,136,true,"Las hermanas Wachowski");
        otraPelicula.evalua(9);
        var nuevaPelicula = new Pelicula("El señor de los anillos",2001,180,true,"Peter Robert Jackson");
        nuevaPelicula.evalua(7);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(miPelicula);
        lista.add(miSerie);
        lista.add(otraPelicula);
        lista.add(nuevaPelicula);

        //Mostrar calificacion op 1
//        for (Titulo item: lista){
//            System.out.println(item);
////            if(item instanceof Pelicula) {
//                Pelicula pelicula = (Pelicula) item;
//                System.out.println(pelicula.getClasificacion());
//            }


        //Mostrar calificacion op 2
            for (Titulo item : lista) {
                System.out.println(item.getNombre());
                if(item instanceof Pelicula pelicula && pelicula.getClasificacion() > 3){
                    System.out.println(pelicula.getClasificacion());

                }
            }

        List<String> listaDeArtistas = new ArrayList<>();   
            listaDeArtistas.add("Katheriz Zeta Jones");
            listaDeArtistas.add("Angelina Jolie");
            listaDeArtistas.add("Leonardo Di Caprio");
            listaDeArtistas.add("George Cloune");



        System.out.println("Lista desodenada artistas: " + listaDeArtistas);

        Collections.sort(listaDeArtistas);
        System.out.println("Lista ordenada artistas: " + listaDeArtistas);

        //Comparar peliculas
        Collections.sort(lista);
        System.out.println("Lista ordenada peliculas: " + lista);

        lista.sort(Comparator.comparing(Titulo::getFechaLanzamiento));
        System.out.println("Lista ordenada por fecha: " + lista);

    }
}
