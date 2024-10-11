package com.pinguicursos.screenmatchapp.principal;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.pinguicursos.screenmatchapp.modelos.Titulo;
import com.pinguicursos.screenmatchapp.modelos.TituloOmdb;

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

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();
            System.out.println(json);

            //Opcion 1 Mostrar datos de json a clase
//           Gson gson = new Gson();
//           Titulo miTitulo = gson.fromJson(json, Titulo.class);
//           System.out.println(miTitulo);

            //Opcion 2 Mostrar datos de json a clase con record y builder
            Gson gson2 = new GsonBuilder()
                    .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                    .create();
            TituloOmdb miTituloOmdb = gson2.fromJson(json, TituloOmdb.class);
            System.out.println(miTituloOmdb);


            Titulo mititulo = new Titulo(miTituloOmdb);
            System.out.println("Titulo convertido : " + mititulo);
        } catch (NumberFormatException e) {
            System.out.println("Ocurrio un error: ");
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Error en la url, verifique la direccion");
        } catch (Exception e){
            System.out.println("Ocurrio un error inesperado");
        } finally {
            System.out.println("Finalizo la ejecucion del programa");
        }


    }
}
