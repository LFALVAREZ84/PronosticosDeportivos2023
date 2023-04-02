package Clases;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Pronostico {
      /**
     * @param args
     */
    public void leerCSV(String[] args) {

        ArrayList<String> listacsv = new ArrayList();
        FileReader camino;
        BufferedReader lector;

        try {
            camino = new FileReader(
                    "C:\\Users\\Luisfa\\OneDrive\\Escritorio\\Arg-Programa-4.0\\PronosticosDeportivos\\src\\Datos\\resultados.csv");
            lector = new BufferedReader(camino);
            String linea;

            while ((linea = lector.readLine()) != null) {
                listacsv.add(linea);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println();
        System.out.println("-------------- Grupo C --------------");
        String lineacsv;
        for (int i = 1; i < listacsv.size(); i++) {
            lineacsv = listacsv.get(i);
            String[] Separado = lineacsv.split(";");
            System.out.println("Fecha " + i + " - " + Separado[1] + " vs " + Separado[6]);
        }
        System.out.println("-------------------------------------");
        System.out.println();
        System.out.println("---------- Fin del Programa ---------");
    }

}
