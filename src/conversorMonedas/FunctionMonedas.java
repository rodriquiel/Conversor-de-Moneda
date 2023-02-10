package conversorMonedas;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import utlilidades.utilString;
import views.PantallaResultado;

public class FunctionMonedas implements utilString {
	
	ConversorMoneda conversorMoneda = new ConversorMoneda();
	
	public void convertirMonedas(String op, double input) {
		
		String resultado;
		
		ArrayList<Monedas> listaMonedas = new ArrayList<>();
		listaMonedas.add(new Monedas("USD",300.0));
		listaMonedas.add(new Monedas("Blue USD",380.0));
		listaMonedas.add(new Monedas("Libra",230.0));
		listaMonedas.add(new Monedas("Euro",202.0));
		listaMonedas.add(new Monedas("Yen",1.45));
		
		/**String op = JOptionPane.showInputDialog(null, //Componenete Principal
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
				).toString();*/
		
		
		Monedas monedaSeleccionada = new Monedas();
		if(op.charAt(0) == 'P' ) {
			op = eraseFirstN(op, 17);
			for(int i=0; i < listaMonedas.size(); i++) {
				if (op.equals(listaMonedas.get(i).getNombre())) {
					monedaSeleccionada = listaMonedas.get(i);
				} 
			}
			resultado = conversorMoneda.conversionDesdePeso(monedaSeleccionada,input);
		} else {
			op = firstNChars(op, 3);
			for(int i=0; i < listaMonedas.size(); i++) {
				if (op.equals(firstNChars(listaMonedas.get(i).getNombre(),3))) {
					monedaSeleccionada = listaMonedas.get(i);
				} 
			}
			resultado = conversorMoneda.conversionAPeso(monedaSeleccionada, input);
		}
		
		PantallaResultado pantallaResultado = new PantallaResultado(resultado);
		
		pantallaResultado.setVisible(true);
		
		
	}
	
}
