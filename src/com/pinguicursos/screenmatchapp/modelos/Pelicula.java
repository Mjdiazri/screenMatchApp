package com.pinguicursos.screenmatchapp.modelos;

public class Pelicula {

        private String nombre;
        private int fechaLanzamiento;
        private int duracionEnMinutos;
        private boolean incluidoEnPlan;
        private double sumaCalificaciones;
        private int contadorCalificaciones;


        public void setNombre(String nombre) {
                this.nombre = nombre;
        }

        public void setDuracionEnMinutos(int duracionEnMinutos) {
                this.duracionEnMinutos = duracionEnMinutos;
        }

        public void setIncluidoEnPlan(boolean incluidoEnPlan) {
                this.incluidoEnPlan = incluidoEnPlan;
        }

        public void setFechaLanzamiento(int fechaLanzamiento) {
                this.fechaLanzamiento = fechaLanzamiento;
        }

        public String getNombre() {
                return nombre;
        }

        public int getFechaLanzamiento() {
                return fechaLanzamiento;
        }

        public int getDuracionEnMinutos() {
                return duracionEnMinutos;
        }

        public boolean isIncluidoEnPlan() {
                return incluidoEnPlan;
        }

        public int getContadorCalificaciones(){
                return contadorCalificaciones;
        }

        public void muestraFichaTecnica(){
                System.out.println("La pelicula se llama: " + nombre);
                System.out.println("Fecha de lanzamiento: " + fechaLanzamiento);
                System.out.println("Duracion: " + duracionEnMinutos);
        }


        public void evalua (double nota){
                sumaCalificaciones += nota;
                contadorCalificaciones ++;
        }

        public double calculaMedia(){
                return  sumaCalificaciones/contadorCalificaciones;
        }

}
