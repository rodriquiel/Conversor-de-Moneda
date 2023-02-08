package ConversorTemperatura;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import utlilidades.utilString;

public class functionTemperaturas implements utilString {
	ConversorTemp conversorTemp = new ConversorTemp();
	
	public void convertirTemperatura(ArrayList<Temperaturas> temperaturas, double input ) {
		String op = JOptionPane.showInputDialog(null, //Componenete Principal
				"Seleccione una opcion", // Mensaje junto a menu desplegable
				"Temperaturas", //titulo
				JOptionPane.QUESTION_MESSAGE, //tipo mensaje
				null, //icono junto a menu desplegable
				new Object[] {
						"Celsius a Kelvin",
						"Celsius a Fahrenheit",
						"Kelvin a Celsius",
						"Fahrenheit a Celsius",
				}, // Array de opciones del menu
				"Seleccion" // opcion por defecto
				).toString();
		
		Temperaturas tempSeleccionada = new Temperaturas();
		if(op.charAt(0) == 'C' ) {
			op = eraseFirstN(op, 10);
			for(int i=0; i < temperaturas.size(); i++) {
				if (op.equals(temperaturas.get(i).getNombre())) {
					tempSeleccionada = temperaturas.get(i);
				} 
			}
			conversorTemp.conversionDesdeC(tempSeleccionada, input);
		} else {
			op = firstNChars(op, 6);
			for(int i=0; i < temperaturas.size(); i++) {
				if (op.equals(firstNChars(temperaturas.get(i).getNombre(),6))) {
					tempSeleccionada = temperaturas.get(i);
				} 
			}
			conversorTemp.conversionAC(tempSeleccionada, input);
		}
		
	}
}
	
	
	

