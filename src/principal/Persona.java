package principal;

import java.util.Calendar;

public abstract class Persona {
	
	//Atributos
	
	protected String nombreCompleto;
	protected String rut;
	protected Calendar fechaNac;
	protected String telefono;
	protected String correo;
	
	//Constructores
	
	public Persona() {
		
	}
	
	public Persona(String nombre,String rut, String telefono, String correo, int diaFN, int mesFN, int anoFN) {
		nombreCompleto = nombre;
		this.rut = rut;
		this.telefono = telefono;
		this.correo = correo;
		fechaNac.set(anoFN,mesFN,diaFN);
		
	}

	//Getters y Setters
	
	public String getNombreCompleto() {
		return nombreCompleto;
	}
	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}
	
	public String getRut() {
		return rut;
	}
	public void setRut(String rut) {
		this.rut = rut;
	}
	
	public Calendar getFechaNac() {
		return fechaNac;
	}
	public void setFechaNac(Calendar fNac) {
		fechaNac = fNac;
	}
	
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	public abstract void generarCodigo();
	
	public int getDiaNacimiento() {
		return fechaNac.get(Calendar.DATE);
	}
	
}
