package principal;

import java.util.ArrayList;
import java.util.Calendar;

public class Hotel {

	//Atributos
	
	private int numeroHabitaciones; 					//Numero total de habitaciones del hotel
	private ListaServicios servicios; 					//Lista de servicios disponibles en detalle por habitacion <-----Nueva Lista implementada 
	private ArrayList <TipoHabitacion> tiposHabitacion; //Tipos de habitaciones segun los servicios MINIMOS
	private RegistroClientes registroClientes;		//Historial de clientes ingresados (Se referencian a traves del rut en las habitaciones)
	private RegistroUsuarios registroUsuarios;		//Registro de usuarios permitidos para ingresar al software
	private ListaHabitaciones listaHabitaciones;		//Lista de habitaciones registradas
	private Seguridad clavesUsuarios;					//Mapa con los codigos de acceso 
	private Usuario administrador;						//Datos del administrador (Mayor nivel de acceso)
	private String usuarioActual;						//Rut del usuario ingresado actualmente
	private int ultimoCliente;							//Codigodel ultimo Cliente ingresado
	private Cliente clienteAnterior;					//Datos del ultimo cliente ingresado
	
	//Constructores
	
	public Hotel() {
		numeroHabitaciones = 0;
		servicios= new ListaServicios (); 
		tiposHabitacion = new ArrayList<TipoHabitacion>();
		registroClientes = new ArrayList<Cliente>();
		registroUsuarios = new ArrayList<Usuario>();
		habitaciones = new ArrayList<Habitacion>();
		clavesUsuarios = new Seguridad();
		administrador = new Usuario();
		usuarioActual = new String();
		clienteAnterior = new Cliente();
	}
	
	//Geters y Setters
	
	public int getNumeroHabitaciones() {
		return numeroHabitaciones;
	}
	public void setNumeroHabitaciones(int numeroHabitaciones) {
		this.numeroHabitaciones = numeroHabitaciones;
	}
	
	public Seguridad getClavesUsuarios() {
		return clavesUsuarios;
	}
	public void setClavesUsuarios(Seguridad clavesUsuarios) {
		this.clavesUsuarios = clavesUsuarios;
	}
	
	public Usuario getAdministrador() {
		return administrador;
	}
	public void setAdministradores(Usuario administrador) {
		this.administrador = administrador;
	}

	public String getUsuarioActual() {
		return usuarioActual;
	}
	public void setUsuarioActual(String usuarioActual) {
		this.usuarioActual = usuarioActual;
	}
	
	public Cliente getClienteAnterior() {
		return clienteAnterior;
	}
	public void setClienteAnterior(Cliente clienteAnterior) {
		this.clienteAnterior = clienteAnterior;
	}
	
	
	
	// Metodos servicios.
	
	
	// Agrega servicio en ListaServicio, retorna true si el servicio no estaba dentro de la lista servicio.
	public boolean agregarServicio(String nombreServicioNuevo,boolean disponibilidadServicioNuevo) {
		if(servicios.agregarServicioListaServicios(nombreServicioNuevo, disponibilidadServicioNuevo) == true) {
			return true;
		}
		return false;
	}
	
	// Modifica la disponibilidad del servicio enviado por nombre, retorna true si se modifico, sino, false.
	public boolean modificarDisponibilidadServicioListaServicios(String nombreServicioModicidado,boolean disponibilidadNueva) {
		if(servicios.modificarDisponibilidadServicio(nombreServicioModicidado, disponibilidadNueva)==true) {
			return true;
		}
		return false;
	}
	
	// retorna el tamagno de la listaServicio
	public int tamagnoListaServicios() {
		return servicios.tamagnoListaServicios();
	}
	
	// retorna el nombre del servicio de donde este el indice.
	public String nombreServicioPosicionIndice(int indice) {
		if(servicios.getNombreServicioListaServicio(indice)!="NULL") {
			return servicios.getNombreServicioListaServicio(indice);
		}
		return "NULL";
	}
	
