import com.pinguicursos.screenmatchapp.modelos.Pelicula;

public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();
        miPelicula.setNombre("Mars attack");
        miPelicula.setFechaLanzamiento(1996);
        miPelicula.setDuracionEnMinutos(106);
        miPelicula.setIncluidoEnPlan(true);

//        miPelicula.muestraFichaTecnica();
//        miPelicula.evalua(10);
//        miPelicula.evalua(0);
//        miPelicula.evalua(5);
//        System.out.println(miPelicula.calculaMedia());
//        System.out.println(miPelicula.getContadorCalificaciones());

        System.out.println(miPelicula.getNombre());
        System.out.println(miPelicula.getDuracionEnMinutos());
        System.out.println(miPelicula.getFechaLanzamiento());
        System.out.println(miPelicula.isIncluidoEnPlan());


//        com.pinguicursos.screenmatchapp.modelos.Pelicula otraPelicula = new com.pinguicursos.screenmatchapp.modelos.Pelicula();
//        otraPelicula.nombre = "Matrix";
//        otraPelicula.fechaLanzamiento = 1998;
//        otraPelicula.duracionEnMinutos = 136;
//
//        otraPelicula.muestraFichaTecnica();
    }
}
