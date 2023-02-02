package tests;

import java.util.ArrayList;

import conversorMonedas.Monedas;

public class testIndexOf {

	public static void main(String[] args) {
		ArrayList<Monedas> lista = new ArrayList<>();
		
		lista.add(new Monedas("Euro",120));
		lista.add(new Monedas("Dolar",100));
		lista.add(new Monedas("Yen",110));
		
		for(int i=0; i < lista.size(); i++) {
			if (lista.get(i).getNombre() == "Dolar") {
				System.out.println(i);
			} 
		}

	}

}
