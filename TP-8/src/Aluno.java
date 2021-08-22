
public class Aluno {
	
	public int codigo;
	public String nome;
	public int codTur;
	
	public Aluno(String nome, int codTur) {
		this.nome = nome;
		this.codTur = codTur;
	}
	
	public Aluno() {
		
	}
	
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCodTur() {
		return codTur;
	}
	public void setCodTur(int codTur) {
		this.codTur = codTur;
	}

}
