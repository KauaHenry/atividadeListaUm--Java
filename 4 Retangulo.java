package atividade;
public class Retangulo {
	private double base;
	private double altura;
	public Retangulo (double b, double a) {
		this.base= b;
		this.altura = a;
		
	}
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double area () {
		return (this.base* this.altura);
	}
	
	public double perimetro () {
		return (this.base *2) + (this.altura * 2);
	}
}

