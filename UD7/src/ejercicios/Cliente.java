package ejercicios;

public class Cliente {
	String nombreCompleto ;
	String telefono ; 
	String direccion ; 
	String nif ; 
	boolean moroso ;
	public String getNombreCompleto() {
		return nombreCompleto;
	}
	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}
	public String getTelefono() {
		return telefono;
	}
	public Cliente(String nombreCompleto, String telefono, String direccion, String nif, boolean moroso) {
		super();
		this.nombreCompleto = nombreCompleto;
		this.telefono = telefono;
		this.direccion = direccion;
		this.nif = nif;
		this.moroso = moroso;
	}
	public Cliente() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Cliente [nombreCompleto=" + nombreCompleto + ", telefono=" + telefono + ", direccion=" + direccion
				+ ", nif=" + nif + ", moroso=" + moroso + "]";
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getNif() {
		return nif;
	}
	public void setNif(String nif) {
		this.nif = nif;
	}
		public void setMoroso(boolean moroso) {
		this.moroso = moroso;
	} 
	public  boolean isMoroso() {
		if(moroso==false)
			return false;
		return true;
	}
}
