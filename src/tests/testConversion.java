package tests;

import javax.swing.JOptionPane;

public class testConversion {
	public static void main(String[] args) {
		
		double valor = 8000.0;
		
		double monedaDolar = valor / 90.00;
		monedaDolar = (double) Math.round(monedaDolar*100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaDolar+ " Dolares");
	}
}
