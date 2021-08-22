import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	private static Connection conexao;
	
	public Conexao(){
		conexao = null;
	}

	public static Connection getConexao() {

		try {
			// create a database connection				
				conexao = DriverManager.getConnection("jdbc:sqlite:C:/Users/letic/eclipse-workspace/TP-8/tp-8.db");
			
			// conexao =
			// DriverManager.getConnection("jdbc:sqlite:C:/Users/fatimapinheiro/ProjetoExemploBD/testJDBC.db");

		} catch (SQLException e) {
			System.out.println("Erro ao conectar no banco de dados :" + e.getMessage());
		}
		
		return conexao;
	}
	
	
	 public static void fecharConexao(){
	        try
	        {
	          if(conexao != null) {	        	  
	        	  conexao.close();
	          }
	        }
	        catch(SQLException e)
	        {
	        	System.out.println("Erro ao tentar fechar conexao :" + e.getMessage());
	        }
	    }

}
