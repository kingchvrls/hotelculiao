package principal;

public class Usuario extends Persona {
	

	//Atributos
	private String preguntaSecreta;
	private String respuesta;
	private String nombreUsuario;
	private String idUsuario;

	//Constructores
	public Usuario() {
		super();
	}
	
	public Usuario(String nombre,String rut, String telefono, String correo, int diaFN, int mesFN, int anoFN, String pregunta, String respuesta, String nombreUsuario, String id) {
		super(nombre, rut, telefono, correo, anoFN, mesFN, diaFN);
		preguntaSecreta = pregunta;
		this.respuesta = respuesta;
		this.nombreUsuario = nombreUsuario;
		idUsuario = id;
	}
		
	//Getters y setters
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	
	public String getIdUsuario() {
		return idUsuario;
	}
	public void setIdUser(String idUsuario) {
		this.idUsuario = idUsuario;
	}
	
	public String getPreguntaSecreta() {
		return preguntaSecreta;
	}
	public void setPreguntaSecreta(String preguntaSecreta) {
		this.preguntaSecreta = preguntaSecreta;
	}
	
	public String getRespuesta() {
		return respuesta;
	}
	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}	

	//Metodos
	
	public void generarCodigo(){
		String idGenerado;
		idGenerado = nombreUsuario.substring(0, 2);
		idGenerado.concat(getRut());
		idUsuario=idGenerado;
	}
}