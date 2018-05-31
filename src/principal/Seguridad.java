package principal;

import java.util.Hashtable;

public class Seguridad {
	// Atributos 
	
	private Hashtable<String,String> pswrds;
	private String codigoAccesoAdmin; 			//Codigo de acceso administrativo AUTOGENERADO O INGRESADO?
	private String idAdmin;
	
	
	// Constructor
	
	public Seguridad() {
		pswrds = new Hashtable<String,String>();
		codigoAccesoAdmin = new String();
		
	}
	
	
	//Getters y Setters
	
	public String getCodigoAccesoAdmin() {
		return codigoAccesoAdmin;
	}
	public void setCodigoAccesoAdmin(String codigoAccesoAdmin) {
		this.codigoAccesoAdmin = codigoAccesoAdmin;
	}
	
	public String getIdAdmin() {
		return idAdmin;
	}
	public void setIdAdmin(String idAdmin) {
		this.idAdmin = idAdmin;
	}	
	
	
	//Metodos

	public boolean verificarLlaveAdmin(String llave, String id){
		if(llave == codigoAccesoAdmin && id == idAdmin)	return true;
		else return false;
	}
	
	public boolean verificarIngreso(String nombreUsuario, String contrasena) {
		if (pswrds.isEmpty() == false){
			if(pswrds.get(contrasena) == nombreUsuario){
				return true;
			}
			else{
				return false;
			}
		}
		else{
			return false;
		}
	}


}
