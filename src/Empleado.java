public class Empleado extends Trabajador {
	public String nomJefe;
	public int sueldoMes;

	public void setNomJefe(String nj){
		nomJefe = nj;
	}
	public String getNomJefe(){
		return nomJefe;
	}
	public void setSueldoMes(int smes){
		sueldoMes = smes;
	}
	public int getSueldoMes(){
		return sueldoMes;
	}
	/**/
	//@Override
	public void imprimir() {
		super.imprimir();
		System.out.println("Nombre del jefe: " + getNomJefe());
		System.out.println("Sueldo mensual: " + getSueldoMes());
	}
	/**/
}