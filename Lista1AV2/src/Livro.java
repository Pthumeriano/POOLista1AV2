import java.util.Date;

public class Livro {
	
	private String codigo;
	private String titulo;
	private String autor;
	private int prazo;
	
	public String getTitulo() {
		return titulo;
	}


	private int anoPublicacao;
	private int edicao;
	private boolean alugado;
	private Pessoa quemAlugouPorUltimo;
	
	
	public Livro(String codigo, String titulo, String autor, int anoPublicacao, int edicao){
		
		this.codigo = codigo;
		this.titulo = titulo;
		this.autor = autor;
		this.anoPublicacao = anoPublicacao;
		this.edicao = edicao;
		this.alugado = false;
		
	}
	
	public void redefinirPrazo() {
		this.prazo = -1;
	}
	
	public boolean estaAlugado() {
		return this.alugado;
	}
	
	public void foiAlugado() {
		this.alugado = !alugado;
	}

	public Pessoa getQuemAlugouPorUltimo() {
		return quemAlugouPorUltimo;
	}

	public void setQuemAlugouPorUltimo(Pessoa quemAlugouPorUltimo) {
		this.quemAlugouPorUltimo = quemAlugouPorUltimo;
		if(quemAlugouPorUltimo.getClass().getSimpleName()=="Prfoessor") {
			this.prazo = 30;
		}else {
			this.prazo = 10;
		}
	}
	
	
	
	
}
