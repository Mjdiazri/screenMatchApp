package com.pinguicursos.screenmatchapp.modelos;

public class Serie extends Titulo{
    private int temporada;
    private int capitulosPorTemporada;
    private int minutosPorEpisodio;
    private double totalMinutosSerie;

    public Serie(String nombre, int fechaLanzamiento, boolean incluidoEnPlan, int temporada, int capitulosPorTemporada, int minutosPorEpisodio) {
        super(nombre, fechaLanzamiento, incluidoEnPlan);
        this.temporada = temporada;
        this.capitulosPorTemporada = capitulosPorTemporada;
        this.minutosPorEpisodio = minutosPorEpisodio;
    }


    public int totalMinutosSerie() {
        return temporada * capitulosPorTemporada * minutosPorEpisodio;
    }

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    public int getCapitulosPorTemporada() {
        return capitulosPorTemporada;
    }

    public void setCapitulosPorTemporada(int capitulosPorTemporada) {
        this.capitulosPorTemporada = capitulosPorTemporada;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }
}
