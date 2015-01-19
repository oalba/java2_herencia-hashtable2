import java.util.*;

public class Main {
	public static void main(String[] args) {
		Jefe jefe = new Jefe();
		Empleado empleado = new Empleado();
		Repartidor repartidor = new Repartidor();

		//Añadir datos
		jefe.setNombre("Jokin Izagirre");
		jefe.setDni("78420168-S");
		jefe.setPuesto("Jefe");
		jefe.setEmpresa("Tecnic S.A.");
		jefe.setNumTrabajadores(120);

		empleado.setNombre("Mikel Urkijo");
		empleado.setDni("74458942-D");
		empleado.setPuesto("Empleado");
		empleado.setNomJefe("Jokin Izagirre");
		empleado.setSueldoMes(1200);

		repartidor.setNombre("Ainhoa Matias");
		repartidor.setDni("72224953-S");
		repartidor.setPuesto("Repartidor");
		repartidor.setZonaReparto("Polígonos");
		repartidor.setMatricula("5493 FHQ");
		repartidor.setHorasDia(8);

		//Imprimir en pantalla
		System.out.println("Jefe:");
		System.out.println(jefe.getNombre());
		System.out.println(jefe.getDni());
		System.out.println(jefe.getPuesto());
		System.out.println(jefe.getEmpresa());
		System.out.println(jefe.getNumTrabajadores());
		System.out.println();
		System.out.println("Empleado:");
		System.out.println(empleado.getNombre());
		System.out.println(empleado.getDni());
		System.out.println(empleado.getPuesto());
		System.out.println(empleado.getNomJefe());
		System.out.println(empleado.getSueldoMes());
		System.out.println();
		System.out.println("Repartidor:");
		System.out.println(repartidor.getNombre());
		System.out.println(repartidor.getDni());
		System.out.println(repartidor.getPuesto());
		System.out.println(repartidor.getZonaReparto());
		System.out.println(repartidor.getMatricula());
		System.out.println(repartidor.getHorasDia());
		System.out.println();
		
		
		Hashtable<String, String> direccion  = new Hashtable<String, String>();
		String num = new String("27");//se puede declarar un número antes de utilizarlo
		direccion.put("calle","Egia");
		direccion.put("numero", num);
		direccion.put("ciudad","Donostia - San Sebastian");
		direccion.put("provincia","Gipuzkoa");

        String miciudad  = (String) direccion.get("ciudad");
        String miprovincia  = (String) direccion.get("provincia");
		String micalle = (String) direccion.get("calle");
		String minumero = (String) direccion.get("numero");
		
		System.out.println("Direccion de la empresa: ");
		System.out.println("Direccion : " + micalle + " " + minumero);
		System.out.println("Lugar: " + miciudad + ", " + miprovincia);
	}
}