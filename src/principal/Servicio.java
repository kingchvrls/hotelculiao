package principal;

public class Servicio {
	
	//Atributos
	
	private String nombreServicio;
	private boolean disponibilidadServicio;
	
	
	//Constructores
	
	
	public Servicio() {
		
		nombreServicio = "NULL";
		disponibilidadServicio = false;
	}
	
	public Servicio(String nombreServicio,boolean disponibilidadServicio) {
		this.nombreServicio = nombreServicio;
		this.disponibilidadServicio = disponibilidadServicio;
	}
	
	//Getters y Setters
	
	
	public String getNombreServicio() {
		return nombreServicio;
	}
	public void setNombreServicio(String nombreServicio) {
		this.nombreServicio = nombreServicio;
	}

	public boolean getDisponibilidad() {
		return disponibilidadServicio;
	}
	public void setDisponibilidad(boolean disponibilidadServicio) {
		this.disponibilidadServicio = disponibilidadServicio;
	}
}
