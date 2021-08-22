import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AlunoDb {
	private Connection conn = null;

	public AlunoDb() {
		
	}
	
	public void pesquisarPorString(String string) {
		try {
			
			this.conn = Conexao.getConexao();
			Statement statement = this.conn.createStatement();
			ResultSet rs = statement.executeQuery("SELECT * FROM Aluno WHERE nome like '%" + string + "%'");

			Aluno aluno = new Aluno();

			while (rs.next()) {
				aluno.codigo = rs.getInt("codigo");
				aluno.nome = rs.getString("nome");
				System.out.println(aluno.codigo + " - " + aluno.nome);
			}

		} catch (SQLException e) {
			System.out.println("Erro ao tentar pesquisar: " + e.getMessage());
		} finally {
			if (this.conn != null) {
				try {
					this.conn.close();
				} catch (SQLException e) {
					System.out.println("Erro ao fechar conexão: " + e.getMessage());
				}
			}
		}
	}

	public void pesquisar(int codigo) {
		try {
			
			this.conn = Conexao.getConexao();
			Statement statement = this.conn.createStatement();
			ResultSet rs = statement.executeQuery("SELECT * FROM Aluno WHERE codigo = 1");

			Aluno aluno = new Aluno();

			while (rs.next()) {
				aluno.codigo = rs.getInt("codigo");
				aluno.nome = rs.getString("nome");
				System.out.println(aluno.codigo + " - " + aluno.nome);
			}

		} catch (SQLException e) {
			System.out.println("Erro ao tentar pesquisar: " + e.getMessage());
		} finally {
			if (this.conn != null) {
				try {
					this.conn.close();
				} catch (SQLException e) {
					System.out.println("Erro ao fechar conexão: " + e.getMessage());
				}
			}
		}
	}
	
	public void criarVarios(Aluno[] alunos) {
		for(int i =0; i < 5; i++) {
			Aluno al = new Aluno();
			al.nome = alunos[i].nome;
			al.codTur = alunos[i].codTur;
			this.criar(al);
		}
	}
	
	public void deletar(int codigo) {
		try {
			this.conn = Conexao.getConexao();
			Statement statement = this.conn.createStatement();
			statement.executeUpdate("DELETE FROM Aluno WHERE codigo ="+codigo+"");
			System.out.println( " deletado com sucesso ");

		} catch (SQLException e) {
			System.out.println("Erro ao tentar atualizar: " + e.getMessage());
		}
		finally {
			if (this.conn != null) {
				try {
					this.conn.close();
				} catch (SQLException e) {
					System.out.println("Erro ao fechar conexão: " + e.getMessage());
				}
			}
		}

	}

	public void atualizar(Aluno aluno, int codigo) {
		try {
			this.conn = Conexao.getConexao();
			Statement statement = this.conn.createStatement();
			statement.executeUpdate("UPDATE Aluno SET nome = '"+aluno.nome+"' WHERE codigo = " + codigo);
			System.out.println(aluno.nome + " atualizado com sucesso ");

		} catch (SQLException e) {
			System.out.println("Erro ao tentar atualizar: " + e.getMessage());
		}
		finally {
			if (this.conn != null) {
				try {
					this.conn.close();
				} catch (SQLException e) {
					System.out.println("Erro ao fechar conexão: " + e.getMessage());
				}
			}
		}

	}
	
	public void criar(Aluno aluno) {
		try {
			this.conn = Conexao.getConexao();
			Statement statement = this.conn.createStatement();
			statement.executeUpdate(
					"INSERT INTO Aluno (nome, codTur) VALUES('" + aluno.nome + "', " + aluno.codTur + ")");
			System.out.println(aluno.nome + " inserido com sucesso ");

		} catch (SQLException e) {
			System.out.println("Erro ao tentar salvar: " + e.getMessage());
		}
		finally {
			if (this.conn != null) {
				try {
					this.conn.close();
				} catch (SQLException e) {
					System.out.println("Erro ao fechar conexão: " + e.getMessage());
				}
			}
		}

	}
	
}
