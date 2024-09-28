public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();
        miPelicula.nombre = "Mars attack";
        miPelicula.fechaLanzamiento = 1996;
        miPelicula.duracionEnMinutos = 106;

        miPelicula.muestraFichaTecnica();

        Pelicula otraPelicula = new Pelicula();
        otraPelicula.nombre = "Matrix";
        otraPelicula.fechaLanzamiento = 1998;
        otraPelicula.duracionEnMinutos = 136;

        otraPelicula.muestraFichaTecnica();
    }
}
