package com.pinguicursos.screenmatchapp.calculos;

public class FiltroRecomendaciones {

    public void filtrar(Clasificacion clasificacion){
        int i = 2;
        if (clasificacion.getClasificacion() >= 4){
            System.out.println("Super recomendado");
        } else if (clasificacion.getClasificacion() >= 2){
            System.out.println("Popular en el momento");
        } else {
            System.out.println("Se el primero en evaluarlo");
        }
    }
}
