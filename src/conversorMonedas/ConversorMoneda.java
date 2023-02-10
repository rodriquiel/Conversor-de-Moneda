package conversorMonedas;

import javax.swing.JOptionPane;

public class ConversorMoneda {
	
	public String conversionDesdePeso (Monedas moneda, double valor) {
		double valorConversion = moneda.getValor();
		double resultado = valor / valorConversion;
		resultado = (double) Math.round(resultado*100)/100;
		return ("Tiene $" + resultado + " " + moneda.getNombre());
	}
	
	public String conversionAPeso (Monedas moneda, double valor) {
		double valorConversion = moneda.getValor();
		double resultado = valor * valorConversion;
		resultado = (double) Math.round(resultado*100)/100;
		return("Tiene $" + resultado + " Pesos" );
	}

}
