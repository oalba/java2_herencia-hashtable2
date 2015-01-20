public class Jefe extends Trabajador {
	public String empresa;
	public int numTrabajadores;

	public void setEmpresa (String emp){
		empresa = emp;
	}
	public String getEmpresa(){
		return empresa;
	}
	public void setNumTrabajadores(int ntrab){
		numTrabajadores = ntrab;
	}
	public int getNumTrabajadores(){
		return numTrabajadores;
	}
	/**/
	@Override
	public void imprimir() {
		super.imprimir();
		System.out.println("Nombre de la empresa: " + getEmpresa());
		System.out.println("Número de trabajadores: " + getNumTrabajadores());
	}
	/**/
}