package utlilidades;

public class ValidarNumero {
	public boolean validar(String input) {
		try {
            double x = Double.parseDouble(input);
            if(x >= 0 || x < 0);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
	}
}
