
public class teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Aluno
		Aluno aluno1 = new Aluno("2218025","Helder Andrade","helderandrade@edu.unifor.br","(85) 9 9773-4225","ADS","Noite");
		
		//Professor
		//Professor prof1 = new Professor();
		
		
		//Livros
		Livro altoDaCompadecida = new Livro("69420","Alto da compadecida","Suassuna",2000,1);
		
		System.out.println(aluno1.alugar(altoDaCompadecida));
		aluno1.mostrarLivrosAlugados();
		System.out.println(aluno1.devolver(altoDaCompadecida));
		aluno1.mostrarLivrosAlugados();		
		
	}

}
