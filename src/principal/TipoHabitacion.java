package principal;

import java.util.ArrayList;

public class TipoHabitacion {

	//Atributos
	
	private String nombre;					//Nombre de la habitacion (Simple, Doble, Familiar, Simple VIP, Doble DELUXE, Premium)
	private String idTipo;					//Id del tipo de habitacion
	private int precio;						
	private int cantidad;					//Cantidad de habitaciones disponibles por tipo (Debe estar enlazado con cantidad total de habitaciones)
	private ArrayList <String> servicios;   //Lista de servicios disponibles por habitacion
	
	
	//Constructores

	public TipoHabitacion(String nombre, int precio, int cantidad, ArrayList <String> servicios) {
		this.nombre = new String();
		this.precio = precio;
		this.cantidad = cantidad;
		this.servicios = servicios;
	}

	//Getters y Setters
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	
	//Metodos

}
