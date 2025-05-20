package ej4listaParametrosLarga;

public class ListaParametrosLarga {

    public void generarInforme(String nombre, int anioMatriculacion, String localidad, String provincia,
                               String ocupacion, double notaMediaAcceso, int convocatoriaActual,
                               boolean haRepetido, String formacionPrevia) {
        System.out.println("Nombre completo: " + nombre);
        System.out.println("Año de matriculacion: " + anioMatriculacion);
        System.out.println("Localidad: " + localidad);
        System.out.println("Provincia: " + provincia);
        System.out.println("Ocupación: " + ocupacion);
        System.out.println("Nota media de acceso: " + notaMediaAcceso);
        System.out.println("Convocatoria actual: " + convocatoriaActual);
        System.out.println("Ha repetido curso: " + (haRepetido ? "Sí" : "No"));
        System.out.println("Formación previa: " + formacionPrevia);
    }

}
