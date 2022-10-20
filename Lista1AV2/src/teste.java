
import java.util.ArrayList;
import java.util.List;

public class teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Livro>livros = new ArrayList<>();
		
		//Aluno
		Aluno aluno1 = new Aluno("2218025","Helder Andrade","helderandrade@edu.unifor.br","(85) 9 9773-4225","ADS","Noite");
		Aluno aluno2 = new Aluno("2216969","Yudi Tamashiro","japonesqvaidaps3@edu.unifor.br", "4002-8922","Teatro","Manhã");
		
		//Professor
		Professor prof1 = new Professor("46316436416315","Leandro Taddeo","leandrotaddeo@unifor.br","99998888","Mestre");
		
		//Livros
		Livro altoDaCompadecida = new Livro("69420","Alto da compadecida","Suassuna",2000,1);
		Livro otelo = new Livro("69696","Otelo","W Shakespeare",1604,1);
		
		Livro mochileiro = new Livro("42424","Guia Do Mochileiro das Galaxias Completo","Douglas Adams",2020,1);
		Livro metamorfose = new Livro("0002","A Metamorfose","Franz Kafka",1915,1);
		Livro overedito = new Livro("0001","O Veredito","Franz Kafka",1913,1);
		
		livros.add(mochileiro);
		livros.add(otelo);
		livros.add(altoDaCompadecida);
		livros.add(metamorfose);
		livros.add(overedito);
		
		System.out.println("----- Iniciando testes com alunos -----");
		
		aluno1.mostrarLivrosAlugados();
		aluno2.mostrarLivrosAlugados();
		
		System.out.println("Alugando livros....");
		
		aluno1.alugar(overedito);
		aluno2.alugar(otelo);
		
		for(Livro item : livros){
            System.out.println(item.getTitulo() + " " + (item.isAlugado() ? "Alugado por: " + (item.getQuemAlugouPorUltimo().getNome()) + " prazo: " + item.getPrazo() + " dias" : "Nao alugado"));
        }
		
		System.out.println("Devolvendo livros...");
		
		System.out.println(aluno1.devolver(overedito));
		System.out.println(aluno2.devolver(otelo));
		
		for(Livro item : livros){
            System.out.println(item.getTitulo() + " " + (item.isAlugado() ? "Alugado por: " + (item.getQuemAlugouPorUltimo().getNome()) + " prazo: " + item.getPrazo() + " dias" : "Nao alugado"));
        }
	
		System.out.println("----- Encerrando testes com alunos -----");
		
		
		System.out.println("----- Iniciando testes com professores -----");
		
		
		System.out.println("Alugando livros....");
		
		
		
		prof1.alugar(altoDaCompadecida);
		prof1.alugar(metamorfose);
		prof1.alugar(otelo);
		
	
		for(Livro item : livros){
            System.out.println(item.getTitulo() + " " + (item.isAlugado() ? "Alugado por: " + (item.getQuemAlugouPorUltimo().getNome()) + " prazo: " + item.getPrazo() + " dias" : "Nao alugado"));
        }
		
		
		System.out.println("Devolvendo livros...");
		
		
		prof1.devolver(otelo);
		prof1.devolver(metamorfose);
		prof1.devolver(altoDaCompadecida);
		
		for(Livro item : livros){
            System.out.println(item.getTitulo() + " " + (item.isAlugado() ? "Alugado por: " + (item.getQuemAlugouPorUltimo().getNome()) + " prazo: " + item.getPrazo() + " dias" : "Nao alugado"));
        }
	
		System.out.println("----- Encerrando testes com professores -----");
		
		
		
		
		
		
		
		
	
	}

}
