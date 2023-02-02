package conversorMonedas;

public class Monedas {
		private String nombre;
		private double valor;
		
		public Monedas(String nombre, double valor) {
			this.nombre = nombre;
			this.valor = valor;
		}
		
		public Monedas() {
			
		}
		
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public double getValor() {
			return valor;
		}
		public void setValor(double valor) {
			this.valor = valor;
		}
		
		

}
