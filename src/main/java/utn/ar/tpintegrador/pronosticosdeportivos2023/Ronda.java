package utn.ar.tpintegrador.pronosticosdeportivos2023;

public class Ronda {

	//Atributos de la Ronda
	int idronda;
	private final int numronda;
		
	//Método Constructor
	public Ronda(int id_ronda, int numronda) {
            super();
            this.idronda = id_ronda;
            this.numronda = numronda;
	}
        
        public Integer getidronda() {
        return idronda;
         }
        
        public Integer getnumronda() {
        return numronda;
         }
        
        //Imprime Datos de la ronda
        public void MostrarDatosRonda(){
		System.out.println("      Informacion de la ronda");
		System.out.println("------------------------------------");
                System.out.println("Ronda N° " + numronda);
        }
}        