package com.pinguicursos.screenmatchapp.principal;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.io.IOException;
import java.util.Scanner;

public class PrincipalConBusquedas {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner infoUsuario = new Scanner(System.in);
        System.out.println("Escriba el nombre de la pelicula que quiere buscar");
        var busqueda = infoUsuario.nextLine();
        busqueda = busqueda.replaceAll(" ","+");
        String url = "https://www.omdbapi.com/?apikey=64058bad&t=" + busqueda ;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }
}
