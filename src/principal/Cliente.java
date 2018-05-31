package principal;

import java.util.Calendar;
public class Cliente extends Persona {

	private int codigoCliente ;
	private int numeroHabitacion;
	private int diasEstadia;
	private Calendar fechaIngreso;
	private Calendar fechaSalida;
	
	//Constructores

	public Cliente(String nombre, String rut, String telefono, String correo, int diaFN, int mesFN, int anoFN, int codigoCliente, int numeroHabitacion,int diasEstadia) {
		super( nombre, rut,  telefono,  correo, anoFN, mesFN, diaFN);
		this.codigoCliente = codigoCliente;
		this.numeroHabitacion = numeroHabitacion;
		this.diasEstadia = diasEstadia;
		setFechaIngreso(Calendar.getInstance());
		fechaSalida = Calendar.getInstance();
		fechaSalida.set(fechaIngreso.get(Calendar.YEAR) ,fechaIngreso.get(Calendar.MONTH) ,(fechaIngreso.get(Calendar.DATE) + diasEstadia),0,0);	
		generarCodigo();
	}
	
	public Cliente() {
		super();
		fechaIngreso = Calendar.getInstance();
		fechaIngreso.set(0, 0, 0);
		fechaSalida = Calendar.getInstance();
		fechaSalida.set(0, 0, 0);
		
	}

	//Setters y Getters
	public int getCodigoCliente() {
		return codigoCliente;
	}
	public void setCodigoCliente(int codigoCliente) {
		this.codigoCliente = codigoCliente;
	}
	
	public int getNumeroHabitacion() {
		return numeroHabitacion;
	}
	public void setNumeroHabitacion(int numeroHabitacion) {
		this.numeroHabitacion = numeroHabitacion;
	}
	
	public int getDiasEstadia() {
		return diasEstadia;
	}
	public void setDiasEstadia(int diasEstadia) {
		this.diasEstadia = diasEstadia;
	}
	
	public Calendar getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(Calendar fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	
	public Calendar getFechaSalida() {
		return fechaSalida;
	}
	public void setFechaSalida(Calendar fechaSalida) {
		this.fechaSalida = fechaSalida;
	}

	
	//Metodos

	//Generar un codigo de identidad para un usuario recien creado
	public void generarCodigo(){
		int rut=0, dia=0;
		rut = Integer.parseInt(getRut());
		dia = this.getDiaNacimiento();
		codigoCliente = dia*rut;
	}
	
}
