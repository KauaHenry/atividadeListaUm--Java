package atividade;
public class Pessoa {
	private String nome;
	private int idade;
	private double altura;
	public Pessoa(String n, int i, double a) {
		this.nome = n;
		this.idade = i;
		this.altura = a;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
					
	}
	
	public String toString() {
		return "Nome: "+ getNome() + "\nIdade: " + getIdade() + "\nAltura " + getAltura() ;
	}
	
}

package atividade;
public class Main {
	public static void main(String [] args) {
		Pessoa a = new Pessoa ("Kaua", 17, 1.72);
		
		System.out.println(a.toString());
	}
}
