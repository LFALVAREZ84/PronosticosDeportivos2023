/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package utn.ar.tpintegrador.pronosticosdeportivos2023;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author LuisFA-Dev
 */
public class PronosticosDeportivos2023 {

    public static void main(String[] args) {
        System.out.println("");	
	System.out.print("---------- Comprobante Ticket N°1 ----------");
	System.out.println(); System.out.println();
	System.out.print("        Pronosticos Deportivos 2023");
	System.out.println(); System.out.println();
	System.out.print("--------------------------------------------");	
	
	ArrayList <String> lista1csv = new ArrayList<>();
	ArrayList <String> lista2csv = new ArrayList<>();
	FileReader resultados;
	FileReader pronosticos;
	BufferedReader lector1;
	BufferedReader lector2;	
	
	try {
		// Abrir el archivo resultados.csv
		resultados = new FileReader(args[0]);

		//Leer todas las filas del archivo resultados.csv
		lector1 = new BufferedReader(resultados);

		//Imprimir las filas del archivo resultados.csv
		String linea1;
			
			while ((linea1=lector1.readLine()) != null) {		
				lista1csv.add(linea1);				
			}
		
		// Cerrar archivo resultados.csv
		resultados.close();

		// Abrir el archivo pronosticos.csv
		pronosticos = new FileReader(args[1]);

		//Leer todas las filas del archivo pronosticos.csv
		lector2 = new BufferedReader(pronosticos);
		
		//Imprimir las filas del archivo pronosticos.csv
		String linea2;
					
			while ((linea2=lector2.readLine()) != null) {		
				lista2csv.add(linea2);				
			}
		
		// Cerrar archivo pronosticos.csv
		pronosticos.close();	

	} catch (IOException e) {
		System.out.println("Error: " + e.getMessage());
                System.exit(1);
	}
	
		System.out.println();			
		System.out.println("----------  Partidos del Grupo C  ----------");	
		System.out.println("--------------------------------------------");	
	
		String linea1csv;  
		String linea2csv;

		//Almacenar Equipos Ganadores
		String[] equipo = new String[20]; 
	
		//Imprimir arreglos del archivo resultados.csv		
		for (int i = 1 ; i < lista1csv.size(); i++) {
			linea1csv = lista1csv.get(i);			
			String[] Separado1 = linea1csv.split(";");
			if(i == 3) break; 		
			System.out.println("Partido "+i+" - "+Separado1[2]+" "+Separado1[3]+" vs "+Separado1[4]+" "+Separado1[5]);
			if(Integer.parseInt(Separado1[3]) > Integer.parseInt(Separado1[4])){
				equipo[i] = Separado1[2];
			} else if(Integer.parseInt(Separado1[3]) < Integer.parseInt(Separado1[4])) {
				equipo[i] = Separado1[5];
				} else {
					equipo[i] = "";
					}
			}
	
		System.out.println("--------------------------------------------");	
		System.out.println("                Su Apuesta");			
		System.out.println("--------------------------------------------");	
		
		//Almacenar Equipos de Pronostico
		String[] ganador = new String[20];

		//Imprimir arreglos del archivo pronostico.csv
		for (int j = 1 ; j < lista2csv.size() ; j++) {
			linea2csv = lista2csv.get(j);			
			String[] Separado2 = linea2csv.split(";");
			String coincidir = "X";
			if(j == 3) break;
			if(Separado2[2].equals(coincidir)) {
				ganador[j] = Separado2[1];
				System.out.println("El ganador del partido " + j + " será " + Separado2[1]);
			} else if(Separado2[4].equals(coincidir)) {
				ganador[j] = Separado2[5];
				System.out.println("Partido " + j + ", el ganador será " + Separado2[5]);
			} else {
				ganador[j] = "";	
				System.out.println("Partido " + j + ", términara en empate.");
			}
		}
		
		System.out.println("--------------------------------------------");	
		System.out.println();

		//Almacenar Puntaje
		int[] puntos = new int[20];
		for (int k = 1 ; k < 3 ; k++) {
			if(equipo[k].equals(ganador[k])){
			puntos[k] = 1;
			} else { 
			puntos[k] = 0;	
			}
		}
		
		//Imprimir Aciertos
		int total = 0;
		for (int p = 0 ; p < 3 ; p++) {
			total = total + puntos[p];
		}
	
		System.out.println("Total de aciertos: " + total);
		System.out.println();
		System.out.println("--------------------------------------------");
    }
}
