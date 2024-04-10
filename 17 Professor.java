public class Professor {
	private String nome;
	private String departamento;
	private String titulacao;
	public Professor ( String n, String d, String t) {
		this.nome = n;
		this.departamento = d;
		this.titulacao = t;
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public String getTitulacao() {
		return titulacao;
	}
	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}
}	
