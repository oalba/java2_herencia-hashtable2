public class Trabajador {
	protected String nombre;
	//protected String apellidos;
	protected String dni;
	//protected int edad;
	protected String puesto; //jefe, empleado o repartidor

	public void setNombre (String nom){
		nombre = nom;
	}
	public String getNombre(){
		return nombre;
	}
	/*public void setApellidos (String ape){
		apellidos = ape;
	}
	public String getApellidos(){
		return apellidos;
	}*/
	public void setDni (String dn){
		dni = dn;
	}
	public String getDni(){
		return dni;
	}
	/*public void setEdad (int ed){
		edad = ed;
	}
	public int getEdad(){
		return edad;
	}*/
	public void setPuesto (String pues){
		puesto = pues;
	}
	public String getPuesto(){
		return puesto;
	}
	/**/
	public void imprimir() {
		System.out.println("Nombre: " + this.nombre);
		System.out.println("DNI: " + getDni());
		System.out.println("Puesto: " + getPuesto());

	}
	/**/
}