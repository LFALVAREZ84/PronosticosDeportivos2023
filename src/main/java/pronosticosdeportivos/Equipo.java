package pronosticosdeportivos;

public class Equipo {

	//Atributos del equipo de fútbol
	int id_equipo;
	private String nombre;
	private String descripcion;
	
	//Método Constructor
	public Equipo(int id_equipo, String nombre, String descripcion) {
		this.id_equipo = id_equipo;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	public void MostrarDatosEquipo(){
		System.out.println("      Informacion del equipo");
		System.out.println("------------------------------------");	
		System.out.println("Nombre: " + nombre);
		System.out.println("Descripcion: " + descripcion);
		System.out.println();
		
	}
}