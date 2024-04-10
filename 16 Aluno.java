public class Aluno {
	private String nome;
	private String matricula;
	private String curso;
	public Aluno ( String n, String m, String c) {
		this.nome = m;
		this.matricula = m;
		this.curso = c;
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}

}
