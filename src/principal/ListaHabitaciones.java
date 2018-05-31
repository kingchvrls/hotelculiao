package principal;
//en Hotel
public class ListaHabitaciones {
	private ArrayList <Habitacion> habitaciones;
	private int numeroHabitaciones;

	//constructores
	
	public ListaHabitaciones(){
		
		numeroHabitaciones=0;
		habitaciones=new ArrayList<Habitacion>();
		
	}
	
	// getters y setters
	
	public int getNumeroHabitaciones() {
		return numeroHabitaciones;
	}
	public void setNumeroHabitaciones(int numeroHabitaciones) {
		this.numeroHabitaciones = numeroHabitaciones;
	}
}
