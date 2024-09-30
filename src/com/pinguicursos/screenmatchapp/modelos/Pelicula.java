package com.pinguicursos.screenmatchapp.modelos;

import com.pinguicursos.screenmatchapp.calculos.Clasificacion;

public class Pelicula extends Titulo implements Clasificacion {

        private String director;

        public String getDirector() {
                return director;
        }

        public void setDirector(String director) {
                this.director = director;
        }

        public int getClasificacion(){
                return (int) (calculaMedia()/2);
        }


}
