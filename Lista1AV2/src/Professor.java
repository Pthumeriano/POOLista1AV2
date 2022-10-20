

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
	
	public boolean podeAlugar() {
		int qtdAlugados = 0;
		for(int i=0; i<livros.length; i++) {
			if(livros[i] != null) {
				qtdAlugados++;
			}
		}
		return qtdAlugados < 3;
	}
	
	public String alugar(Livro livro) {
		
		if(livro.isAlugado()) {
			return "O livro ja esta alugado";
		}
		
		livro.setQuemAlugouPorUltimo(this);
		livro.setAlugado(true);
		
		
		if(!podeAlugar()) {
			return "Você não pode alugar mais de 3 livros";
		}
		
		for(int i=0; i<livros.length;i++) {
			if(livros[i] == null) {
				livros[i] = livro;
				break;
			}
		}
		
		return "Você alugou o livro " + livro.getTitulo() + " com sucesso";
	}
	
	public String devolver(Livro livro) {
		
		if(livro.getQuemAlugouPorUltimo().getMatricula() != this.getMatricula()) {
			return "Voce nao esta com esse livro";
		}
		
		livro.setAlugado(false);
		
		for(int i=0; i<livros.length;i++) {
			if(livros[i] == livro) {
				livros[i] = null;
				break;
			}
		}
		livro.redefinirPrazo();
		return "Voce devolveu o livro " + livro.getTitulo() + " com sucesso";
		
	}
	
	public void mostrarLivrosAlugados() {
		int qtd = 0;
		System.out.println("Livros alugados por: " + this.getNome());
		for(int i=0; i<livros.length; i++) {
			if(livros[i] != null) {
				System.out.println("Titulo: " + livros[i].getTitulo());
				System.out.println("Codigo: " + livros[i].getCodigo());
				System.out.println("Prazo de entrega: " + livros[i].getPrazo() + " dias");
			}
		}
		for(int i=0; i<3; i++) {
			if(livros[i] != null) {
				qtd++;
			}
		}
		
		if(qtd==0) {
			System.out.println("NENHUM");
		}
	}

}
