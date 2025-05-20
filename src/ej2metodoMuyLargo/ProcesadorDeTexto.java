package ej2metodoMuyLargo;

import java.util.HashMap;
import java.util.Map;

public class ProcesadorDeTexto {

    public void procesarDocumento(String documento) {
        if (documento == null || documento.isEmpty()) {
            System.out.println("Documento vacío.");
            return;
        }

        String[] lineas = documento.split("\\n");
        int numeroDeLineas = lineas.length;
        int numeroDePalabras = 0;
        int numeroDeCaracteres = documento.length();
        Map<String, Integer> frecuenciaPalabras = new HashMap<>();

        for (String linea : lineas) {
            String[] palabras = linea.trim().split("\\s+");
            numeroDePalabras += palabras.length;
            for (String palabra : palabras) {
                palabra = palabra.toLowerCase().replaceAll("[^a-záéíóúüñ]", "");
                if (!palabra.isEmpty()) {
                    frecuenciaPalabras.put(palabra, frecuenciaPalabras.getOrDefault(palabra, 0) + 1);
                }
            }
        }

        System.out.println("Líneas: " + numeroDeLineas);
        System.out.println("Palabras: " + numeroDePalabras);
        System.out.println("Caracteres: " + numeroDeCaracteres);
        System.out.println("Frecuencia de palabras:");
        for (Map.Entry<String, Integer> entrada : frecuenciaPalabras.entrySet()) {
            System.out.println(entrada.getKey() + ": " + entrada.getValue());
        }
    }
}
