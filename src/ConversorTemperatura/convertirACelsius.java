package ConversorTemperatura;

import javax.swing.JOptionPane;

public class convertirACelsius {
	public void conversionAC(Temperaturas temp, double valor) {
		double factor = temp.getFactor();
		double resultado;
		
		if (temp.getNombre() .equals("Kelvin")){
			resultado = valor - factor;
		} else {
			resultado = (valor - 32) * factor;		
		}
		resultado = (double) Math.round(resultado*100)/100;
		JOptionPane.showMessageDialog(null,"La equivalencia es " + resultado + "°C");
	}
}
