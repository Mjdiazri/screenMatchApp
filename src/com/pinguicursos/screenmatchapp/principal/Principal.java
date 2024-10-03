package com.pinguicursos.screenmatchapp.principal;

import com.pinguicursos.screenmatchapp.calculos.FiltroRecomendaciones;
import com.pinguicursos.screenmatchapp.modelos.Episodio;
import com.pinguicursos.screenmatchapp.modelos.Pelicula;
import com.pinguicursos.screenmatchapp.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {


        Pelicula miPelicula = new Pelicula("Mars attack", 1996,106,true,"Tim Burton" );
                miPelicula.muestraFichaTecnica();
        miPelicula.evalua(10);
        miPelicula.evalua(0);
        miPelicula.evalua(5);
        System.out.println(miPelicula.calculaMedia());
        System.out.println(miPelicula.getContadorCalificaciones());


        Serie miSerie = new Serie("Ghost in the shell", 2002,true,2,26,25 );
                System.out.println("*******************************************");
        miSerie.muestraFichaTecnica();
        System.out.println(miSerie.totalMinutosSerie());
        System.out.println("*******************************************");

        Pelicula otraPelicula = new Pelicula("Matrix",1998,136,true,"Las hermanas Wachowski");


//        TimeCalculator calculadora = new TimeCalculator();
//        calculadora.incluye(miPelicula);
//        calculadora.incluye(miSerie);
//        calculadora.incluye(otraPelicula);
//        System.out.printf("El tiempo necesario para ver los titulos seleccionados es de %d minutos\n", calculadora.getTiempoTotal());
//        System.out.println("*******************************************");

        FiltroRecomendaciones mifiltro = new FiltroRecomendaciones();
        mifiltro.filtrar(miPelicula);
        System.out.println("*******************************************");

        Episodio miepisodio = new Episodio();
        miepisodio.setNumeroEpisodio(1);
        miepisodio.setNombreEpisodio("Stay alone");
        miepisodio.setSerie(miSerie);
        miepisodio.setTotalVisualizaciones(300);

        mifiltro.filtrar(miepisodio);

        var nuevaPelicula = new Pelicula("El señor de los anillos",2001,180,true,"Peter Robert Jackson");

        ArrayList<Pelicula> listaDePeliculas = new ArrayList<>();
        listaDePeliculas.add(miPelicula);
        listaDePeliculas.add(otraPelicula);
        listaDePeliculas.add(nuevaPelicula);

        System.out.println("*******************************************");
        System.out.println("Tamaño de la lista: " + listaDePeliculas.size());
        System.out.println("Primera pelicula de la lista: " + listaDePeliculas.get(0).getNombre());

        System.out.println("*******************************************");
        System.out.println(listaDePeliculas);
        System.out.println(listaDePeliculas.toString());
        System.out.println("toString de la pelicula: " + listaDePeliculas.get(0).toString());

    }
}
