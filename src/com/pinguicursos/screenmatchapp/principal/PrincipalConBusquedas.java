package com.pinguicursos.screenmatchapp.principal;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.pinguicursos.screenmatchapp.exception.ErrorEnConversionDeDuracionException;
import com.pinguicursos.screenmatchapp.modelos.Titulo;
import com.pinguicursos.screenmatchapp.modelos.TituloOmdb;

import java.io.FileWriter;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalConBusquedas {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner infoUsuario = new Scanner(System.in);
        List<Titulo> titulos = new ArrayList<>();
        Gson gson2 = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        while (true){
            System.out.println("Escriba el nombre de la pelicula que quiere buscar");
            var busqueda = infoUsuario.nextLine();
            busqueda = URLEncoder.encode(busqueda, "UTF-8");
            //busqueda = busqueda.replaceAll(" ","+");

            if (busqueda.equalsIgnoreCase("salir")){
                break;
            }


            String url = "https://www.omdbapi.com/?apikey=64058bad&t=" + busqueda;
            System.out.println(url);
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

                TituloOmdb miTituloOmdb = gson2.fromJson(json, TituloOmdb.class);
                System.out.println("aca: " + miTituloOmdb);

                Titulo mititulo = new Titulo(miTituloOmdb);
                System.out.println("Titulo convertido : " + mititulo);

//                FileWriter escritura = new FileWriter("peliculas.txt");
//                escritura.write(mititulo.toString());
//                escritura.close();

                titulos.add(mititulo);

            } catch (NumberFormatException e) {
                System.out.println("Ocurrio un error: ");
                System.out.println(e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("Error en la url, verifique la direccion");
            } catch (ErrorEnConversionDeDuracionException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println(titulos);

        FileWriter escritura = new FileWriter("titulos.json");
        escritura.write(gson2.toJson(titulos));
        escritura.close();

        System.out.println("Finalizo el programa");
    }
}
