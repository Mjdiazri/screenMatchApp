package com.pinguicursos.screenmatchapp.modelos;

import com.pinguicursos.screenmatchapp.calculos.Clasificacion;

public class Pelicula extends Titulo implements Clasificacion {
        private String director;
        private int duracionEnMinutos;

        public Pelicula(String nombre, int fechaLanzamiento, int duracionEnMinutos, boolean incluidoEnPlan, String director) {
                super(nombre, fechaLanzamiento,incluidoEnPlan);
                this.director = director;
        }

        public String getDirector() {
                return director;
        }

        public void setDirector(String director) {
                this.director = director;
        }

        public int getClasificacion(){
                return (int) (calculaMedia()/2);
        }

        @Override
        public String toString() {
                return "Pelicula: " + this.getNombre() + " (" + getFechaLanzamiento() + ")";
        }
}
