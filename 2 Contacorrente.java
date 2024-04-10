package atividade;
public class ContaCorrente {
	private int numeroDaConta;
	private double saldo;
	
	public ContaCorrente(int n, double s) {
		this.numeroDaConta = n;
		this.saldo = s;
		
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void Deposita(double v) {
		this.saldo += v;
	}
	
	public void Sacar(double sa) {
		this.saldo -= sa;
	}
	
	public String toString () {
		return "Número da Conta: " + numeroDaConta + "\nSaldo: R$" + saldo ;
	}
}


package atividade;
public class Main {
	public static void main(String [] args) {
		ContaCorrente a = new ContaCorrente (221, 100);
		
		System.out.println(a.toString());
	}
}
