import com.pinguicursos.screenmatchapp.calculos.TimeCalculator;
import com.pinguicursos.screenmatchapp.modelos.Pelicula;
import com.pinguicursos.screenmatchapp.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();
        miPelicula.setNombre("Mars attack");
        miPelicula.setFechaLanzamiento(1996);
        miPelicula.setDuracionEnMinutos(106);
        miPelicula.setIncluidoEnPlan(true);

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(10);
        miPelicula.evalua(0);
        miPelicula.evalua(5);
        System.out.println(miPelicula.calculaMedia());
        System.out.println(miPelicula.getContadorCalificaciones());


        Serie miSerie = new Serie();
        miSerie.setNombre("Ghost in the shell");
        miSerie.setFechaLanzamiento(2002);
        miSerie.setTemporada(2);
        miSerie.setMinutosPorEpisodio(25);
        miSerie.setCapitulosPorTemporada(26);

        System.out.println("*******************************************");
        miSerie.muestraFichaTecnica();
        System.out.println(miSerie.getDuracionEnMinutos());
        System.out.println("*******************************************");

        Pelicula otraPelicula = new Pelicula();
        otraPelicula.setNombre("Matrix");
        otraPelicula.setFechaLanzamiento(1998);
        otraPelicula.setDuracionEnMinutos(136);

        TimeCalculator calculadora = new TimeCalculator();
        calculadora.incluye(miPelicula);
        calculadora.incluye(miSerie);
        calculadora.incluye(otraPelicula);
        System.out.printf("El tiempo necesario para ver los titulos seleccionados es de %d minutos\n", calculadora.getTiempoTotal());
        System.out.println("*******************************************");




    }
}
