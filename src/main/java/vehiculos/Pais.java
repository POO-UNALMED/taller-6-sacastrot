package vehiculos;

import java.util.ArrayList;

public class Pais {
	private String nombre;

	public Pais(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public static Pais paisMasVendedor() {
		ArrayList<Vehiculo> vehiculos = Vehiculo.listado;
		int maxNoVehiculos = 0;
		Fabricante fabricanteMasVende = null;
		for (Vehiculo vehiculo : vehiculos) {
			Fabricante fabricante = vehiculo.getFabricante();
			if (fabricante.getNoVehiculos() > maxNoVehiculos) {
				fabricanteMasVende = fabricante;
				maxNoVehiculos = fabricante.getNoVehiculos();
			}
		}
		return fabricanteMasVende.getPais();
	}

}
