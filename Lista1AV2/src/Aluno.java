
public class Aluno extends Pessoa{
	
	private String curso;
	private String turno;
	private Livro[] livros = new Livro[3];
	
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public String getTurno() {
		return turno;
	}
	public void setTurno(String turno) {
		this.turno = turno;
	}
	
	public Aluno(String matricula, String nome, String email, String telefone, String curso, String turno) {
		super(matricula,nome,email,telefone);
		this.curso = curso;
		this.turno = turno;
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
		livro.setQuemAlugouPorUltimo(this);
		livro.foiAlugado();
		
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
		if(livro.estaAlugado()) {
			livro.foiAlugado();
		}else {
			return "ERR";
		}
		
		for(int i=0; i<livros.length;i++) {
			if(livros[i] == livro) {
				livros[i] = null;
				break;
			}
		}
		livro.redefinirPrazo();
		return "Você devolveu o livro " + livro.getTitulo() + " com sucesso";
	}
	
	public void mostrarLivrosAlugados() {
		System.out.println("Livros alugados:");
		for(int i=0; i<livros.length; i++) {
			if(livros[i] != null) {
				System.out.println("Titulo: " + livros[i].getTitulo());
			}
		}
	}
	
	

}
