package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CriacaoBanco {
	
	public static void main(String[] args) throws SQLException {
		

		final String url =  "jdbc:mysql://localhost:3306?"
				+ "verifyServerCertificate=false&useSSL=true";
		final String usuario = "root";
		final String senha = "12345678";
		
		Connection conexao = DriverManager.
				getConnection(url, usuario,senha);
		
		System.out.println("Conexao realizada com sucesso!");
		
		Statement stmt = conexao.createStatement();
		
	stmt.execute ("create DATABASE IF NOT EXISTS primeiraDataBase");
	
	System.out.println("BAse de dados criada com sucesso");
	
	
		
		conexao.close();
	
	}

}
