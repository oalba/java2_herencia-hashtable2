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
	@Override
	public void printToConsole() {
		super.printToConsole();
		System.out.println(" portion: " + this.portion);
	}
	/**/
}