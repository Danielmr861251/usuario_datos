public class Usuario {
	String nombre;
	String direccion;
	String telefono;
	String curp;
	
	public Usuario(String nombre, String direccion, String telefono, String curp) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.curp = curp;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getCurp() {
		return curp;
	}
	public void setCurp(String curp) {
		this.curp = curp;
	}
	@Override
	public String toString() {
		return "Usuario \nnombre=" + nombre + ", \ndireccion=" + direccion + ", \ntelefono=" + telefono + ", \ncurp=" + curp
				+ "";
	}
	

}
