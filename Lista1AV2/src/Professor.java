
public class Professor extends Pessoa{
	
	private String titulacao;
	private Livro[] livros = new Livro[5];

	public String getTitulacao() {
		return titulacao;
	}

	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}
	
	public Professor(String matricula, String nome, String email, String telefone, String titulacao) {
		super(matricula,nome,email,telefone);
		this.titulacao = titulacao;
	}

}
