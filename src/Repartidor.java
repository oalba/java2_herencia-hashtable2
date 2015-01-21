public class Repartidor extends Trabajador {
	public String zonaReparto;
	public String matricula;
	public int horasDia;

	public void setZonaReparto(String zr){
		zonaReparto = zr;
	}
	public String getZonaReparto(){
		return zonaReparto;
	}
	public void setMatricula(String matri){
		matricula = matri;
	}
	public String getMatricula(){
		return matricula;
	}
	public void setHorasDia(int hrd){
		horasDia = hrd;
	}
	public int getHorasDia(){
		return horasDia;
	}
	/**/
	//@Override
	public void imprimir() {
		super.imprimir();
		System.out.println("Zona de reparto: " + getZonaReparto());
		System.out.println("Matrícula del vehículo: " + getMatricula());
		System.out.println("Horas diarias: " + getHorasDia());
	}
	/**/
}