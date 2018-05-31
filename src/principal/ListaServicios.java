package principal;

import java.util.ArrayList;

public class ListaServicios {
	
	
	private ArrayList <Servicio> listaServicios;
	
	public ListaServicios(){
		listaServicios = new ArrayList <Servicio> ();
	}
	
	
	// retorna true si el servicio fue exitosamente agregado y false si existe un servicio con el mismo nombre.
	public boolean agregarServicioListaServicios(String nombreServicio ,boolean disponibilidadServicio) {
		int i;
		Servicio servicioNuevo = new Servicio (nombreServicio,disponibilidadServicio);
		for(i=0;i<listaServicios.size();i++) {
			if(nombreServicio == listaServicios.get(i).getNombreServicio()) {
				return false;
			}
		}
		listaServicios.add(servicioNuevo);
		return true;
	}
	
	// retorna true si la disponibilidad del servicio fue modificada exitosamente, retorna false si no se encontro servicio.
	public boolean modificarDisponibilidadServicio(String nombreServicio,boolean nuevaDisponibilidad) {
		int i;
		for(i=0;i<listaServicios.size();i++) {
			if(listaServicios.get(i).getNombreServicio()==nombreServicio) {
				listaServicios.get(i).setDisponibilidad(nuevaDisponibilidad);
				return true;
			}
		}
		return false;
	}
	
	// retorna el largo de la lista Servicios
	public int tamagnoListaServicios() {
		return listaServicios.size();
	}
	
	// retorna el nombre del servicio obtenido segun posicion.
	public String getNombreServicioListaServicio(int indice) {
		if(indice<=listaServicios.size()) {
			return listaServicios.get(indice).getNombreServicio();
		}
		return "NULL";
	}
	
	// retorna la disponibilidad del servicio obtenida con el nombre del servicio
	public String getDisponibilidadServicioListaServicio(String nombreServicio) {
		int i;
		for(i=0;i<listaServicios.size();i++) {
			if(listaServicios.get(i).getNombreServicio()==nombreServicio) {
				if(listaServicios.get(i).getDisponibilidad()==true) {
					return "DISPONIBLE";
				}
				if(listaServicios.get(i).getDisponibilidad()==false) {
					return "NO DISPONIBLE";
				}
			}
		}
		return "NULL";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
