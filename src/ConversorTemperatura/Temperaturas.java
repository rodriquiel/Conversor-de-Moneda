package ConversorTemperatura;

public class Temperaturas {
	private String nombre;
	private double factor;
	
	public Temperaturas(String nombre, double factor){
		this.nombre = nombre;
		this.factor = factor;
	}
	
	public Temperaturas() {
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getFactor() {
		return factor;
	}

	public void setFactor(double factor) {
		this.factor = factor;
	}
	
	
}
