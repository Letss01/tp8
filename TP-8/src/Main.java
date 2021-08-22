
public class Main {

	public static void main(String[] args) {
		
		Aluno[] alunos = new Aluno[5];
		
		alunos[0] = new Aluno("fulano", 1);
		alunos[1] = new Aluno("beltrano", 2);
		alunos[2] = new Aluno("sicrano", 1);
		alunos[3] = new Aluno("maria", 1);
		alunos[4] = new Aluno("jose", 2);
		

//		 Aluno aluno = new Aluno();
//		 aluno.nome = "francisco";
//		 aluno.codTur = 1;
		 
		 AlunoDb alunodb = new AlunoDb();
		// alunodb.pesquisar(1);
		 //alunodb.criar(aluno);
		 
		 //aluno.nome = "maria";
		 //alunodb.atualizar(aluno, 3);
		 
		 //alunodb.deletar(5);
		 
		 //alunodb.criarVarios(alunos);
		 alunodb.pesquisarPorString("a");

	}

}
