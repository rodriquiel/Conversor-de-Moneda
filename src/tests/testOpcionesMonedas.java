package tests;

import javax.swing.JOptionPane;

public class testOpcionesMonedas {
	public static void main(String[] args) {
		String [] opcionesMonedas = {
			"Peso Argentino a USD",
			"Peso Argentino a USD blue",
			"Peso Argentino a Euro",
			"Peso Argentino a Libra",
			"Peso Argentino a Yen",
			"USD a Peso Argentino ",
			"USD blue a Peso Argentino",
			"Euro a Peso Argentino",
			"Libra a Peso Argentino",
			"Yen a Peso Argentino",
		};
		
		String msg = (String) JOptionPane.showInputDialog(null, //Componenete Principal
				"Seleccione una opcion", // Mensaje junto a menu desplegable
				"Elegir", //titulo
				JOptionPane.QUESTION_MESSAGE, //tipo mensaje
				null, //icono junto a menu desplegable
				opcionesMonedas, // Array de opciones del menu
				opcionesMonedas[0] // opcion por defecto
				);
		
		System.out.println(msg);
	}
}
