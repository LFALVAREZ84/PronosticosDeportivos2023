package utn.ar.tpintegrador.pronosticosdeportivos2023;

public class Partido {
	
  //Atributos del partido
	int id_partido;
	String equipo;
	String equipo1;
	String equipo2;
	int golesEq1;
	int golesEq2;

        //Método Constructor
	public Partido(int id_partido, String equipo1, String equipo2, int golesEq1, int golesEq2) {
		this.id_partido = id_partido;
		this.equipo1 = equipo1;
		this.equipo2 = equipo2;
		this.golesEq1 = golesEq2;
		this.golesEq2 = golesEq2;
	}

	public void resultado(int id_partido){
		this.equipo1 = equipo;
	}
        
        //Imprime Datos del Partido
	public void MostrarDatosPartido(){
		System.out.println("      Informacion del partido");
		System.out.println("------------------------------------");	
		System.out.println("El equipo: " + equipo1 + "convirtio " + golesEq1 + " en el partido n° " + id_partido);
		System.out.println("El equipo: " + equipo2 + "convirtio " + golesEq2 + " en el partido n° " + id_partido);
		System.out.println();				
	}
}