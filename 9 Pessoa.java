public class Pessoa {
	private String nome;
	private String cpf;
	private Data dataNascimento;
	
	public Pessoa (String n, String c, Data d) {
		this.nome = n;
		this.cpf = c;
		this.dataNascimento = d;
	}
	public String getNome () {
		return nome;
		
	}
	public String getCpf () { 
		return cpf;
		
	}
	public Data getDataNascimento () {
		return dataNascimento;
	}
	
	public void setNome (String n) {
		this.nome = n;
		
	}
	public void setCpf (String c) {
		this.cpf = c;
		
	}
	
	public void setDataNascimento (Data d) {
		this.dataNascimento = d;
		
	}
	
	public String print () {
		return "Nome: " + nome + "\nCPF: " + cpf + "\nData de Nascimento: " + dataNascimento.print();
	}
	
}
