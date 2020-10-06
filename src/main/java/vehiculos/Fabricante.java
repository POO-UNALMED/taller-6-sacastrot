package vehiculos;

import java.util.ArrayList;

public class Fabricante {
	private String nombre;
	private Pais pais;
	private int noVehiculos;

	public Fabricante(String nombre, Pais pais) {
		super();
		this.nombre = nombre;
		this.pais = pais;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public static Fabricante fabricaMayorVentas() {
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
		return fabricanteMasVende;
	}

	public int getNoVehiculos() {
		return noVehiculos;
	}

	public void setNoVehiculos(int noVehiculos) {
		this.noVehiculos = noVehiculos;
	}

	public void sumarVehiculo() {
		this.noVehiculos++;
	}

}
