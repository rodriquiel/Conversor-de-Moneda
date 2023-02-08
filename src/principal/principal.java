package principal;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import ConversorTemperatura.Temperaturas;
import ConversorTemperatura.functionTemperaturas;
import conversorMonedas.Monedas;
import conversorMonedas.functionMonedas;
import utlilidades.ValidarNumero;

public class principal {
	
	public class principalFrame extends JFrame{
		
	}
	

	public static void main(String[] args) {
		ValidarNumero validador = new ValidarNumero();
		functionMonedas monedas = new functionMonedas();
		functionTemperaturas temperaturas = new functionTemperaturas();
		
		ArrayList<Monedas> listaMonedas = new ArrayList<>();
		listaMonedas.add(new Monedas("USD",300.0));
		listaMonedas.add(new Monedas("Blue USD",380.0));
		listaMonedas.add(new Monedas("Libra",230.0));
		listaMonedas.add(new Monedas("Euro",202.0));
		listaMonedas.add(new Monedas("Yen",1.45));
		
		ArrayList<Temperaturas> listaTemps = new ArrayList<>();
		listaTemps.add(new Temperaturas("Kelvin",273.15));
		listaTemps.add(new Temperaturas("Fahrenheit", 5/9));
		
		
		String opciones;
		
		do {
			try {
				opciones = (JOptionPane.showInputDialog(null,
						"Seleccione una opción de conversión ",
						"Menu",
						JOptionPane.QUESTION_MESSAGE,
						null,
						new Object[] {"Conversor de Moneda",
								      "Conversor de Temperatura"},
						"Seleccion")
						).toString();
			} catch (java.lang.NullPointerException e) {
				System.out.println(e.getMessage());
				opciones = "Cancelar";
			}
			
			String input;
			double Minput = 0;
			input = JOptionPane.showInputDialog("Ingresa el valor que deseas convertir: ");
			if(validador.validar(input) == true) {
                 Minput = Double.parseDouble(input);
            }
			
			switch(opciones) {
        	case "Conversor de Moneda":{
        		monedas.convertirMonedas(listaMonedas,Minput);
        		break;
        	}
       
        	case "Conversor de Temperatura":{
        		temperaturas.convertirTemperatura(listaTemps, Minput);
        		break;
        	}
                
			}
			
			int respuesta=JOptionPane.showConfirmDialog(null,"¿Deseas realizar otra conversión?");
            if (JOptionPane.OK_OPTION != respuesta){
           	 JOptionPane.showMessageDialog(null, "Programa terminado");
           	 opciones = "Cancelar";
            } 
			
		} while(opciones != "Cancelar");
			
	}
			
}
		
		
		
		

	


