package conversorMonedas;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import utlilidades.utilString;

public class functionMonedas implements utilString {
	
	ConversorMoneda conversorMoneda = new ConversorMoneda();
	
	public void convertirMonedas(ArrayList<Monedas> monedas, double input) {
		String op = JOptionPane.showInputDialog(null, //Componenete Principal
				"Seleccione una opcion", // Mensaje junto a menu desplegable
				"Monedas", //titulo
				JOptionPane.QUESTION_MESSAGE, //tipo mensaje
				null, //icono junto a menu desplegable
				new Object[] {
						"Peso Argentino a USD",
						"Peso Argentino a Blue USD",
						"Peso Argentino a Euro",
						"Peso Argentino a Libra",
						"Peso Argentino a Yen",
						"USD a Peso Argentino ",
						"Blue USD a Peso Argentino",
						"Euro a Peso Argentino",
						"Libra a Peso Argentino",
						"Yen a Peso Argentino",
				}, // Array de opciones del menu
				"Seleccion" // opcion por defecto
				).toString();
		
		
		Monedas monedaSeleccionada = new Monedas();
		if(op.charAt(0) == 'P' ) {
			op = eraseFirstN(op, 17);
			for(int i=0; i < monedas.size(); i++) {
				if (op.equals(monedas.get(i).getNombre())) {
					monedaSeleccionada = monedas.get(i);
				} 
			}
			conversorMoneda.conversionDesdePeso(monedaSeleccionada,input);
		} else {
			op = firstNChars(op, 3);
			for(int i=0; i < monedas.size(); i++) {
				if (op.equals(firstNChars(monedas.get(i).getNombre(),3))) {
					monedaSeleccionada = monedas.get(i);
				} 
			}
			conversorMoneda.conversionAPeso(monedaSeleccionada, input);
		}
		
	}
	
}
