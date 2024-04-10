public class Triangulo {
	private int lado1;
	private int lado2;
	private int lado3;
	
	public Triangulo (int l1, int l2, int l3) {
		this.lado1 = l1;
		this.lado2 = l3;
		this.lado3 = l3;
	}
	
	public int getLado1 () {
		return lado1;
	
	}
	public int getLado2 () {
		return lado2;
		
	}
	public int getLado3 () {
		return lado3;
		
	}
	public void setLado1 (int l1) {
		this.lado1 = l1;
		
	}
	public void setLado2 (int l2) {
		this.lado2 = l2;
	
	}
	public void setLado3 (int l3) {
		this.lado3 = l3;
	
	}
	
	public String Perimetro () {
		return "Perímetro: " + (lado1 + lado2 + lado3);
	}
}
