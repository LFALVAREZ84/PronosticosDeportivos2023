/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prodeportivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author LFALVAREZ
 */
public class ProDeportivos {

    public static void main(String[] args) {
        System.out.println("");	
	System.out.print("------------- Segunda Entrega --------------");
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
		// Abre el archivo resultados.csv
		resultados = new FileReader("/home/LFALVAREZ/NetBeansProjects/ProDeportivos/src/main/java/com/mycompany/prodeportivos/BaseDeDatos/resultados.csv");

		//Lee todas las filas del archivo resultados.csv
		lector1 = new BufferedReader(resultados);

		//Imprime las filas del archivo resultados.csv
		String linea1;
			
			while ((linea1=lector1.readLine()) != null) {		
				lista1csv.add(linea1);				
			}
		
		// Cerrar archivo resultados.csv
		resultados.close();

		// Abre el archivo pronosticos.csv
		pronosticos = new FileReader("/home/LFALVAREZ/NetBeansProjects/ProDeportivos/src/main/java/com/mycompany/prodeportivos/BaseDeDatos/pronosticos.csv");

		//Lee todas las filas del archivo pronosticos.csv
		lector2 = new BufferedReader(pronosticos);
		
		//Imprime las filas del archivo pronosticos.csv
		String linea2;
					
			while ((linea2=lector2.readLine()) != null) {		
				lista2csv.add(linea2);				
			}
		
		// Cerrar archivo pronosticos.csv
		pronosticos.close();	

	} catch (IOException e) {
		System.out.println("Error: " + e.getMessage());
	}
                //Imprime por pantalla los resultados de los partidos finalizados
		System.out.println();			
		System.out.println("--------- Resultados de Partidos -----------");	
		System.out.println("--------------------------------------------");	
	
		String linea1csv;  
		String linea2csv;

		//Almacenar Equipos Ganadores del archivo resultados.csv
		String[] equipo = new String[20];
	
		//Imprimie arreglos del archivo resultados.csv		
		for (int i = 1 ; i < lista1csv.size(); i++) {
			linea1csv = lista1csv.get(i);			
			String[] Separado1 = linea1csv.split(";");
			if(i == 5) break; 		
			System.out.println("Partido "+i+" - "+Separado1[4]+" "+Separado1[5]+" vs "+Separado1[6]+" "+Separado1[7]);
			if(Integer.parseInt(Separado1[5]) > Integer.parseInt(Separado1[6])){
				equipo[i] = Separado1[4];
			} else if(Integer.parseInt(Separado1[5]) < Integer.parseInt(Separado1[6])) {
				equipo[i] = Separado1[7];
				} else {
					equipo[i] = "";
					}
			}
	
		//Almacenar Equipos y Participantes de Pronostico
		String[] ganador = new String[20];
                String[] participante = new String[20];
                
		//Almacena arreglos del archivo pronostico.csv
		for (int j = 1 ; j < lista2csv.size() ; j++) {
			linea2csv = lista2csv.get(j);			
			String[] Separado2 = linea2csv.split(";");
			String coincidir = "X";
			if(j == 9) break;
			if(Separado2[4].equals(coincidir)) {
				ganador[j] = Separado2[3];
                                participante[j] = Separado2[1];
			} else if(Separado2[6].equals(coincidir)) {
				ganador[j] = Separado2[7];
                                participante[j] = Separado2[1];
			} else {
				ganador[j] = "";	
                                participante[j] = Separado2[1];
			}
		}
		
                //Imprime por pantalla las Apuestas de Mariana
                System.out.println("--------------------------------------------");	
		System.out.println("              Apuesta " + participante[1]);			
		System.out.println("--------------------------------------------");
                
                for (int m = 1 ; m < 9 ; m++) {
			if(ganador[m].equals("")) {
				System.out.println(participante[1]+" - Partido "+m+" - Términara en empate.");
                                if(m==4) break; 
			} else {
				System.out.println(participante[1]+" - Partido "+m+" - Ganador: " + ganador[m]+".");
                                if(m==4) break;
			}
		}               
                
		System.out.println();

		//Almacenar el Puntaje de Mariana
		int[] puntosmar = new int[10];
		for (int k = 1 ; k < 5 ; k++) {
			if(equipo[k].equals(ganador[k])){
			puntosmar[k] = 1;
			} else { 
			puntosmar[k] = 0;	
			}
		}
                
                //Imprime los Aciertos de Mariana
		int totalm = 0;
		for (int m = 0 ; m < 5 ; m++) {
			totalm = totalm + puntosmar[m];
		}
	
		System.out.println("Total de aciertos: " + totalm);
		System.out.println("--------------------------------------------");
                
                //Imprime por pantalla las Apuestas de Pedro
                System.out.println("               Apuesta " + participante[5]);			
		System.out.println("--------------------------------------------");
                
                for (int p = 5 ; p < 9 ; p++) {
			if(ganador[p].equals("")) {
                            	System.out.println(participante[5]+" - Partido "+(p-4)+" - Términara en empate.");
                	} else {
                            	System.out.println(participante[5]+" - Partido "+(p-4)+" - Ganador: " + ganador[p]+".");
                	}
		}
                
		System.out.println();
                                         
                //Almacenar el Puntaje de Pedro
		int[] puntosped = new int[10];
		for (int l = 1 ; l < 5 ; l++) {
			if(equipo[l].equals(ganador[l+4])){
			puntosped[l] = 1;
			} else { 
			puntosped[l] = 0;	
			}
		}     

		//Imprime los Aciertos de Pedro
		int totalp = 0;
		for (int p = 0 ; p < 5 ; p++) {
			totalp = totalp + puntosped[p];
		}
	
		System.out.println("Total de aciertos: " + totalp);
		System.out.println("--------------------------------------------");
                System.out.println();
                
                if(totalm>totalp){
                    System.out.println("¡"+participante[1]+" obtuvo mayor cantidad de aciertos!");                    
                } else if(totalm<totalp){
                    System.out.println("¡"+participante[5]+" obtuvo mayor cantidad de aciertos!");
                } else {
                    System.out.println("    ¡Ambos obtuvieron la misma cantidad");
                    System.out.println("               de aciertos!");
                }
                    System.out.println();
                    System.out.println("-------------Fin del Programa---------------");
    }
}