	//retorna la disponibilidad del servicio 
	public String disponibilidadServicioListaServicio(String nombreServicio) {
		return servicios.getDisponibilidadServicioListaServicio(nombreServicio);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//Metodos Usuarios/Admin
	
/*	  public boolean agregarUsuario(String nombre, String rut, String telefono, String correo,int diaFN, int mesFN, int anoFN,String pregunta, String respuesta, String nombreUsuario, String idUsuario) {
	    	for(int index = 0; index < registroUsuarios.size(); index++) {
	    		if(registroUsuarios.get(index).getNombreCompleto() == nombre) {
	    			return false;
	    		}
	    	}	
	    	Usuario nuevoUsuario = new Usuario(nombre, rut, telefono, correo, diaFN, mesFN, anoFN, pregunta, respuesta, nombreUsuario, idUsuario);
	    	return registroUsuarios.add(nuevoUsuario);
	  }
	    
	    public Cliente editarUsuario(String nombre, String rut, String telefono, String correo,int diaFN, int mesFN, int anoFN,String pregunta, String respuesta, String nombreUsuario, String idUsuario) {
	    	if(registroUsuarios.isEmpty()) 
	    		return null;
	    	for(int index = 0; index < registroUsuarios.size(); index++) {
	    		if(registroUsuarios.get(index).getIdUsuario() == idUsuario) {
	    			registroUsuarios.get(index).setNombreCompleto(nombre);
	    			registroUsuarios.get(index).setRut(rut);
	    			registroUsuarios.get(index).setTelefono(telefono);
	    			registroUsuarios.get(index).setCorreo(correo);
	    			Calendar nuevaFNac = Calendar.getInstance();
	    			nuevaFNac.set(anoFN, mesFN, diaFN);
	    			registroUsuarios.get(index).setFechaNac(nuevaFNac);
	    			registroUsuarios.get(index).setPreguntaSecreta(pregunta);
	    			registroUsuarios.get(index).setRespuesta(respuesta);
	    			registroUsuarios.get(index).setNombreUsuario(nombreUsuario);
	    			return registroUsuarios.get(index);
	    		}
	    	}
			return null;
	    }
*/    

	
	//Retorna la id de un usuario del registro de usuarios utilizando su nombre de usuario, si no existe retorna NULL
	public String getIdUsuario(String nombreUsuario){
		int indice;
		Usuario usuarioActual = new Usuario();
		if(registroUsuarios.isEmpty() == false){
			for(indice=0; indice<registroUsuarios.size(); indice++){
				usuarioActual = registroUsuarios.get(indice);
				if(usuarioActual.getNombreUsuario() == nombreUsuario ){
					return usuarioActual.getIdUsuario();
				}
			}
		}
		return null;
	}
	
    public boolean comprobarAcceso( String nombreUsuario , String contrasena){
    	String idUsuario = null;
    	if(getIdUsuario(nombreUsuario) != null){
    		idUsuario = getIdUsuario(nombreUsuario);
    		if (clavesUsuarios.verificarIngreso(idUsuario, contrasena) == true){
        		setUsuarioActual(idUsuario);
        		return true;
        	}
    	}
    	return false;
    }
    
    public boolean comprobarAccesoAdmin(String nombreUsuario, String contrasena){
    	String idAdmin = null;
    	if(administrador.getIdUsuario() != null){
    		idAdmin = administrador.getIdUsuario();
    		if (clavesUsuarios.verificarLlaveAdmin(contrasena, idAdmin) == true){
        		setUsuarioActual(idAdmin);
        		return true;
        	}
    	}
    	return false;
    }
    
    public boolean esAdmin(){
    	if(usuarioActual == administrador.getIdUsuario()){
    		return true;
    	}
    	return false;
    }
    
    
    
    
    
    
    //Metodos Habitaciones
    
    
    
    
    
    public boolean agregarHabitacion(int numero, String tipo) {
    	for(int index = 0; index < habitaciones.size(); index++) {
    		if(habitaciones.get(index).getNumero() == numero)
    			return false;
    	}
    	Habitacion nuevaHabitacion = new Habitacion(numero,tipo);
    	return habitaciones.add(nuevaHabitacion);
    }
    
    public Habitacion editarHabitacion(int numero,int nuevoNumero, String nuevoTipo) {
    	if(habitaciones.isEmpty()) 
    		return null;
    	for(int index = 0; index < habitaciones.size(); index++) {
    		if(habitaciones.get(index).getNumero() == numero) {
    			habitaciones.get(index).setNumero(nuevoNumero);
    			habitaciones.get(index).setTipo(nuevoTipo);
    			return habitaciones.get(index);
    		}
    	}
		return null;
    }
    
    public Habitacion eliminarHabitacion(int numero) {
    	if(habitaciones.isEmpty()) 
    		return null;
    	for(int index = 0; index < habitaciones.size(); index++) {
    		if(habitaciones.get(index).getNumero() == numero) {
    			return habitaciones.remove(index);
    		}
    	}
		return null;
    }
    
    //Retorna la habitacion con el numero ingresado
    public Habitacion buscarHabitacion(int numero) {
    	if(habitaciones.isEmpty()) 
    		return null;
    	for(int index = 0; index < habitaciones.size(); index++) {
    		if(habitaciones.get(index).getNumero() == numero) {
    			return habitaciones.get(index);
    		}
    	}
		return null;
    }
    
    //Retorna las habitaciones en las que se encuentra un cliente especifico
    public ArrayList<String> buscarHabitacion(String rutCliente) {
    	if(habitaciones.isEmpty()) 
    		return null;
    	ArrayList<String> habitacionesEncontradas = new ArrayList<String>();
    	for(int index = 0; index < habitaciones.size(); index++) {
    		if(habitaciones.get(index).consultarCliente(rutCliente) != null) {
    			habitacionesEncontradas.add( String.valueOf( habitaciones.get(index).getNumero() ) );
    		}
    	}
		return habitacionesEncontradas;
    }
    
    
    
    
    //Metodos Cliente
    
    
    
    
    
    public boolean agregarCliente(String nombre, String rut, String telefono, String correo,int diaFN, int mesFN, int anoFN, int numeroHabitacion, int diasEstadia) {
    	boolean existe = false;
    	for(int ind = 0; ind < registroClientes.size(); ind++) {
    		if(registroClientes.get(ind).getRut() == rut) {
    			existe = true;
    			break;
    		}
    	}
    	
    	for(int index = 0; index < habitaciones.size(); index++) {
    		if(habitaciones.get(index).getNumero() == numeroHabitacion) {
    			if(habitaciones.get(index).getDisponibilidad() == true) {
    				ultimoCliente = ultimoCliente + 1 ;
    				Cliente nuevoCliente = new Cliente(nombre,  rut,  telefono,  correo,  diaFN,  mesFN,  anoFN, ultimoCliente, numeroHabitacion, diasEstadia);
    				habitaciones.get(index).setClienteActual(nuevoCliente);
    				clienteAnterior = nuevoCliente;
    				if (existe == false)
    		    		registroClientes.add(nuevoCliente) ;
    				return true;
    			}
    			else {
    				return false;
    			}
    		}
    		}
		return false;
    	
    }
    
    public Cliente editarCliente(String nombre, String rut, String telefono, String correo,int diaFN, int mesFN, int anoFN, int diasEstadia) {
    	if(registroClientes.isEmpty()) 
    		return null;
    	for(int index = 0; index < registroClientes.size(); index++) {
    		if(registroClientes.get(index).getRut() == rut) {
    			registroClientes.get(index).setNombreCompleto(nombre);
    			registroClientes.get(index).setRut(rut);
    			registroClientes.get(index).setTelefono(telefono);
    			registroClientes.get(index).setCorreo(correo);
    			Calendar nuevaFNac = Calendar.getInstance();
    			nuevaFNac.set(anoFN, mesFN, diaFN);
    			registroClientes.get(index).setFechaNac(nuevaFNac);
    			Calendar copiaFechaIngreso = registroClientes.get(index).getFechaIngreso();
    			registroClientes.get(index).getFechaSalida().set(copiaFechaIngreso.get(Calendar.YEAR) ,copiaFechaIngreso.get(Calendar.MONTH) ,(copiaFechaIngreso.get(Calendar.DATE) + diasEstadia));
    			return registroClientes.get(index);
    		}
    	}
		return null;
    }
    
    public Cliente eliminarCliente(String rut) {
    	if(habitaciones.isEmpty()) 
    		return null;
    	for(int index = 0; index < registroClientes.size(); index++) {
    		if(registroClientes.get(index).getRut() == rut) {
    			return registroClientes.remove(index);
    		}
    	}
		return null;
    }
    
    //Busca un cliente en el registro por su nombre
    public Cliente buscarCliente(String nombre) {
    	if(habitaciones.isEmpty()) 
    		return null;
    	for(int index = 0; index < registroClientes.size(); index++) {
    		if(registroClientes.get(index).getNombreCompleto() == nombre) {
    			return registroClientes.get(index);
    		}
    	}
		return null;
    }
    
    //Busca un cliente en el registro por su rut
    public Cliente buscarCliente(int rut) {
    	String rutStr = Integer.toString(rut);
    	if(habitaciones.isEmpty()) 
    		return null;
    	for(int index = 0; index < registroClientes.size(); index++) {
    		if(registroClientes.get(index).getRut() == rutStr) {
    			return registroClientes.get(index);
    		}
    	}
		return null;
    }
    
}	    	       

