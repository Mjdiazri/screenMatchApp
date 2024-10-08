package com.pinguicursos.screenmatchapp.modelos;

public class Titulo implements Comparable<Titulo>{
    private String nombre;
    private int fechaLanzamiento;
    private boolean incluidoEnPlan;
    private double sumaCalificaciones;
    private int contadorCalificaciones;

    public Titulo(String nombre, int fechaLanzamiento, boolean incluidoEnPlan) {
        this.nombre = nombre;
        this.fechaLanzamiento = fechaLanzamiento;
        this.incluidoEnPlan = incluidoEnPlan;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

       public boolean isIncluidoEnPlan() {
        return incluidoEnPlan;
    }

    public int getContadorCalificaciones(){
        return contadorCalificaciones;
    }

    public void muestraFichaTecnica(){
        System.out.println("La pelicula se llama: " + nombre);
        System.out.println("Fecha de lanzamiento: " + fechaLanzamiento);
    }


    public void evalua (double nota){
        sumaCalificaciones += nota;
        contadorCalificaciones ++;
    }

    public double calculaMedia(){
        return  sumaCalificaciones/contadorCalificaciones;
    }

    @Override
    public int compareTo(Titulo otroTitulo) {
        return this.getNombre().compareTo(otroTitulo.getNombre());
    }
}
