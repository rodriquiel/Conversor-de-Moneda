package conversorMonedas;

import javax.swing.JOptionPane;

public class convertirDesdePeso {
	
	public void conversionDesdePeso (Monedas moneda, double valor) {
		double valorConversion = moneda.getValor();
		double resultado = valor / valorConversion;
		resultado = (double) Math.round(resultado*100)/100;
		JOptionPane.showMessageDialog(null,"Tiene $" + resultado + " " + moneda.getNombre() );
	}

}
