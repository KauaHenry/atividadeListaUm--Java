package teste;
public class Circulo {
	private double raio;
	
	public Circulo(double r) {
		this.raio = r;
	}
	public double getRaio() {
		return raio;
	}
	
	public double calcularArea() {
		return 3.14 * (this.raio * this.raio);
	}
	
	public double calcularPerimetro() {
		return 2 * 3.14 * (this.raio);
	}
}
