package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class criarTabela {
	
	public static void main(String[] args) throws SQLException {
		
		Connection conectar = Conexao.getConexao();
	
	String sql = "CREATE TABLE CADASTRO ("
			+ "codigo INT AUTO_INCREMENT PRIMARY KEY,"
			+ "nome VARCHAR(80) NOT NULL"
			+ ")";
	
	Statement stmt =  conectar.createStatement();
	
	stmt.execute(sql);
	
	
	System.out.println("Tabela criada com sucesso!");
	
	conectar.close();
	

		
		
	}
	
	
	
	

}
