package ConversorTemperatura;

import javax.swing.JOptionPane;

public class ConversorTemp {
	public String conversionDesdeC(Temperaturas temp, double valor) {
		double factor = temp.getFactor();
		double resultado;
		if (temp.getNombre() .equals("Kelvin")){
			resultado = valor + factor;
		} else {
			resultado = (valor / factor) + 32;
		}
		
		resultado = (double) Math.round(resultado*100)/100;
		return("La equivalencia es " + resultado + "°" + temp.getNombre().charAt(0));
	}
	
	public String conversionAC(Temperaturas temp, double valor) {
		double factor = temp.getFactor();
		double resultado;
		
		if (temp.getNombre() .equals("Kelvin")){
			resultado = valor - factor;
		} else {
			resultado = (valor - 32) * factor;		
		}
		resultado = (double) Math.round(resultado*100)/100;
		return("La equivalencia es " + resultado + "°C");
	}
}
