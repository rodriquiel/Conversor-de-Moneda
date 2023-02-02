package conversorMonedas;

import javax.swing.JOptionPane;

public class convertirAPeso {
	public void conversionAPeso (Monedas moneda, double valor) {
		double valorConversion = moneda.getValor();
		double resultado = valor * valorConversion;
		resultado = (double) Math.round(resultado*100)/100;
		JOptionPane.showMessageDialog(null,"Tiene $" + resultado + " Pesos" );
	}


}
