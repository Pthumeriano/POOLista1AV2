import java.util.Date;

public class Livro {
	
	private String codigo;
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getPrazo() {
		return prazo;
	}

	public void setPrazo(int prazo) {
		this.prazo = prazo;
	}

	public int getAnoPublicacao() {
		return anoPublicacao;
	}

	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}

	public int getEdicao() {
		return edicao;
	}

	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}

	public boolean isAlugado() {
		return alugado;
	}

	public void setAlugado(boolean alugado) {
		this.alugado = alugado;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


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
	
	public Pessoa getQuemAlugouPorUltimo() {
		return quemAlugouPorUltimo;
	}

	public void setQuemAlugouPorUltimo(Pessoa quemAlugouPorUltimo) {
		this.quemAlugouPorUltimo = quemAlugouPorUltimo;
		if(quemAlugouPorUltimo.getClass().getSimpleName()=="Professor") {
			this.prazo = 30;
		}else {
			this.prazo = 10;
		}
	}
	
	
	
	
}
