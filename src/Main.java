import Clases.Partido;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("----------- Bienvenido a ------------");
        System.out.println("     Pronósticos Deportivos 2023");
        System.out.println("-------------------------------------");
        System.out.println();
        System.out.println("Para realizar una apuesta elige a un");
        System.out.println("equipo ganador por fecha. En caso de");
        System.out.println("empate escribe (empate). y presiona");
        System.out.println("la tecla 'enter'.");
        Partido fecha = new Partido();
        fecha.leerCSV(args);
    }
}
