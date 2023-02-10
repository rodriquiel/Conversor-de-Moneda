package ConversorTemperatura;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import utlilidades.utilString;
import views.PantallaResultado;

public class FunctionTemperaturas implements utilString {
	ConversorTemp conversorTemp = new ConversorTemp();
	
	public void convertirTemperatura(String op, double input ) {
		
		String resultado;
		
		ArrayList<Temperaturas> listaTemps = new ArrayList<>();
		listaTemps.add(new Temperaturas("Kelvin",273.15));
		listaTemps.add(new Temperaturas("Fahrenheit", 5/9));
		
		
		/*String op = JOptionPane.showInputDialog(null, //Componenete Principal
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
				).toString();*/
		
		Temperaturas tempSeleccionada = new Temperaturas();
		if(op.charAt(0) == 'C' ) {
			op = eraseFirstN(op, 10);
			for(int i=0; i < listaTemps.size(); i++) {
				if (op.equals(listaTemps.get(i).getNombre())) {
					tempSeleccionada = listaTemps.get(i);
				} 
			}
			resultado = conversorTemp.conversionDesdeC(tempSeleccionada, input);
		} else {
			op = firstNChars(op, 6);
			for(int i=0; i < listaTemps.size(); i++) {
				if (op.equals(firstNChars(listaTemps.get(i).getNombre(),6))) {
					tempSeleccionada = listaTemps.get(i);
				} 
			}
			resultado = conversorTemp.conversionAC(tempSeleccionada, input);
		}
		
		PantallaResultado pantallaResultado = new PantallaResultado(resultado);
		
		pantallaResultado.setVisible(true);
		
	}
}
	
	
	

