package tests;

import javax.swing.*;

public class testCuadroDialogo {
	
	public static void main(String[] args) {

		String op1 = "Conversor de Moneda";
		String op2 = "Conversor de Temperatura";
		
		Object [] Opciones = {
				op1,
				op2
		};
		
		String msg = (String) JOptionPane.showInputDialog(null, //Componenete Principal
				"Seleccione una opcion", // Mensaje junto a menu desplegable
				"Elegir", //titulo
				JOptionPane.QUESTION_MESSAGE, //tipo mensaje
				null, //icono junto a menu desplegable
				Opciones, // Array de opciones del menu
				Opciones[0] // opcion por defecto
				);
		
		System.out.println(msg);
	}

}
