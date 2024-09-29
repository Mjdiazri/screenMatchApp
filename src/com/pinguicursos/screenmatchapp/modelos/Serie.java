package com.pinguicursos.screenmatchapp.modelos;

public class Serie extends Titulo{
    private int temporada;
    private int capitulosPorTemporada;
    private int minutosPorEpisodio;


    @Override
    public int getDuracionEnMinutos() {
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
