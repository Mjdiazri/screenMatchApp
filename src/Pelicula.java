public class Pelicula {

        public String nombre;
        public int fechaLanzamiento;
        public int duracionEnMinutos;
        public boolean incluidoEnPlan;

        void muestraFichaTecnica(){
                System.out.println("La pelicula se llama: " + nombre);
                System.out.println("Fecha de lanzamiento: " + fechaLanzamiento);
                System.out.println("Duracion: " + duracionEnMinutos);
        }

}
