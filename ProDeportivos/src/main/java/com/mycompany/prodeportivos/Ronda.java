package com.mycompany.prodeportivos;

public class Ronda {

	//Atributos de la Ronda
	int id_ronda;
	private int numronda;
		
	//Método Constructor
	public Ronda(int id_ronda, int numronda) {
		this.id_ronda = id_ronda;
		this.numronda = numronda;
	}
        
        //Imprime Datos de la ronda
        public void MostrarDatosRonda(){
		System.out.println("      Informacion de la ronda");
		System.out.println("------------------------------------");
                System.out.println("Ronda N° " + numronda);
        }
}
        